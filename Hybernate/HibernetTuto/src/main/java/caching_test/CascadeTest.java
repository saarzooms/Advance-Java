package caching_test;

import org.example.Department;
import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadeTest {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Student s1 = new Student();
        s1.setName("Aagaz");
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setName("Vijay");
        s2.setGender("Male");

        Department dept = new Department();
        dept.setName("ICT");

        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        dept.setStudent(students);
        Session session = sf.openSession();
        session.save(dept);
        session.close();
        sf.close();
    }
}
