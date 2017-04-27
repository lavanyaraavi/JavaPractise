package com.interview;


public class Palindrom {

	public static void main(String[] args) {
	
	// This program dont work if given a single letter - have to fix that. - Lavanya
		// the reverse of the string is recurring so the piece of code can be kept it in a Function.
String givenString = "ONO";
int lengthGS = givenString.length();
int lengthGShalf = lengthGS/2;

if (lengthGS%2==0 ){
	String substring1 = givenString.substring(0,lengthGShalf);
	String substring2 = givenString.substring(lengthGShalf,lengthGS);
	
	StringBuffer Sb3 = new StringBuffer(substring2);
 StringBuffer reversesubString2B = Sb3.reverse();
 String reversesubString2 = reversesubString2B.toString();
	System.out.println("SubString One :"+substring1);
	System.out.println("SubString Two :"+substring2);
	
	System.out.println("SubString  :"+substring2 +" and reverse :"+reversesubString2);
	
	
	if(substring1.contentEquals(reversesubString2))
	{
		System.out.println(" Given String "+ givenString +" is a palindrome");
	}
	else
	{
		System.out.println("Given String "+givenString+" is not a palindrome");
	}
	
}
else
{
	String substring1 = givenString.substring(0,lengthGShalf);
	String substring2 = givenString.substring(lengthGShalf+1,lengthGS);
	
	StringBuffer Sb3 = new StringBuffer(substring2);
	 StringBuffer reversesubString2B = Sb3.reverse();
	 String reversesubString2 = reversesubString2B.toString();
		System.out.println("SubString One :"+substring1);
		System.out.println("SubString Two :"+substring2);
		
		System.out.println("SubString  :"+substring2 +" and reverse :"+reversesubString2);
		
	
	
	if(substring1.contentEquals(reversesubString2))
	{
		System.out.println("Given String "+ givenString +" is a palindrome");
	}
	else
	{
		System.out.println("Given String "+givenString+" is not a palindrome");
	}
}
	
	}
}
