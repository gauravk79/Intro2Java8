package com.javalearning;

public class Assignment1 {
    public static void main(String[] args) {


        /*
         Part1:
          Using the single System.out.println below, replace <write answer code here> such that the output is the following 2 lines:
         \\*This is not
         a comment *\\
        */

        System.out.println("\\\\*This is not \na comment*\\\\");

        /*
        Part2:
        Demonstrate difference between operation && and & in an if/else statement
         */
        int x = 0;
        int y = 5;
        if (y >= 30 && y / x > 0) {
            System.out.println("y is bigger");

        } else {
            System.out.println("y is smaller");
        }
        /*
        Part3:
        Demonstrate difference between operation || and | in an if/else statement
         */

        int a = 0;
        int b = 5;
        if (b >= 3 || b / a > 0) {
            System.out.println("b is bigger");

        } else {
            System.out.println("b is smaller");
        }
        displayHighScorePosition("Peter",1500);
        displayHighScorePosition("Jen",900);
        displayHighScorePosition("Jack",400);
        displayHighScorePosition("James",50);
    }

        /*
        Part 4:
        Create a void method called displayHighScorePosition
        It should accept a players name as a parameter, and a 2nd parameter as a score in the high score table
        You should display the players name along with a message like " managed to get into position <x> on the high score table".

        Create a 2nd method called calculateHighScorePosition, which accepts one argument only, the player score
        This method should return an int with the following values:
        1 if the score is >=1000
        2 if the score is >=500 and < 1000
        3 if the score is >=100 and < 500
        4 in all other cases

        Use the above methods to display results for players:
        Peter who scored 1500,
        Jen who scored 900,
        Jack who scored 400,
        James who scored 50
         */
public static void displayHighScorePosition(String playerName, int score){
int position= calulateHighScorePosition(score);
    System.out.println(playerName + " managed to get into position " + position);
}
public static int calulateHighScorePosition(int playerScore){
    if(playerScore>=1000){
        return 1;
    }else if(playerScore>=500 && playerScore<1000){
        return 2;
    }else if(playerScore>=100 && playerScore<500){
        return 3;
    }else{
        return 4;
    }
}

        /*
        Part 5:
        Write a method called reverse that takes one param called num of type int. The method should return an int whose
        value is the input number in reverse order.
        E.g. reverse(432) will return an int of value 234.
         */

}
