package com.coretips;

public class NormalTermination {

	public static void main(String[] args) {
		try 
		{
			System.out.println("connection open");
		}
		catch (Exception ae)
		{
			System.out.println("exception handling");	
		}
		finally 
		{
			System.out.println("connection closing");
		}
	}

}
