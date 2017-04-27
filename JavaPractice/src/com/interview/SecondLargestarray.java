package com.interview;

import java.util.Scanner;

public class SecondLargestarray {

	public static void main(String arg[])
	{
		int[] a = new int[50];
		Utility ut = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		System.out.println("The size number of the array is:"+n+"\n");
		if (n>0){
		System.out.println("Enter the elements and press enter:");
		for (int i = 0;i<n;i++){
			a[i] = sc.nextInt();
								}}
		ut.simplesort(a, n);
		
		if (n>1){
				
		System.out.println("The Sorted array is : ");
		for(int l =0;l<n;l++){
			System.out.print(a[l]+"\t");
		}
		System.out.println("\n");
		System.out.println("The Second maximun no in the array is :"+a[n-2]);
		}
	}
}
