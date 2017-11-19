package com.javalearning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car myCar1 = new Car();
        myCar1.setMake("BMW");
        Car myCar2 = new Car();
        myCar2.setMake("Toyota");

        Car myCar3 = new Car();

        //print cars make
        System.out.println("myCar1 make is: " + myCar1.getMake());
        System.out.println("myCar2 make is: " + myCar2.getMake());
        System.out.println("myCar3 make is: " + myCar3.getMake());

        //print cars object
        System.out.println("myCar1 make is: " + myCar1);
        System.out.println("myCar2 make is: " + myCar2);
        System.out.println("myCar3 make is: " + myCar3);
    }
}
