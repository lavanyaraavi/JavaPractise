package com.interview;

import java.util.Scanner;

public class fibonacciIteration {

	public static void main(String arg[]){
		Utility ut = new Utility();
		System.out.println("Enter N value to get  the nth element of the Fibonacci series :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int 	prevalue2 = 1;
	int 	prevalue1 = 0;
	int prevalue3 = prevalue1 + prevalue2;
	if (n==1){
		System.out.println("\nThe Value is 1st element is 1");
	}
	else if (n>1){
		System.out.println("1st value:"+prevalue3);
		for (int i = 2;i<=n ; i++){
			prevalue3 = prevalue2 + prevalue1;
			prevalue1 = prevalue2;
			prevalue2 = prevalue3;
			System.out.println(i+"nd value:"+prevalue3);
		}
		System.out.println("\nThe Value of the "+n+"th Fibonacci series is :"+prevalue3+"\n");
		  
		System.out.println("\nThe value using recursive funtion is :"+ut.recursiveFbs(n));
	}
	else{
		System.out.println("Value Entered is invalid");
	}
	}
}
