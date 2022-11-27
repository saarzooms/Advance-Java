package com.allysoftsolutions.microservices.FirstSPTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpTestApplication.class, args);
		System.out.println("Running");

		Test t = context.getBean(Test.class);
		Person p = context.getBean(Person.class);
		t.setP(p);
		System.out.println(t.displayInfo());

	}

}
