/**
 * Program Name: SwapNumbers.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program swaps the values of two numbers entered by the user.
 * It continues to take input until the user enters '0' for either number,
 * which stops the program. The swapping is done using a temporary variable.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple swap operations until user enters 0
        while (true) {

            // Take first number input
            System.out.print("Enter First Number (or type '0' to stop): ");
            int firstNum = sc.nextInt();

            // Take second number input
            System.out.print("Enter Second Number (or type '0' to stop): ");
            int secondNum = sc.nextInt();

            // Check if user wants to exit the program
            if (firstNum == 0 || secondNum == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close Scanner to avoid resource leak
                break; // Exit the loop
            }

            // Display numbers before swapping
            System.out.println("Before Swapping: First Number = " + firstNum + ", Second Number = " + secondNum);

            // Swap logic using a temporary variable
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;

            // Display numbers after swapping
            System.out.println("After Swapping:  First Number = " + firstNum + ", Second Number = " + secondNum);

            // Add spacing for better readability
            System.out.println("--------------------------------------\n");
        }
    }
}
