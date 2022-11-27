package com.allysoftsolutions.microservices.FirstSPTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    private Person p;

    public Test(Person p) {
        this.p = p;
    }

    public Test() {
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String displayInfo(){
       return  p.displayInfo();
    }
}
