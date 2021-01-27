package com.bartekbak.behavioral.strategy;

public class Client {
    IFirstMethodStrategy firstMethodStrategy;
    ISecondMethodStrategy secondMethodStrategy;

    public Client(IFirstMethodStrategy firstMethodStrategy, ISecondMethodStrategy secondMethodStrategy) {
        this.firstMethodStrategy = firstMethodStrategy;
        this.secondMethodStrategy = secondMethodStrategy;
    }

    void printSomething(){
        this.firstMethodStrategy.printSomething();
    }

    void doSomething(){
        this.secondMethodStrategy.doSomething();
    }
}
