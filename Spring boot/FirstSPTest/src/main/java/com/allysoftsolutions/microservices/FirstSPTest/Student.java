package com.allysoftsolutions.microservices.FirstSPTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student implements Person{
    private int id;
    private String name;
    private String enrollNo;
    private String addr;

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

    public String getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(String enrollNo) {
        this.enrollNo = enrollNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
//
//    @Override
//    public String toString() {
//        return this.getId()+" "+this.getName()+" "+this.getEnrollNo()+" "+this.getAddr();
//    }
    @Override
    public String displayInfo(){
        return "student info: "+this.getId()+" "+this.getName()+" "+this.getEnrollNo()+" "+this.getAddr();
    }
}
