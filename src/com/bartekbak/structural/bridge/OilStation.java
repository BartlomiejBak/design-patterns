package com.bartekbak.structural.bridge;

public class OilStation implements FuelStation {
    private Vehicle vehicle;

    public OilStation(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void refuel() {
        this.vehicle.refuel("Fill tank");
    }
}
