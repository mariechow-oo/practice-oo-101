package com.oo101;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cool Car", 30);
        car.speedUp();
        Truck truck = new Truck("Big Truck", 10);
        truck.speedUp();
    }
}
