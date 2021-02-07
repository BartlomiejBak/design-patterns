package com.bartekbak.structural.bridge;

public class MainClass {
    public static void main(String[] args) {
        testVehicle(new Car());
        testVehicle(new Plain());
    }

    public static void testVehicle(Vehicle vehicle) {
        System.out.println("vehicle to test");
        FuelStation electric = new ElectricStation(vehicle);
        electric.refuel();
        vehicle.run();
        System.out.println();
        FuelStation oil = new OilStation(vehicle);
        oil.refuel();
        vehicle.run();
        System.out.println("-----------------------------------");
    }
}
