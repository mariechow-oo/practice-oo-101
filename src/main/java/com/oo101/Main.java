package com.oo101;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cool Car", new Gasoline());
        Driver carDriver = new Driver(car);
        carDriver.speedUp();

        Truck truck = new Truck("Big Truck", 10);
        Driver truckDriver = new Driver(truck);
        truckDriver.speedUp();
    }
}
