package com.tcs;

public class AException {

    public static void main(String[] args) {
        try {
            // Attempting division by zero
            System.out.println(10/0); // This line will throw an ArithmeticException
        } catch (ArithmeticException ae) {
            // Handling the ArithmeticException
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
            // Trying to access an invalid index of a string
            System.out.println("shiva".charAt(12)); // This line will throw an StringIndexOutOfBoundsException
        } finally {
            // Finally block executes regardless of whether an exception is caught or not
            int[] a = {10,20,30}; 
            // Trying to access an invalid index of an array
            System.out.println("Executing finally block:");
            System.out.println("Array element at index 9: " + a[9]); // This line will throw an ArrayIndexOutOfBoundsException
        }
    }

}

/*
Caught ArithmeticException: / by zero
Executing finally block:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 3
	at com.tcs.AException.main(AException.java:16)
*/
