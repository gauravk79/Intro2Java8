package com.javalearning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car myCar1 = new Car();
        myCar1.setMake("BMW");
        Car myCar2 = new Car();
        myCar2.setMake("Toyota");

        System.out.println("myCar1 make is: " + myCar1.getMake());
        System.out.println("myCar2 make is: " + myCar2.getMake());
    }
}
