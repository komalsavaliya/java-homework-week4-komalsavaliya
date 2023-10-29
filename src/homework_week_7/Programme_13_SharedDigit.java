package homework_week_7;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Programme_13_SharedDigit {
    public static void main(String[] arg) {
        //Example usage
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        //Check both numbers are within the range of 10(inclusive) -99(inclusive)
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            //Extract this digit of num1 and num2
            int num1Digit1 = num1 / 10;
            int num1Digit2 = num1 % 10;
            int num2Digit1 = num2 / 10;
            int num2Digit2 = num2 % 10;
            //check if any of the digits from num1 appears in mum2
            return (num1Digit1 == num2Digit1 || num1Digit1 == num1Digit2 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2);
        } else {
            return false;// If one or both number are not specified range, return false
        }
    }
}
