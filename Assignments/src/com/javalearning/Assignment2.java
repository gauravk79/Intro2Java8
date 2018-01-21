package com.javalearning;

public class Assignment2 {
    public static void main(String[] args) {

        /*
        Part1: Using loops, write code that will output to screen the following:
        9 7 5 3 1
        7 5 3 1
        5 3 1
        3 1
        1
         */


  for(int j=9;j>=1;j-=2){
      for(int i=j;i>=1;i-=2){

          System.out.print(i + " ");
      }
      System.out.println();
  }


        /*
        Part2: Using loops, write code that will output to screen the following:
        2 - - - - -
        - 4 - - - -
        - - 6 - - -
        - - - 8 - -
        - - - - 10 -
        - - - - - 12

         */
        System.out.println();
        System.out.println();

        for(int j=2;j<=12;j+=2){

            for(int i=1;i<=6;i+=1){

                if(i*2 == j)
                    System.out.print(j + " ");


                else
                    System.out.print("- ");


            }
            System.out.println();
        }

        /*
        Part3: Using loops, write code that will output to screen the following:
        1
        1 3
        1 3 5
        1 3 5 7
        1 3 5 7 9
        1 3 5 7
        1 3 5
        1 3
        1
         */
        System.out.println();
        System.out.println();



        int n = 9;

        for (int i = 1; i < n; i+=2) {
            for (int j = 1; j <= i; j+=2)
                System.out.print(j + " ");
            System.out.println();
        }
        for (int i = n; i >= 0; i-=2) {
            for (int j = 1; j <= i; j+=2)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }



}


