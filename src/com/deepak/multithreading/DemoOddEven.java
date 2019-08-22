package com.deepak.multithreading;

public class DemoOddEven {
	
	public static void main(String[] args) {
		int max = 10;
		PrintEvenOdd r1 = new PrintEvenOdd(max, 1);
		PrintEvenOdd r2 = new PrintEvenOdd(max, 0);
		
		Thread t1 = new Thread(r1, "Thread1");
		Thread t2 = new Thread(r2, "Thread2");
		
		t1.start();
		t2.start();
		
	}

}
