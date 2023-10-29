package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner open
        System.out.println("Enter An alphabet: ");// Print the statement enter an alphabet
        String string = scanner.nextLine();//input is string
        if (string.length() == 1) { // Check string is single character
            char letter = string.charAt(0);//Extract the character from string
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) { // Check string between a to z or A to Z
                //Check if the string is a vowel
                if (isVowel(letter)) {
                    System.out.println("String letter is vowel");//print the statement String letter is vowel
                } else {
                    System.out.println("String letter is Consonant");//print the statement String letter is consonant
                }
            } else {
                System.out.println("Error: not a valid letter");//print the statement not a valid letter
            }
        } else {
            System.out.println("Error please enter a single character");//print the statement please enter a single character
        }
        scanner.close();//Scanner close
    }
    public static boolean isVowel(char character) { // Check if character is a vowel
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}

