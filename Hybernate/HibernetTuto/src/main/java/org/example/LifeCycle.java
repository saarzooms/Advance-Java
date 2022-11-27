package org.example;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.QueryProducer;

import java.util.Arrays;
import java.util.List;

public class LifeCycle {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //update `subject_details` set sub_name = newvalue where id=val
//HQL
      // Criteria c = session.createCriteria(Subject.class);
//       Query q = session.createQuery("from Subject");
//       q.setFirstResult(1);
//       q.setMaxResults(2);
//        List<Subject> subs = q.list();
//        if(subs.size()>0){
//            for(Subject s: subs){
//                System.out.println(s.getId()+" "+s.getName());
//            }
//        }else{
//            System.out.println("No match found");
//        }
       NativeQuery q = session.createNativeQuery("select * from subject_details");
       List<Object[]> subs = q.list();
       for(Object[] s: subs)
           System.out.println(Arrays.deepToString(s));
//        System.out.println("Total rows updated "+r);

        tx.commit();
        session.close();

        sf.close();
    }
}
