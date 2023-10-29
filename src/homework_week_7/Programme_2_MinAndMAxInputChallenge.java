package homework_week_7;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMAxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        int maximum = Integer.MAX_VALUE;// Initialize maximum
        int minimum = Integer.MIN_VALUE;// Initialize minimum
        boolean firstInput = true; //First input has been received
        while (true) { // Using while loop
            System.out.println("Please enter the number : ");//Print the statement for enter number
           //if else Statement
            if (scanner.hasNextInt()) { //Check if the next input an integer
                int a = scanner.nextInt();//value assign
                // if else statement
                if (firstInput) {
                    maximum = a;
                    minimum = a;
                    firstInput = false;
                } else {
                    if (a > maximum) {
                        maximum = a;
                    }
                    if (a < minimum) {
                        minimum = a;
                    }
                }
            } else {
                break;// exit the loop if an invalid number is entered
            }
            scanner.nextLine();//
        }
        if (maximum == Integer.MAX_VALUE || minimum == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered");//print the statement for No valid numbers entered
        } else {
            System.out.println("Maximum number is: " + maximum);//print the statement for maximum number
            System.out.println("Minimum number is : " + minimum);//print the statement for minimum number
        }
        scanner.close();// Close the scanner
    }
}
