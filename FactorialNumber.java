/**
 * Program Name : FactorialNumber
 * Author       : Madhusudan Dande
 * Description  :
 *   This program repeatedly takes integer inputs from the user 
 *   and calculates their factorial.
 *   The program ends when the user enters 0.
 *   Negative numbers are not allowed and will show an error message.
 */

package com.numbers.codes;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop for continuous input until user exits
        while (true) {

            // Prompt the user to enter a number
            System.out.print("Enter the number to find Factorial (or type '0' to stop): ");
            int n = sc.nextInt();

            // If user enters 0, terminate the program
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close scanner to release system resources
                break; // Exit the loop
            }

            // Handle invalid (negative) numbers
            if (n < 0) {
                System.out.println("❌ Invalid input! Factorial is not defined for negative numbers.\n");
                continue; // Skip to next iteration
            }

            // Initialize factorial to 1 (factorial of 0 and 1 is 1)
            int factorial = 1;

            // Loop from 1 to n to calculate factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Display the computed factorial
            System.out.println("✅ Factorial of " + n + " is: " + factorial + "\n");
        }
    }
}
