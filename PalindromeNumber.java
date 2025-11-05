/**
 * Program Name : PalindromeNumber
 * Author       : Madhusudan Dande
 * Description  :
 *   This program repeatedly takes an integer input from the user
 *   and checks whether the given number is a Palindrome number or not.
 *   The program stops when the user enters 0.
 * 
 *   A Palindrome number is a number that remains the same 
 *   when its digits are reversed.
 *   Example: 121, 1331, 12321, etc.
 */

package com.numbers.codes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to check multiple numbers until user exits
        while (true) {
            try {
                // Ask the user to enter a number
                System.out.print("Enter the number to check Palindrome or Not (or type '0' to stop): ");
                int n = sc.nextInt();

                // Exit condition: if user enters 0, stop the program
                if (n == 0) {
                    System.out.println("Program Ended.");
                    sc.close(); // Close scanner to release resources
                    break;
                }

                // Validation: Palindrome is not defined for negative numbers
                if (n < 0) {
                    System.out.println("❌ Invalid input! Negative numbers cannot be Palindromes.\n");
                    continue; // Skip to next input
                }

                // Store the original number for later comparison
                int original = n;

                // Variable to store the reversed number
                int reverse = 0;

                // Reverse the digits of the number
                while (n != 0) {
                    int num = n % 10;          // Get last digit
                    reverse = reverse * 10 + num; // Build reversed number
                    n = n / 10;                // Remove last digit
                }

                // Compare the original and reversed numbers
                if (original == reverse) {
                    System.out.println("✅ " + original + " is a Palindrome Number.\n");
                } else {
                    System.out.println("❌ " + original + " is NOT a Palindrome Number.\n");
                }

                System.out.println(); // Print a blank line for spacing
            } 
            catch (InputMismatchException e) {
                // Handle invalid input (like characters, symbols, etc.)
                System.out.println("⚠️ Invalid input! Please enter a valid integer number.\n");
                sc.nextLine(); // Clear the invalid input from scanner buffer
            }
        }
    }
}
