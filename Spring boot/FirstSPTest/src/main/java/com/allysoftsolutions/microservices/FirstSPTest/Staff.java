package com.allysoftsolutions.microservices.FirstSPTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Staff implements Person{
    private int id;
    private String name;
    private String staffNo;
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

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    @Override
    public String displayInfo(){
        return "staff info: "+this.getId()+" "+this.getName()+" "+this.getStaffNo()+" "+this.getAddr();
    }
}
