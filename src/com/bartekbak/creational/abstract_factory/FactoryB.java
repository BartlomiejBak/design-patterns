package com.bartekbak.creational.abstract_factory;

public class FactoryB implements IFactory {
    @Override
    public IProductA getProductA() {
        return new ProductAVersionB();
    }

    @Override
    public IProductB getProductB() {
        return new ProductBVersionB();
    }
}
