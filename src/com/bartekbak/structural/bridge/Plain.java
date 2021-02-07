package com.bartekbak.structural.bridge;

public class Plain implements Vehicle {
    @Override
    public void run() {
        System.out.println("Fly");
    }

    @Override
    public void refuel(String refuel) {
        System.out.println(refuel);
    }
}
