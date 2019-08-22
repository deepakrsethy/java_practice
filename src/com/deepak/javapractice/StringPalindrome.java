package com.deepak.javapractice;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println(checkPalindromeWithStringMethods("Bob"));
	}

	private static boolean checkPalindromeWithStringMethods(String input) {
		StringBuilder  sb = new StringBuilder(input);
		if(input.equalsIgnoreCase((sb.reverse()).toString())){
			return true;
		}
		return false;
	}

}
