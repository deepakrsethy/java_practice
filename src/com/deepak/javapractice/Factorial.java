package com.deepak.javapractice;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(findFactorialUsingIteration(10));
		System.out.println(findFactorialUsingRecursion(10));
	}

	private static int findFactorialUsingRecursion(int num) {
		if(num>0)
		return num * findFactorialUsingIteration(num-1);
		return 0;
	}

	private static int findFactorialUsingIteration(int num) {
		int fact =1;
		for(int i = num ; i>0;i--) {
			fact = fact*i;
		}
		return fact;
		
	}

}
