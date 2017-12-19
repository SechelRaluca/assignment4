package dao;

import entity.Packagee;
import entity.Role;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class RoleDao {

    private SessionFactory factory;

    public RoleDao() {
        this.factory = new Configuration().configure().buildSessionFactory();
    }

    public Role findRoleById(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        List<Role> roles = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM Role WHERE id = :id");
            query.setParameter("id", id);
            roles = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return roles != null && !roles.isEmpty() ? roles.get(0) : null;
    }
}
