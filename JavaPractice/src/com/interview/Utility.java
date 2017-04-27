package com.interview;

public class Utility {

	
	public int[] simplesort(int[] a,int n){
			
	int min = 0,indexofarray = -1;
	
	if (n == 0){
		System.out.println("There is nothing to sort");
	}
	else if(n == 1 ){
		System.out.println("U have entered only one element :"+a[0]);
	}
	else if(n>1){
			
			for (int j =0;j<n;j++){
				min = a[j];
				for (int k=j;k<n;k++){
					
					if (min >a[k]){
						min = a[k];
						indexofarray = k;
							}
				}
				
				
				if(min!=a[j])
				{
					swapinarray(a,j,indexofarray);
				
				}
			}
	}
	else {
		System.out.println("Invalid N value");
	}
			return a;
		}
	
	public void swap(int a,int b){
		int temp =0;
		temp = a;
		a = b;
		b = temp;
	}
	public void swapinarray(int a[],int i,int j){
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		//return a;
	}
	
	public int recursiveFactorial(int n){
		if(n == 1){
			return 1;
		}
		else if(n>1){
			System.out.println(n+"*recursiveFactorial("+(n-1)+");");
			return n*recursiveFactorial(n-1);	
		}
		else{
			return 0;
		}
	}
	
	public int recursiveFbs(int n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
		return 1;
		else 
			System.out.println("recursiveFbs("+(n-1)+")+recursiveFbs("+(n-2)+");");
			return recursiveFbs(n-1)+recursiveFbs(n-2);
		
	}
}

