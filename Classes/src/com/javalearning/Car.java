package com.javalearning;

public class Car {

    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String engine;
    private String colour;

    public Car(int doors, int wheels, String make, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public Car() {
        this.make = "Audi";

    }

    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        String validMake = make.toLowerCase();
        if (validMake.equals("bmw") || validMake.equals("ferrari")) {
            this.make = make;
        } else {
            this.make = "Unknown";
        }
    }
}
