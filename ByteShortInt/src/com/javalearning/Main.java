package com.javalearning;

public class Main {

    public static void main(String[] args) {

        //int is 32 bits values from -2147483648 to 2147483647  max:(2^31 -1)
        int myMinValue = -2147483648;
        int myMaxValue = 2_147_483_647;

        //byte is 8 bits values from -128 to 127  max:(2^7 -1)
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        //short is 16 bits values from -32768 to 32767  max:(2^15 -1)
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        //long is 64 bits values from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807  max:(2^63 -1)
        long myMaxLongValue = (2_147_483_648L * 2_147_483_648L * 2) - 1; //9_223_372_036_854_775_807
        long myMinLongValue = -9223372036854775808L;
        System.out.println(myMinLongValue);

        //int is the default for expression computations, we need to do casting of the int to byte if variable is of type byte
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("myNewByteValue: " + myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("myNewShortValue: " + myNewShortValue);

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myInt); //no casting needed since long variable can easily hold an int
        short myNewShort = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("myLong: " + myLong);
        System.out.println("myNewShort: "+myNewShort);
    }
}
