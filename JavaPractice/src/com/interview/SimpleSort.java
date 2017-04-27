package com.interview;

import java.util.Scanner;

public class SimpleSort {
	
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
			int min = 0,indexofarray = -1,temp = 0;
		
		for (int j =0;j<n;j++){
			min = a[j];
			for (int k=j;k<n;k++){
				
				if (min >a[k]){
					min = a[k];
					indexofarray = k;
						}
			}
			
			System.out.println("min value in"+ j +"is:"+min);
			if(min!=a[j])
			{
			temp = a[j];
			a[j] = min;
			a[indexofarray]=temp;
			}
		}
	
		System.out.println("The Sorted array is:\n");
		for(int l =0;l<n;l++){
			System.out.println(a[l]);
		}
		
}
	
	}




