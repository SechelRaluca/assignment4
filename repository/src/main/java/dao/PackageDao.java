package dao;

import entity.Packagee;
import entity.Route;
import entity.RoutePair;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

public class PackageDao {

    private SessionFactory factory;

    public PackageDao() {
        this.factory = new Configuration().configure().buildSessionFactory();
    }


    public List<Packagee> getClientPackages(int clientId) {
        Session session = factory.openSession();
        Transaction tx = null;
        List<Packagee> packages = null;

        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Packagee WHERE sender_id = :sender or receiver_id = :receiver");
            query.setParameter("sender", clientId);
            query.setParameter("receiver", clientId);
            packages = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

        return packages;
    }


    public Packagee getPackageByName(String name) {
        Session session = factory.openSession();
        Transaction tx = null;

        Packagee aPackage = new Packagee();

        try {

            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Packagee WHERE name = :name");
            query.setParameter("name", name);
            ;
            List result = query.list();

            if (!result.isEmpty()) {
                aPackage = (Packagee) result.get(0);
            }

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

        return aPackage;
    }

    public String getPackageStatus(String name) {
        Session session = factory.openSession();
        Transaction tx = null;

        Packagee aPackage = new Packagee();

        try {

            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Packagee WHERE name = :name");
            query.setParameter("name", name);

            List result = query.list();

            if (!result.isEmpty()) {
                aPackage = (Packagee) result.get(0);
            }

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        if (aPackage.isTracking())
            return "The package is tracked";
        else
            return "The package is untracked";
    }

    public List<RoutePair> getPackageRoute(String name) {
        Session session = factory.openSession();
        Transaction tx = null;

        Packagee aPackage = new Packagee();

        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Packagee WHERE name = :name");
            query.setParameter("name", name);
            List result = query.list();

            if (!result.isEmpty()) {
                aPackage = (Packagee) result.get(0);
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return aPackage.getRoute().getRoutePairs();
    }

    public Packagee addPackage(Packagee packagee) {
        int packageId;
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            packageId = (Integer) session.save(packagee);
            packagee.setId(packageId);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return packagee;
    }

    public void removePackage(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("DELETE FROM Packagee WHERE id= :id");
            query.setParameter("id", id);
            query.executeUpdate();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void registerPackage(int routeId) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        Query query = session.createSQLQuery("update Packagee set route_id = :route_id, "
                + "tracking =:tracking");
        query.setParameter("route_id", routeId);
        query.setParameter("tracking", true);
        query.executeUpdate();
        session.getTransaction().commit();
    }

    public Packagee updateStatus(RoutePair routePair, Packagee packagee) {
        Session session = factory.openSession();
        session.getTransaction().begin();

        Route route = packagee.getRoute();
        List<RoutePair> routePairs = route.getRoutePairs();
        routePair.setRoutes(Collections.singletonList(route));
        routePairs.add(routePair);
        route.setRoutePairs(routePairs);

        session.update(packagee);
        session.getTransaction().commit();
        return packagee;
    }

    public List<Packagee> getAllPackages() {
        Session session = factory.openSession();
        List packages = null;
        Transaction tx = null;

        try {

            tx = session.beginTransaction();
            packages = session.createQuery("FROM Packagee").list();
            tx.commit();

        } catch (HibernateException e) {

            if (tx != null) tx.rollback();
            e.printStackTrace();

        } finally {
            session.close();
        }

        return packages;
    }
}
