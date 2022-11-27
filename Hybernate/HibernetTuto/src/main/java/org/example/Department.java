package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="dept_details")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dept_id")
    private int id;
    @Column(name="dept_name",length = 50)
    private String name;
    @OneToMany(mappedBy = "department",fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    private List<Student> student;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Department() {
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
}
