package homework_week_7;

import java.util.Scanner;

/**
 * 11.Even Digit sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// open scanner
        System.out.println("Enter a number");//Print the statement User can enter number
        int number = scanner.nextInt();//integer input
        int result = getEvenDigitSum(number);// Calculate the sum of even digit
        if (result == -1) {
            System.out.println("Invalid input. The number is negative.");//Print the statement User can enter invalid input. the number is negative
        } else {
            System.out.println("The sum of even digit is: " + result);//Print the statement The sum of even digit is
        }
        scanner.close();//close scanner
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;//If the number is negative, return -1 to indicate an invalid value
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;// Add the even digit to the sum
            }
            number /= 10;
        }
        return sum;//Return the sum of even digits
    }
}
