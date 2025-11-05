/**
 * Program Name : CheckPrimeNumber
 * Author       : Madhusudan Dande
 * Description  :
 *   This program repeatedly takes an integer input from the user
 *   and checks whether the given number is a prime number or not.
 *   The program stops when the user enters 0.
 * 
 *   A prime number is a number that is divisible only by 1 and itself.
 *   Example: 2, 3, 5, 7, 11, 13, ...
 */

package com.numbers.codes;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow checking multiple numbers
        while (true) {

            // Prompt the user to enter a number
            System.out.print("Enter the number to check prime or not (or type '0' to stop): ");
            int n = sc.nextInt();

            // Exit condition: if user enters 0, stop the program
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close the scanner to free resources
                break; // Exit the loop
            }

            // Handle negative and 1 as special cases
            if (n < 0 || n == 1) {
                System.out.println("❌ " + n + " is NOT a Prime Number.\n");
                continue;
            }

            // Variable to count how many numbers divide 'n'
            int count = 0;

            // Loop from 1 to n to check divisibility
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++; // Increment count if divisible
                }
            }

            // A prime number has exactly 2 divisors: 1 and itself
            if (count == 2) {
                System.out.println("✅ " + n + " is a Prime Number.\n");
            } else {
                System.out.println("❌ " + n + " is NOT a Prime Number.\n");
            }

            System.out.println(); // Print a blank line for better readability
        }
    }
}
