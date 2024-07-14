package com.gmail.itisha65.homework121.car;

import java.util.Scanner;

public class Car {
    public void start(int fuelLevel) {
        if (fuelLevel > 5) {
            startCommand();
            starFuelSystem();
            startElectric();
        } else {
            stopEngine();
        }
    }

    private void startElectric() {
        System.out.println("Electric is started");

    }

    private void startCommand() {
        System.out.println("Command start");
    }

    private void starFuelSystem() {
        System.out.println("Fuel system is started");
    }

    private void stopEngine() {
        System.out.println("To low fuel level");
        System.out.println("The engine will not started!");
    }
}

class CarStart {
    public static void main(String[] args) {
        Car newCar = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check fuel level");
        newCar.start(scanner.nextInt());
    }
}
