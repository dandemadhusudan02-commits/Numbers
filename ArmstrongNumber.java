/**
 * Program Name : ArmstrongNumber
 * Author       : Madhusudan Dande
 * Description  :
 *   This program repeatedly takes an integer input from the user
 *   and checks whether the given number is an Armstrong number or not.
 *   The program stops when the user enters 0.
 * 
 *   An Armstrong number (for 3 digits) is a number that is equal to
 *   the sum of the cubes of its digits.
 *   Example: 153 = (1³ + 5³ + 3³) = 153
 */

package com.numbers.codes;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Loop continuously to allow multiple checks
        while (true) {

            // Prompt the user for input
            System.out.print("Enter the number to check Armstrong or Not (or type '0' to stop): ");
            int n = sc.nextInt();

            // Stop the program if the user enters 0
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close the scanner to free resources
                break; // Exit the loop
            }

            // Store the original number for comparison later
            int originalNum = n;

            // Variable to hold the sum of cubes of digits
            int sum = 0;

            // Extract each digit and calculate the cube of it
            while (n > 0) {
                int rem = n % 10;          // Get the last digit
                sum = sum + (rem * rem * rem); // Add the cube of the digit
                n = n / 10;                // Remove the last digit
            }

            // Compare the sum with the original number
            if (sum == originalNum) {
                System.out.println("✅ " + originalNum + " is an Armstrong Number.\n");
            } else {
                System.out.println("❌ " + originalNum + " is NOT an Armstrong Number.\n");
            }
        }
    }
}
