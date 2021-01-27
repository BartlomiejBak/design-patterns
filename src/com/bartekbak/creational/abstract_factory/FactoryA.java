package com.bartekbak.creational.abstract_factory;

public class FactoryA implements IFactory {
    @Override
    public IProductA getProductA() {
        return new ProductAVersionA();
    }

    @Override
    public IProductB getProductB() {
        return new ProductBVersionA();
    }
}
