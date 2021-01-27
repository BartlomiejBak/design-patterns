package com.bartekbak.creational.builder;

public class Home {
    private final int floors;
    private final int rooms;
    private final double height;
    private final String roof;
    private final boolean basement;

    public Home(int floors, int rooms, double height, String roof, boolean basement) {
        this.floors = floors;
        this.rooms = rooms;
        this.height = height;
        this.roof = roof;
        this.basement = basement;
    }
}
