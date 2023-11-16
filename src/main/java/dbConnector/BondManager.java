package dbConnector;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import derivatives.Bond;

public class BondManager {

    public BondManager(){}

    public List<Bond> getBondById(String id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            List<Bond> result = session.createQuery( "select u from Bond u" , Bond.class).list();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
