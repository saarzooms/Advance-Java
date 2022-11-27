package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!1" );
//        Configuration cfg =new Configuration();
//        cfg.configure("t.hibernate.cfg.xml");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Student student = new Student();
//        student.setId(11);
        student.setName("Raj");
        student.setGender("Male");
        Address address = new Address();
        address.setCity("Rajkot");
        address.setCountry("India");
        student.setAddress(address);
        student.setJoiningDate(new Date());
        Student student2 = new Student();
//        student.setId(11);
        student2.setName("Vraj");
        student2.setGender("Male");
        Address address2 = new Address();
        address2.setCity("Rajkot");
        address2.setCountry("India");
        student2.setAddress(address);
        student2.setJoiningDate(new Date());
        Student student1 = new Student();
//        student.setId(11);
        student1.setName("Yash");
        student1.setGender("Male");
        Address address1 = new Address();
        address1.setCity("Rajkot");
        address1.setCountry("India");
        student1.setAddress(address1);
        student1.setJoiningDate(new Date());
        Department department = new Department();
        department.setName("ICT");

        student.setDepartment(department);
        student1.setDepartment(department);
        student2.setDepartment(department);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        department.setStudent(studentList);
        //add image
        try {
            FileInputStream fs = new FileInputStream("src/main/resources/test.jpg");
            student.setMyImage(fs.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(student1);
        session.save(student2);
        session.save(department);
        session.getTransaction().commit();

//        Student stu = session.get(Student.class,20);
//        System.out.println(stu.getId());
//        System.out.println(stu.getName());

//        session.beginTransaction();
//        Student stu = session.get(Student.class, 7);
//        System.out.println(stu);
//        session.beginTransaction();
//        session.delete(stu);
//        session.getTransaction().commit();
//        Student s = new Student();

        session.close();
        factory.close();
        System.out.println("working");
    }
}
