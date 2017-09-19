package com.javalearning;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();



        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters <0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);

        // 1 inch = 2.54cm  and one foot = 12 inches

    }
    public static double calcInchesToCentimeters(int inches){
        return inches*2.54;

    }
    public static int calcFeetToInches(int feet){
        return feet*12;
    }
    public static int calcInchesToFeet(int inches){
        return inches/12;
    }
    public static int calcRemainingInches(int inches){
        return inches%12;
    }


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        //double centimeters = (feet * 12) * 2.54;
        //double centimeters = calcInchesToCentimeters(calcFeetToInches(feet));
        //centimeters += inches * 2.54;
        //centimeters  += calcInchesToCentimeters(inches);
        double centimeters  = calcInchesToCentimeters(calcFeetToInches(feet)) + calcInchesToCentimeters(inches);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if(inches < 0) {
            return -1;
        }

        //int feet = inches / 12;
        //int remainingInches = inches % 12;
        System.out.println(inches + " inches is equal to " + calcFeetToInches(inches) + " feet and " + calcRemainingInches(inches) + " inches");
        return calcFeetAndInchesToCentimeters(calcInchesToFeet(inches), calcRemainingInches(inches));
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }



}
