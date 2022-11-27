package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestLoading {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().
                configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Department dept = session.load(Department.class, 1);
        System.out.println("dept name "+dept.getName());
        //System.out.println("total student "+dept.getStudent().size());
        sessionFactory.close();
    }
}
