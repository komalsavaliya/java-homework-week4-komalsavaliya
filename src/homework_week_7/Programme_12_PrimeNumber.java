package homework_week_7;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner open
        System.out.println("Enter a number: ");// Print the statement user can enter the number
        int number = scanner.nextInt();//Integer input
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");//Print the statement is a prime number
        } else {
            System.out.println(number + "is not a prime number");////Print the statement is not a prime number
        }
        scanner.close();//Scanner close
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;//number less than or equal to 1
        }
        if (number <= 3) {
            return true;//2 and 3 are prime numbers
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;//Number divisible by 2 or 3 are not prime
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;//Number divisible by factors other than 2 and 3 are not prime
            }
        }
        return true; //If the number is not divisible by any factors, its prime
    }
    }


