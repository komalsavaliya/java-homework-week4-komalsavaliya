package homework_week_7;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Programme_7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter a number: ");//print the statement user enter a number
        if (scanner.hasNextInt()) { // Check if the input is an integer
            int number = scanner.nextInt();// integer input
            int result = FirstAndLastDigitSum(number);//Calculate the sum of first and last digit
            if (result == -1) {
                System.out.println("Invalid input");// Print an error message for invalid input
            } else {
                System.out.println("The sum of the first and last digit is: " + result);// print the result
            }
        } else {
            System.out.println("Invalid input");//Print an error message for invalid input
        }
        scanner.close();//Scanner close
    }
    public static int FirstAndLastDigitSum(int number) {
        if (number < 0) {
            return -1;//If the number is negative, return - 1 to indicate an invalid value
        }
        if (number < 10) {
            return number * 2;// If the number has only one digit, return is double
        }
        int firstDigit = 0;
        int lastDigit = number % 10; // get the last digit
        //Find the first digit using a loop
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;// Return the sum of first and last digits
    }
}



