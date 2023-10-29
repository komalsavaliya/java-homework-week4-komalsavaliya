package homework_week_7;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter the number of terms in the Fibonacci sequence: ");//print the number of terms in the fibonacci sequence
        int n = scanner.nextInt();//Storing the vale into the integer which enter by user
        printFibonacci(n);
        scanner.close();//scanner close
    }
    public static void printFibonacci(int n) {
        int first = 1;//Initilize the first fibonacci sequence
        int second = 1;//
        System.out.print("Fibonacci Sequence: " + first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;//calculating the next number by adding the previous two number
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}