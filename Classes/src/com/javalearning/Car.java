package com.javalearning;

public class Car {

    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String engine;
    private String color;

    public Car(int doors, int wheels, String make, String model, String engine, String color) {
        System.out.println("Constructor with parameters called!");
        this.doors = doors;
        this.wheels = wheels;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public Car() {
        this(2,4,"Audi","Rx8","v6","red");

    }

    public Car(String make, String model, String engine, String color) {
        this(4,4,make,model,engine,color);
    }

    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
