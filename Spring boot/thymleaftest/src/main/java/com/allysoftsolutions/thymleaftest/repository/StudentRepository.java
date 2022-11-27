package com.allysoftsolutions.thymleaftest.repository;

import com.allysoftsolutions.thymleaftest.beans.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}