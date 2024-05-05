package com.tcs;

public class TryFinallyConnection {

	public static void main(String[] args) {
		try 
		{
			System.out.println("connection open");
		}
		finally {
			System.out.println("connection closed");
		}
		
	}

}
//connection open
//connection closed
