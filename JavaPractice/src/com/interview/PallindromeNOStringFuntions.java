package com.interview;

import java.util.*;

public class PallindromeNOStringFuntions {

	public static void main(String[] args) {
		String GivenString = "O";
		char[] givenarray = GivenString.toCharArray();
		int length = givenarray.length;
		int j = length-1,count =0;
		for (int i =0; i<length/2 ;i++){
			count =2;
			System.out.println("givenarray[i]"+givenarray[i]);
			System.out.println("givenarray[j]"+givenarray[j]);
			if(givenarray[i] != givenarray[j])
			{
				count =1;
				break;
			}
			
			j--;
		}
		
		if(count==2){
			System.out.println("Given String "+GivenString+" is palindrome");
		}
		else if(count==1){
			System.out.println("Given String "+GivenString+" is NOT a palindrome");
		}
		else if(count ==0){
			System.out.println("Dint enter into forloop");
		}
	}
	
}
