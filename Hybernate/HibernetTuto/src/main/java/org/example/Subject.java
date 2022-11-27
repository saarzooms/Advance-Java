package org.example;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="subject_details")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Subject {
    @Id
    @Column(name="sub_id")
    private int id;
    @Column(name="sub_name")
    private String name;
    @ManyToMany(mappedBy = "subjects")
    private List<StudentObject> students;

    public Subject() {
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

    public List<StudentObject> getStudents() {
        return students;
    }

    public void setStudents(List<StudentObject> students) {
        this.students = students;
    }
}
