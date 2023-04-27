package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    protected int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(){    }
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
    }
}
