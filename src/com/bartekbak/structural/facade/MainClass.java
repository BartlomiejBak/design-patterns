package com.bartekbak.structural.facade;

public class MainClass {
    public static void main(String[] args) {
        Facade facade = new Facade(new MethodA(), new MethodB(), new MethodC());
        facade.useTwo();
        facade.useThree();
    }
}
