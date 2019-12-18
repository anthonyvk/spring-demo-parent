package com.savk.workout.spring.springdemoparent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDemoParentApplication {

//    @Autowired
//    private AccessAPI accessAPI;

    public static void main(String[] args) {

        System.out.println("Yaya");
        SpringApplication.run(SpringDemoParentApplication.class, args);
    }

    /*@PostConstruct
    void exec() {
        System.out.println("Meow");
        accessAPI.call();
    }*/

}
