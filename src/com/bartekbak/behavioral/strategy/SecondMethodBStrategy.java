package com.bartekbak.behavioral.strategy;

public class SecondMethodBStrategy implements ISecondMethodStrategy {
    @Override
    public void doSomething() {
        System.out.println("This is a second method with com.company.behavioral.strategy 'B' - it prints value of pi number ");
        System.out.println("value of pi is " + Math.PI);
    }
}
