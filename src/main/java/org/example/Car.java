package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    public void drive(){
        System.out.println("car will carry only 4 people at a time");
    }
}
