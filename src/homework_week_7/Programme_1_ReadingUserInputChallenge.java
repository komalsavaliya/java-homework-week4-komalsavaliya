package homework_week_7;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * Create a class with the name ReadingUserInputChallenge.
 */
public class Programme_1_ReadingUserInputChallenge {
    //Scanner declaration for reading input from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner open
        int i = 0;// initial assign
        int total = 0;//initial toatl assign
        //using while loop
        while (i < 10) {
            // System.out.println(i);
            System.out.println("Please enter the number # : ");//Print the statement for enter the number
            //use if else
            if (scanner.hasNextInt() == true) {//calling boolean method
                int a = scanner.nextInt();//value assign
                total = total + a;// addition of numbers
            } else {
                System.out.println("Invalid number");// print the statement for invalid number
            }
            i++;
        }
        System.out.println("Total is : " + total);//Print the Statement for total
        scanner.close();//scanner close
    }

    public static boolean hasNextInt(int a) { //Boolean method
        //if else Statement for true and false
        if (a == (int) a) {
            return true;
        } else {
            return false;
        }
    }
}
