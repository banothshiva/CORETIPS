package com.tcs;

public class Case7 {

    public static int m1() {
        try {
            // Trying to return 10
            return 10;
        } catch (Exception e) {
            // This block will not execute as there's no exception thrown in the try block
            return 20;
        } finally {
            // This block always executes, regardless of whether an exception is thrown or not
            // Returning 30 from the finally block
            return 30;
        }
    }

    public static void main(String[] args) {
        // Calling the m1 method which returns 30
        int result = Case7.m1();
        System.out.println("ratan value: " + result);
    }

}

/* OUT PUT : ratan value: 30
* If the try-catch-finally blocks contains return statements
 *  , it will always return finally block return statement ,
 *   because finally block will be excuted at last 
 */
