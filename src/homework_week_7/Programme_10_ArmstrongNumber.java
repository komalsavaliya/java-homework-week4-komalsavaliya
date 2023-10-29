package homework_week_7;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Programme_10_ArmstrongNumber obj = new Programme_10_ArmstrongNumber();
        obj.isArmstrong();
    }
    public void isArmstrong() {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Enter the number: ");//Print the statement user input enter the number
        int cube = 0, remainder, check;
        int n = scanner.nextInt();// read integer input
        check = n;//Store the original number for comparison
        int orginal = n;//Store the original number for output
        //Calculate the sum of cubes of its digits
        while (n > 0) {
            remainder = n % 10;// get the last digit
            n = n / 10;// remove last digit
            cube = cube + (remainder * remainder * remainder);// calculate the cube and add it to the sum
        }
        //Check if it's an Armstrong number and print the result
        if (check == cube)
            System.out.println(orginal + "is an Armstrong number");
        else
            System.out.println(orginal + " is not an Armstrong Number");
    }
}

