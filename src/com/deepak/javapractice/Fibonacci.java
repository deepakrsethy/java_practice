package com.deepak.javapractice;

public class Fibonacci {
	
	static int  n1=0 , n2=1, n3=0;
	
	public static void main(String[] args) {
		
		
		System.out.println("Iteration");
		System.out.print(n1+ " "+n2);		
		fibonacciWithIteration(10-2);
		
		System.out.println();
		
		n1=0; n2=1; n3=0;
		System.out.println("Recursion");
		System.out.print(n1+ " "+n2);		
		fibonacciWithRecursion(10-2);
	}

	private static void fibonacciWithRecursion(int num) {	
		if(num>=0) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;			
			fibonacciWithRecursion(num-1);
		}
		
	}

	private static void fibonacciWithIteration(int num) {
		for(int i=0;i<=num;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;			
		}
		
	}

}
