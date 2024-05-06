package com.tcs; // Package declaration

import java.util.Scanner;

public class VotingLogic {

    // Method to validate age for voting eligibility
    static void validate(int age) {
        if (age > 18) { // Check if age is greater than 18
            System.out.println("You are eligible to vote."); // Print eligibility message
        } else {
            throw new ArithmeticException("Not eligible to vote."); // Throw exception for ineligible age
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // Read user's age input
        VotingLogic.validate(age); // Call validate method to check eligibility
        scanner.close(); // Close Scanner object to release resources
    }
}
