package com.javalearning;

public class Main {

    public static void main(String[] args) {

        String myString = "this is a string";
        System.out.println("myString: " + myString);
        System.out.println("myString: "+ myString + " "+ '\u00A9' + " 2017");

        String myNumberString = "250.5";
        myNumberString = myNumberString + "4.5";
        System.out.println("myNumberString: "+myNumberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString: "+lastString);

        double doubleNumber = 23.45;
        System.out.println("lastString: " +lastString + doubleNumber);

    }
}
