package com.bartekbak.creational.builder;

public class MainClass {
    public static void main(String[] args) {
        Director director = new Director();
        HomeBuilder builder = new HomeBuilder();

        director.buildMansion(builder);
        Home firstHome = builder.build();

        director.buildSkyScrapper(builder);
        Home secondHome = builder.build();

    }
}
