package com.bartekbak.structural.facade;

public class Facade {
    private final MethodA methodA;
    private final MethodB methodB;
    private final MethodC methodC;

    public Facade(MethodA methodA, MethodB methodB, MethodC methodC) {
        this.methodA = methodA;
        this.methodB = methodB;
        this.methodC = methodC;
    }

    public void useTwo() {
        methodA.useMethod();
        methodB.useMethod();
    }

    public void useThree() {
        methodA.useMethod();
        methodB.useMethod();
        methodC.useMethod();
    }
}
