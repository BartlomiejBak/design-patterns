package com.bartekbak.structural.bridge;

public class ElectricStation implements FuelStation {
    private Vehicle vehicle;

    public ElectricStation(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void refuel() {
        this.vehicle.refuel("Charge batteries");
    }
}
