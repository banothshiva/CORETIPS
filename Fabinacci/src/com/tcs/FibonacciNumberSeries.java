package com.tcs;

public class FibonacciNumberSeries {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2); // Print the first two numbers

        for (int j = 2; j < count; ++j) { // Start loop from 2 as first two numbers are already printed
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
