package com.bartekbak.behavioral.observer;

import java.util.ArrayList;

public class Subject implements ISubject {

    //state is shown as a String only as example
    double price = 10;

    //that might be any iterable list or array
    ArrayList<IObserver> observers = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }


}
