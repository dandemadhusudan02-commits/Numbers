/**
 * Program Name: EvenOddNumber.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program checks whether a given number is even or odd.
 * It continuously accepts input from the user until '0' is entered,
 * which terminates the program. It also validates negative inputs.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple inputs until user enters 0
        while (true) {

            // Prompt the user to enter a number
            System.out.print("Enter the number (or type '0' to stop): ");
            int num = sc.nextInt();  // Read number from user

            // Check if user wants to exit the program
            if (num == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close scanner to prevent memory leak
                break; // Exit loop
            }

            // Validation for negative numbers
            if (num < 0) {
                System.out.println("Please enter a positive number.\n");
            }
            // Check if number is even
            else if (num % 2 == 0) {
                System.out.println(num + " is an Even Number.\n");
            }
            // Otherwise, number is odd
            else {
                System.out.println(num + " is an Odd Number.\n");
            }

            // Divider line for readability
            System.out.println("--------------------------------------");
        }
    }
}
