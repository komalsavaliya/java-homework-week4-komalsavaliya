package homework_week_7;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.print("Enter the number of line");// print the statement user input number of rows
        int numRows = scanner.nextInt();//Integer input
        printAngleTriangle(numRows);//calculate and print number of rows
        scanner.close();//scanner close
    }

    public static void printAngleTriangle(int numRows) {
        //Loop through each row
        for (int i = 1; i <= numRows; i++) {
            //Loop through each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Move to the next line to start a new row
            System.out.println();//Move to next line
        }

    }
}

