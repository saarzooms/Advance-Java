package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="student_info")
public class StudentObject {
    @Id
    @Column(name="stu_id")
    private int id;
    @Column(name="stu_name")
    private String name;
    @ManyToMany
    @JoinTable(name="stu_sub_mapping",
            joinColumns = {@JoinColumn(name="stu_id")},
            inverseJoinColumns = {@JoinColumn(name="sub_id")}
    )
    private List<Subject> subjects;

    public StudentObject() {
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
