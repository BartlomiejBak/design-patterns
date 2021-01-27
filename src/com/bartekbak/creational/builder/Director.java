package com.bartekbak.creational.builder;

import java.util.Locale;

public class Director {

    public void buildMansion(HomeBuilder builder) {
        builder.setBasement(true);
        builder.setFloors(2);
        builder.setHeight(10.0);
        builder.setRoof("flat");
        builder.setRooms(14);
    }

    public void buildSkyScrapper(HomeBuilder builder) {
        builder.setBasement(true);
        builder.setFloors(150);
        builder.setHeight(410.0);
        builder.setRoof("pointy");
        builder.setRooms(1500);
    }
}
