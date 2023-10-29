package homework_week_7;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.print("input number of line");// print the statement user input number of rows
        int numRows = scanner.nextInt();//Integer input
        printSymboleTriangle(numRows);//calculate and print number of rows
        scanner.close();//Scanner close
    }
    public static void printSymboleTriangle(int numRows) {
        //Loop through each row
        for (int i = 1; i <= numRows; i++) {
            //Loop through each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            //Move to the next line to start a new row
            System.out.println();
        }
    }
}

