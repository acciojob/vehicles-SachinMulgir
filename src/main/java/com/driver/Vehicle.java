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

    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = getCurrentDirection( this.currentDirection, direction);
    }

    public void steer(int direction){
        this.currentDirection =  getCurrentDirection( this.currentDirection, direction);
    }

    public void stop(){
        this.currentSpeed = 0;
    }

    public int getCurrentDirection( int currentDirection, int direction){
        int dir = currentDirection + direction;
        return dir / 360;
    }

}
