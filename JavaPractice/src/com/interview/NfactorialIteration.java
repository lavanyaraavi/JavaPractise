package com.interview;

import java.util.Scanner;

public class NfactorialIteration {

	public static void main(String arg[]){
		Utility ut = new Utility();
		System.out.println("Enter n value to get  the nth factorial value :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int 	prevalue2 = 1;
	int 	prevalue1 = 0;
	int prevalue3 = prevalue1 + prevalue2;
	if (n==0){
		System.out.println("The Value is 0! is  1");
	}
	else if (n>0){
		int multiply = 1;
		for (int i = 1;i<=n;i++){
			multiply = multiply*i;
		}
		System.out.println("\nThe Value of "+n+"! is : "+multiply);
		System.out.println("\nThe value using recursive is : "+ut.recursiveFactorial(n));
}
	
	else{
		System.out.println("INVALID n value");
	}
}
}