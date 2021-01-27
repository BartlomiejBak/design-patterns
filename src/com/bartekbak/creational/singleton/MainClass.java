package com.bartekbak.creational.singleton;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass firstSingleton = SingletonClass.getInstance();
        SingletonClass secondSingleton = SingletonClass.getInstance();

        System.out.println(firstSingleton == secondSingleton);
    }
}
