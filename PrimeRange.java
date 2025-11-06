/**
 * Program Name: PrimeRange.java
 * Package: com.numbers.codes
 * 
 * Description:
 * This program prints all prime numbers within a given range.
 * The user provides a start and end value, and the program displays 
 * all prime numbers between them. It continues to take input until 
 * '0' is entered for either start or end value, which stops the program.
 * 
 * Logic Used:
 * 1. The user enters two numbers representing the range.
 * 2. Each number in the range is checked for primality using the isPrime() method.
 * 3. A number is prime if it is greater than 1 and divisible only by 1 and itself.
 * 4. The loop continues until the user chooses to exit by typing '0'.
 * 
 * Author: Madhusudan Dande
 */

package com.numbers.codes;

import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow user to find prime numbers in multiple ranges
        while (true) {

            // Take starting number of the range
            System.out.print("Enter the start number to find prime range (or type '0' to stop): ");
            int start = sc.nextInt();

            // Take ending number of the range
            System.out.print("Enter the end number to find prime range (or type '0' to stop): ");
            int end = sc.nextInt();

            // Exit condition if user enters 0 for either number
            if (start == 0 || end == 0) {
                System.out.println("Program Ended.");
                sc.close(); // Close Scanner to avoid resource leak
                break; // Exit loop
            }

            // Validation: ensure start is less than or equal to end
            if (start > end) {
                System.out.println("Invalid Range! Start number should be less than or equal to End number.\n");
                continue;
            }

            // Display message
            System.out.println("Prime numbers between " + start + " and " + end + " are:");

            // Loop through each number in the range and check if it is prime
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) { // Call helper function to check primality
                    System.out.print(i + " ");
                }
            }

            // Print newline and separator for better readability
            System.out.println("\n--------------------------------------\n");
        }
    }

    /**
     * Method Name: isPrime
     * Description:
     * Checks whether a given number is a prime number.
     * 
     * @param num - number to check
     * @return true if number is prime, false otherwise
     */
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }

        // Check divisibility from 2 to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }

        return true; // Number is prime
    }
}
