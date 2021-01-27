package com.bartekbak.creational.builder;

public class HomeBuilder {
    private int floors;
    private int rooms;
    private double height;
    private String roof;
    private boolean basement;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public Home build() {
        return new Home(floors, rooms, height, roof, basement);
    }
}
