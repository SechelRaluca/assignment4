package dao;

import entity.Route;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class RouteDao {

    private SessionFactory factory;

    public RouteDao() {
        this.factory = new Configuration().configure().buildSessionFactory();
    }

    public List getAllRoutes() {

        Session session = factory.openSession();
        Transaction tx = null;

        List routes = null;

        try {

            tx = session.beginTransaction();
            routes = session.createQuery("FROM Route").list();
            tx.commit();

        } catch (HibernateException e) {

            if (tx != null) tx.rollback();
            e.printStackTrace();

        } finally {
            session.close();
        }

        return routes;
    }


    public Route findRouteById(int routeId) {

        Session session = factory.openSession();
        Transaction tx = null;

        Route route = new Route();

        try {

            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Route WHERE id = :routeId");
            query.setParameter("routeId", routeId);

            List result = query.list();

            if (!result.isEmpty()) {
                route = (Route) result.get(0);
            }

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return route;
    }
}

