package com.bartekbak.structural.proxy;

public class Proxy implements ISubject {
    private RealSubject realSubject;

    @Override
    public String request() {
        if (realSubject == null) {
            this.realSubject = new RealSubject();
        }
        return this.realSubject.request();
    }


}
