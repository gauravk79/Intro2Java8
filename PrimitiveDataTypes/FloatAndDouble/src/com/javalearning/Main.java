package com.javalearning;

public class Main {

    public static void main(String[] args) {

        //float = 32 bits or 4 bytes (same as int)
        //double = 64 bits or 8 bytes (same as long)
        int myIntValue = 5 ;
        float myFloatValue = 5.25f;  //note the f
        double myDoubleValue = 5.25d; //note the d
        double myNewDoubleValue = 5.25; //note that d is not needed, as default is double
        float myNewFloatValue = (float)5.25; //casting also works, but its better to use f

        System.out.println("myIntValue: "+myIntValue);
        System.out.println("myFloatValue: "+myFloatValue);
        System.out.println("myDoubleValue: "+myDoubleValue);

        int myNewIntValue = 5 / 2;
        float myNewHalfFloatValue = myFloatValue / 3f;
        double myNewHalfDoubleValue = myDoubleValue / 3d;
        System.out.println("myNewIntValue: "+myNewIntValue);
        System.out.println("myNewHalfFloatValue: "+myNewHalfFloatValue);
        System.out.println("myNewHalfDoubleValue: "+myNewHalfDoubleValue);


        //understanding precisions
        myNewIntValue = 5 / 3;
        myNewFloatValue = 5f / 3f;
        myNewDoubleValue = 5d / 3d;
        System.out.println("myNewIntValue: "+myNewIntValue);
        System.out.println("myNewFloatValue: "+myNewFloatValue);  //float has 7 digits of precision after decimal
        System.out.println("myNewDoubleValue: "+myNewDoubleValue); //double has 16 digits of precision after decimal

        //its recommended to use double for math calculation. its more digits of precision and much faster on computers of 64 bit.


        //Convert given number of pounds to kilograms
        //1. create a variable to store pounds
        //2. create a variable to store the kg for the pounds in 1.
        //3. print result.
        //NOTE: 1 pound = 0.45359237

    }
}
