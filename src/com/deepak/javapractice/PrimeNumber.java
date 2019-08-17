package com.deepak.javapractice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println(checkIfPrimeNumber(7));
		System.out.println(checkIfPrimeNumberOptimized(13));
		System.out.println(checkIfPrimeNumberOptimized(17));
		System.out.println(checkIfPrimeNumberOptimized(21));
	}

	private static boolean checkIfPrimeNumber(int num) {
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean checkIfPrimeNumberOptimized(int num) {
		//-ve numbers, 0 and 1 are not prime numbers
		if(num < 0 || num == 0 || num == 1) {
			return false;
		}
		
		//2 and 3 are prime numbers so need to check in loop
		if(num == 2 || num == 3) {
			return true;
		}
		
		//if the number is divisible by 2 then its a even number and not prime number.No need to check in loop
		if(num % 2 == 0) {
			return false;
		}		
		
		//only check till sqrt of the number
		int sqrt = (int) Math.sqrt(num);
		
		//check if the number is divisible by odd numbers. We have already checked if the number is even.
		for(int i = 3; i < sqrt; i = i+2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
