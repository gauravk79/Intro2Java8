package com.javalearning;

public class Main {

    public static void main(String[] args) {

        Car myCar1 = new Car();
        myCar1.setMake("BMW");
        myCar1.setDoors(2);
        myCar1.setWheels(4);
        myCar1.setModel("330i");
        myCar1.setEngine("v6");
        myCar1.setColor("grey");

        System.out.println("myCar1 make is: " + myCar1.getMake());
        System.out.println("myCar1 is: " + myCar1);
        System.out.println();

        Car myCar2 = new Car(4,4,"Toyota", "SUV","V4", "black");
        System.out.println("myCar2 make is: " + myCar2.getMake());
        System.out.println("myCar2 is: " + myCar2);
        System.out.println();

        Car myCar3 = new Car();
        System.out.println("myCar3 make is: " + myCar3.getMake());
        System.out.println("myCar3 is: " + myCar3);

        Car myCar4 = new Car("Tesla","S","none/electric","white");
        System.out.println("myCar4 make is: " + myCar4.getMake());
        System.out.println("myCar4 doors are: " + myCar4.getDoors());
        System.out.println("myCar4 wheels are: " + myCar4.getWheels());
        System.out.println("myCar4 is: " + myCar4);
    }
}
