/**
 * Program Name: LcmOfNumbers.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program calculates the LCM (Least Common Multiple) of two given numbers.
 * It uses the mathematical relationship between HCF (GCD) and LCM:
 * 
 *     LCM(a, b) = (a × b) / HCF(a, b)
 * 
 * The program continues to accept pairs of numbers until the user enters '0' 
 * for any of the inputs, which stops the program.
 * 
 * Logic Used:
 * 1. Take two integer inputs from the user.
 * 2. Find their HCF (Highest Common Factor) using a simple loop.
 * 3. Use the formula LCM = (firstNum × secondNum) / HCF.
 * 4. Display the LCM.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class LcmOfNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Loop to allow multiple LCM calculations
        while (true) {

            // Take first number input
            System.out.print("Enter the First Number (or type '0' to stop): ");
            int firstNum = sc.nextInt();

            // Take second number input
            System.out.print("Enter the Second Number (or type '0' to stop): ");
            int secondNum = sc.nextInt();

            // Exit condition
            if (firstNum == 0 || secondNum == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close Scanner to prevent resource leak
                break; // Exit the loop
            }

            // Store original numbers for display
            int num1 = firstNum;
            int num2 = secondNum;

            int gcd = 1; // Variable to store the GCD (HCF)

            // Find the GCD using a loop
            for (int i = 1; i <= firstNum && i <= secondNum; i++) {
                if (firstNum % i == 0 && secondNum % i == 0) {
                    gcd = i; // Update GCD
                }
            }

            // Calculate LCM using the relationship between GCD and LCM
            int lcm = (firstNum * secondNum) / gcd;

            // Display the result
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
            System.out.println("--------------------------------------\n");
        }
    }
}
