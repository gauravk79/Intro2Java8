package com.javalearning;

//Summary of operators: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//operator precedence: http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

public class Main {

    public static void main(String[] args) {

        // + operator for addition
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        // - operator for subtraction
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        // * operator for multiplication
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        // / operator for division
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        // % operator for remainder
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result is now " + result);

        // ++  operator for increment by 1

        result++;
        System.out.println("Result is now " + result);

        // -- operator for decrement by 1
        result--;
        System.out.println("Result is now " + result);

        // += operator means add to original variable, value on right and assign back
        result += 2;
        System.out.println("Result is now " + result);

        // *= operator means multiply to original variable, value on right and assign back
        result *= 10;
        System.out.println("Result is now " + result);

        // -= operator means subtract from original variable, value on right and assign back
        result -= 10;
        System.out.println("Result is now " + result);

        // /= operator means divide original variable with value on right and assign back
        result /= 10;
        System.out.println("Result is now " + result);

        // == operator for equality check
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is an alien!");

        // != operator means not equal
        if (isAlien != true)
            System.out.println("It is not an alien!");

        // <  operator for less than check
        int topScore = 82;
        if (topScore < 100)
            System.out.println("You got the high score!");

        // > operator for greater than check
        // && is AND operator, both conditions needs to be true
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        // || is OR operator, atleast one need to be true. If left condition is true, right condition is not even evaluated
        if (topScore > 90 || secondTopScore <= 90)
            System.out.println("One of these checks is true");

        // | operator is also OR, atleast one needs to be true. Both conditions, left and right of tis operator are evaluated.
        if ( secondTopScore <= 90 | topScore > 90)
            System.out.println("One of these checks is true");

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        int tot = isCar ? 10 : 20;

        if(wasCar)
            System.out.println("wasCar is true");
        System.out.println("tot = " + tot);

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.
        double first = 20d;
        double second = 80d;
        double totResult = (first + second) * 25;
        double remainder = totResult % 40;
        if (remainder <= 20d)
            System.out.println("Total was over the limit");

    }
}
