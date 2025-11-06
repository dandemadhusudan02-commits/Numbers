/**
 * Program Name: AverageOfNumbers.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program calculates the average of 'n' numbers entered by the user.
 * It repeatedly takes user input for the count of numbers and their values.
 * If the user enters '0' for the count, the program terminates.
 * 
 * Logic Used:
 * 1. The user specifies how many numbers they want to average.
 * 2. The program reads all numbers, calculates their sum, 
 *    and divides it by the total count (n) to find the average.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Loop to allow repeated calculations until user enters 0
        while (true) {

            // Ask the user for how many numbers to find the average
            System.out.print("How many numbers required to find Average (or type '0' to stop): ");
            double n = sc.nextDouble();

            // Exit condition
            if (n == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close scanner to prevent resource leak
                break; // Exit the loop
            }

            // Validate that the count of numbers is not negative
            if (n < 0) {
                System.out.println("Please enter a positive count.\n");
                continue; // Skip current iteration
            }

            double sum = 0; // Variable to store the sum of numbers

            // Loop to read 'n' numbers from user
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Number " + (i + 1) + ": ");
                sum += sc.nextDouble(); // Add each number to sum
            }

            // Calculate average
            double average = sum / n;

            // Display the calculated average
            System.out.println("Average is: " + average);
            System.out.println("--------------------------------------\n");
        }
    }
}
