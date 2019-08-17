package com.deepak.javapractice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(checkIfArmStrong(153));
		System.out.println(checkIfArmStrong(311));
	
	}

	private static boolean checkIfArmStrong(int num) {
		int c=0,a, temp=num;
		while(num>0) {
			a = num%10;
			num = num/10;
			c = c+ (a*a*a);		
		}
		if(temp == c) {
			return true;
		}
		return false;
	}

}
