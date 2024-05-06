package com.tcs; // Package declaration

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test { // Class declaration

    // Method to read a file
    public static void readFile(String file){
        try {
            FileInputStream fileInputStream = new FileInputStream(file); // Attempt to open the file
            System.out.println("File present. Tomorrow we will read the data."); // Print success message
        } catch (FileNotFoundException e) { // Catch block for handling file not found exception
            System.out.println("The marks file is not available."); // Print error message
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        readFile("marks.txt"); // Call the readFile method with the file name "marks.txt"
    }

}
//OUT PUT : The marks file is not available.
