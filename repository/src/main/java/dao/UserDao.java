package dao;

import entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao {

    private SessionFactory factory;

    public UserDao() {
        this.factory = new Configuration().configure().buildSessionFactory();
    }

    public User loginValidation(String username, String password) {
        Session session = factory.openSession();
        Transaction tx = null;

        User userCheck = new User();

        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM User WHERE username = :username AND password = :password");
            query.setParameter("username", username);
            query.setParameter("password", password);
            List user = query.list();

            if (!user.isEmpty()) {
                userCheck = (User) user.get(0);
            } else {
                System.out.println("Not a valid login!");
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return userCheck;
    }

    public User addUser(User user) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {

            tx = session.beginTransaction();
            int id = (Integer) session.save(user);
            user.setId(id);
            tx.commit();

        } catch (HibernateException e) {

            if (tx != null) tx.rollback();
            e.printStackTrace();

        } finally {
            session.close();
        }
        return user;
    }

    public User getUser(String username) {
        Session session = factory.openSession();
        Transaction tx = null;
        User userr = null;

        try {

            tx = session.beginTransaction();
            Query query = session.createQuery("FROM User WHERE username = :username");
            query.setParameter("username", username);
            if (query.list().size() != 0) {
                userr = (User) query.list().get(0);
            }

            tx.commit();

        } catch (HibernateException e) {

            if (tx != null) tx.rollback();
            e.printStackTrace();

        } finally {
            session.close();
        }

        return userr;

    }

    public User getUserById(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        User user = null;

        try {
            tx = session.beginTransaction();
            user = session.get(User.class, id);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
}

