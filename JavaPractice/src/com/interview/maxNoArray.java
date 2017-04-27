 package com.interview;

import java.util.Scanner;

public class maxNoArray {

	
	public static void main(String arg[]){
		int[] a = new int[30];
		
		System.out.println("type the arraay size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The size number of the array is:"+n+"\n");
		
		System.out.println("Enter the elements and press enter:");
		for (int i = 0;i<n;i++){
			a[i] = sc.nextInt();
			
			
		}
		int max = a[0]; 
		for (int j =0;j<n;j++){
			
			if(a[j]>max){
				max = a[j];
			}
			
			
		}
		System.out.println("The maxium number among the array is:"+max+"\n");
	}
}
