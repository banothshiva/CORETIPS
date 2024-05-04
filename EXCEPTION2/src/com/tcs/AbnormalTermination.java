package com.tcs;

public class AbnormalTermination {

	public static void main(String[] args) {
		try {
			
			System.out.println("connection open");
			System.out.println(10/0);
			}
			catch (NullPointerException nu) 
			{
				System.out.println("Exception handling");
			}
			finally {
				System.out.println("connection closing");
			}
	}

}
