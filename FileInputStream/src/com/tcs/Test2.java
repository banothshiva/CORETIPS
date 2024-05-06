package com.tcs; // Package declaration

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 { // Class declaration

    // Method to read a file
    public static void readFile(String file) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file); // Attempt to open the file
        System.out.println("File present. Tomorrow we will read the data."); // Print success message
    }

    // Main method to execute the program
    public static void main(String[] args) {
        try {
            Test2.readFile("abc.txt"); // Call the readFile method with the file name "abc.txt"
        } catch (FileNotFoundException e) { // Catch block for handling file not found exception
            System.out.println("File is not available."); // Print error message
        }
    }

}
