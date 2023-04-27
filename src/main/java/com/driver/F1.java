package com.driver;

public class F1 extends Car {

    private String name;
    private boolean isManual;

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        this.name = name;
        this.isManual = isManual;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isManual() {
        return isManual;
    }

    @Override
    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void accelerate(int rate){
        int newSpeed = currentSpeed + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        currentSpeed = newSpeed;
        if(newSpeed == 0) {
            stop();
            super.gears = 1;
            //Stop the car, set gear as 1
        }
        else if( newSpeed > 0 && newSpeed <= 50) {
            super.gears = 1;
        }
        else if( newSpeed > 50 && newSpeed <= 100 ){
            super.gears = 2;
        }
        else if( newSpeed > 100 && newSpeed <= 150 ){
            super.gears = 3;
        }
        else if( newSpeed > 150 && newSpeed <= 200 ){
            super.gears = 4;
        }
        else if( newSpeed > 200 && newSpeed <= 250 ){
            super.gears = 5;
        }
        else{
            super.gears = 6;
        }
    }

}
