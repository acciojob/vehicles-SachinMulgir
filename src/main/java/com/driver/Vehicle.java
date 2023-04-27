package com.driver;

public class Vehicle {

    protected String name;
    protected int currentSpeed;
    private int currentDirection;

    public Vehicle(){
    }

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void steer(int direction){
        this.currentDirection += direction;
    }

    public void stop(){
        this.currentSpeed = 0;
    }
}
