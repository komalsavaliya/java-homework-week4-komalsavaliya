package homework_week_7;

import java.util.Scanner;

/**
 * 14. Write a programme in java to display the pattern like a diamond
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Enter the number of rows (odd) : ");// Print the statement Enter the number of rows(odd)
        int a = scanner.nextInt();//Integer input
        if (a % 2 == 0) {
            System.out.println("Please enter an odd number");//Print the statement Enter an odd number
        } else {
            printDiamondPattern(a);
        }
        scanner.close();//scanner close
    }
    public static void printDiamondPattern(int a) {
        int spaces = a / 2;// Initialize the number of spaces for the first row
        int stars = 1;// Initialize the number of star for the first row
        //Print the upper half of diamond
        for (int i = 1; i <= a; i++) {
            //Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            //Move to the next line
            System.out.println();
            if (i <= a / 2) {
                spaces--;// Decrease space for the next row
                stars += 2;//Increase space for the next row
            } else {
                spaces++;//Increase space for the next row
                stars -= 2;//Decrease space for the next row
            }
        }
    }
}