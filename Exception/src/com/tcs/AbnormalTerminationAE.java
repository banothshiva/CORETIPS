package com.tcs;

public class AbnormalTerminationAE {

	public static void main(String[] args) {
		 try {
			System.out.println("connection open");
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("tharun".charAt(12));
		}
		 finally {
			System.out.println("connection closing");
		}
	}

}

/*
 * OUTPUT IS
 connection open
connection closing
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1517)
	at Exception/com.tcs.AbnormalTerminationAE.main(AbnormalTerminationAE.java:10)
*/
