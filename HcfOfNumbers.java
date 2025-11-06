/**
 * Program Name: HcfOfNumbers.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program calculates the HCF (Highest Common Factor) or GCD (Greatest Common Divisor)
 * of two given numbers using the Euclidean algorithm. 
 * The user can repeatedly find HCF of pairs of numbers until '0' is entered 
 * for any input, which stops the program.
 * 
 * Logic Used:
 * 1. Take two integer inputs from the user.
 * 2. Use the Euclidean algorithm:
 *    - Repeat until the remainder becomes 0.
 *    - Replace the larger number with the smaller one and 
 *      the smaller number with the remainder of their division.
 * 3. The final non-zero number is the HCF.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class HcfOfNumbers {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple HCF calculations
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
                sc.close(); // Close Scanner to avoid resource leak
                break; // Exit loop
            }

            // Store original values for displaying later
            int num1 = firstNum;
            int num2 = secondNum;

            // Euclidean algorithm for finding HCF
            while (secondNum != 0) {
                int temp = secondNum;
                secondNum = firstNum % secondNum;
                firstNum = temp;
            }

            // Display the result
            System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + firstNum);
            System.out.println("--------------------------------------\n");
        }
    }
}
