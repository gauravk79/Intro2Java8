package com.javalearning;

public class Car {

    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String engine;
    private String colour;

    public Car() {

    }

    public void setMake(String make) {
        String validMake = make.toLowerCase();
        if(validMake.equals("bmw") || validMake.equals("ferrari")) {
            this.make = make;
        } else {
            this.make = "Unknown";
        }
    }

    public String getMake() {
        return this.make;
    }
}
