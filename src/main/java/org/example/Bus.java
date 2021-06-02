package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {

    public void drive() {

        System.out.println("bus can carru more than four number of people");

    }
}
