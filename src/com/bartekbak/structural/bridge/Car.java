package com.bartekbak.structural.bridge;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Drive");
    }

    @Override
    public void refuel(String refuel) {
        System.out.println(refuel);
    }
}
