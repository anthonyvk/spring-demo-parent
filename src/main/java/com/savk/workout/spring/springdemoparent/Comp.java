package com.savk.workout.spring.springdemoparent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Comp {
    @Autowired
    private AccessAPI accessAPI;

    @PostConstruct
    void call() {
        accessAPI.call();
    }
}
