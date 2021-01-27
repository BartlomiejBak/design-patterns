package com.bartekbak.behavioral.strategy;

public class FirstMethodAStrategy implements IFirstMethodStrategy {
    @Override
    public void printSomething() {
        System.out.println("This is a first method with com.company.behavioral.strategy 'A' ");
    }
}
