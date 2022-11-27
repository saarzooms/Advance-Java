package caching_test;

import org.example.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CachingTest {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session session = sf.openSession();
        Subject s1 = session.get(Subject.class, 103);
        System.out.println(s1.getName());
        System.out.println("Some process !!!!");
//        Subject s2 = session.get(Subject.class, 103);
//        System.out.println(s2.getName());
        session.close();
        Session session2 =  sf.openSession();
        Subject s2 = session2.get(Subject.class,103);
        System.out.println(s2.getName());
        session2.close();
        sf.close();
    }
}
