package com.allysoftsolutions.sqlitetest.repo;

import com.allysoftsolutions.sqlitetest.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
}
