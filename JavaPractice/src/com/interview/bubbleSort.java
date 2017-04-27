package com.interview;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String srg[]){
		
int[] a =  new int[20];
		
		System.out.println("type the arraay size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The size number of the array is:"+n+"\n");
		
		System.out.println("Enter the elements and press enter:");
		for (int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("The UNSorted array is:\n");
		for(int l =0;l<n;l++){
			System.out.println(a[l]);
		}
		int temp=0;
		for(int i =0;i<n-1;i++)
		{
		for(int j=0;j<n-1;j++){
			if (a[j]>a[j+1])
			{
				temp = a[j];
				a[j]= a[j+1];
				a[j+1]= temp;
			}
			for(int l =0;l<n;l++){
				System.out.print(a[l]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("\nThe "+(i+1)+"th interation of  array is:\n");
		for(int l =0;l<n;l++){
			System.out.print(a[l]+"\t");
		}
		System.out.println("\n ");
		}
		
		System.out.println("\nThe BUBBLE SORTED array is:\n");
		for(int l =0;l<n;l++){
			System.out.print(a[l]+"\t");
		}
	}
}
