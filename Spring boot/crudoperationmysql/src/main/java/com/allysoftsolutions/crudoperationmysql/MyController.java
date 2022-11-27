package com.allysoftsolutions.crudoperationmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private StudentRepository stuRepo;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return stuRepo.findAll();
    }

    @PostMapping("/addstudent")
    public Student saveStudent(@RequestBody Student stu){
        return stuRepo.save(stu);
    }

    @RequestMapping(method=RequestMethod.GET, value = "/{id}")
    public Student getById(@PathVariable String id){

        int sid = Integer.parseInt(id);
        System.out.println("find studnet witn id "+id);
        return stuRepo.getById(sid);

    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable String id){
        int sid = Integer.parseInt(id);
        System.out.println("find studnet witn id "+id);
        stuRepo.deleteById(sid);
    }


}
