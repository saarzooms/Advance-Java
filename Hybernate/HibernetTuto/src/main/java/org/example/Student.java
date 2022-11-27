package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student_details")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(length = 50,name="student_name")
    private String name;
    @Column(length = 50)
    private String gender;

    @Temporal(value = TemporalType.DATE)
    @Column(name="joining_dt")
    private Date joiningDate;

    @Lob
    @Column(name="my_image")
    private byte[] myImage;

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public byte[] getMyImage() {
        return myImage;
    }

    public void setMyImage(byte[] myImage) {
        this.myImage = myImage;
    }

    private Address address;
    @ManyToOne
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getId()+" "+this.getName()+ " "+ this.getGender();
    }
}
