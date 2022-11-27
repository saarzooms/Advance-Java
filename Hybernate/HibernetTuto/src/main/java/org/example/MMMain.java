package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MMMain {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        //student object
        StudentObject s1 = new StudentObject();
        s1.setId(123);
        s1.setName("ABC");

        StudentObject s2 = new StudentObject();
        s2.setId(234);
        s2.setName("XYZ");

        //Subject
        Subject sub1 = new Subject();
        sub1.setId(100);
        sub1.setName("AJ");

        Subject sub2 = new Subject();
        sub2.setId(101);
        sub2.setName("ADBMS");

        List<Subject> s1_sub = new ArrayList<Subject>();
        s1_sub.add(sub1);
        s1_sub.add(sub2);
        List<Subject> s2_sub = new ArrayList<Subject>();
        s2_sub.add(sub1);

        List<StudentObject> sb1_s = new ArrayList<StudentObject>();
        sb1_s.add(s1);
        sb1_s.add(s2);
        List<StudentObject> sb2_s = new ArrayList<StudentObject>();
        sb2_s.add(s1);

        s1.setSubjects(s1_sub);
        s2.setSubjects(s2_sub);

        sub1.setStudents(sb1_s);
        sub2.setStudents(sb2_s);

        Session s = sf.openSession();
        Transaction tx  = s.beginTransaction();
        s.save(s1);
        s.save(s2);
        s.save(sub1);
        s.save(sub2);
        tx.commit();
        s.close();


        sf.close();
    }
}
