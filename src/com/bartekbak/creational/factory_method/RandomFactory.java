package com.bartekbak.creational.factory_method;

public class RandomFactory implements IFactory {

    @Override
    public Product factoryMethod() {
        double randomValue = Math.random() * 3;
        if (randomValue > 2) {
            return new ProductOne();
        } else if (randomValue > 1) {
            return new ProductTwo();
        } else {
            return new ProductN();
        }
    }
}
