package homework_week_7;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_NumbersTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner is open
        System.out.println("Input number of rows: ");// print the statement user input number of rows
        int numRows = scanner.nextInt();//Integer input
        printNumberTriangle(numRows);//calculate and print number of rows
        scanner.close();//scanner close
    }
    public static void printNumberTriangle(int numRows){
        //Loop through each row
        for (int i = 1; i <= numRows; i++){
            //Loop to print numbers from 1 to the current row number
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //Move to the next line to start a new row
            System.out.println();
        }
    }
}
