package homework_week_7;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge
 */
public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter the number");//Print the user enter a number
        int a = scanner.nextInt();//integer input
        System.out.println(sumDigit(a));//calculate and print the sum of even digit
        scanner.close();//Scanner close
    }

    public static int sumDigit(int number) {
        int sumDigits = 0;//initialize a variable to store the sum of even digit
        if (number < 10)
            return -1;// if the input number is less than 10, return -1 to indicate an invalid

        while (number > 0) {
            int evenDigits = number % 10; //get the last digit of the number
            //if (evenDigits % 2 == 0 )
            sumDigits += evenDigits;// Add the even digit to the sum
            number /= 10;// remove the last digit by dividing the number by 10

        }
        return sumDigits; //Return the sum of even digit in the input number

    }
}
