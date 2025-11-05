/**
 * Program Name : FibonacciSeries
 * Author       : Madhusudan Dande
 * Description  :
 *   This program repeatedly takes an integer input from the user
 *   and prints the Fibonacci series up to that number of terms.
 *   The program stops when the user enters 0.
 *   Negative numbers are not allowed and will show an error message.
 */

package com.numbers.codes;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Loop continuously until the user decides to stop
        while (true) {

            // Prompt the user for input
            System.out.print("Enter the number to find Fibonacci Series (or type '0' to stop): ");
            int n = sc.nextInt();

            // If user enters 0, terminate the program
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close the scanner to release resources
                break; // Exit the loop
            }

            // Handle invalid (negative) numbers
            if (n < 0) {
                System.out.println("❌ Invalid input! Fibonacci series is not defined for negative numbers.\n");
                continue; // Skip to next iteration
            }

            // Initialize the first two numbers of the Fibonacci series
            int firstNum = 0;
            int secondNum = 1;

            // Display header for clarity
            System.out.println("Fibonacci Series of " + n + " terms is:");

            // Print the first two numbers for clarity when n >= 2
            if (n >= 1)
                System.out.print(firstNum + " ");
            if (n >= 2)
                System.out.print(secondNum + " ");

            // Generate and display the remaining Fibonacci numbers
            for (int i = 3; i <= n; i++) {
                int next = firstNum + secondNum; // Next term = sum of previous two terms
                System.out.print(next + " "); // Print the next Fibonacci number
                firstNum = secondNum; // Shift the sequence forward
                secondNum = next;
            }

            // Add a new line for better readability
            System.out.println("\n");
        }
    }
}
