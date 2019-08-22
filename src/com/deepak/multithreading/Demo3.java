package com.deepak.multithreading;

public class Demo3 extends Thread {
	private static int counter = 1;

	@Override
	public void run() {		
		printValue();		
	}

	private synchronized void printValue() {
		for(int i =1; i<=5;i++) {			
			System.out.println(Thread.currentThread().getName()+" printing "+i);
		}		
	}

	public static void main(String[] args) {
		Demo3 t1 = new Demo3();
		t1.setName("Thread 1");
		Demo3 t2 = new Demo3();
		t2.setName("Thread 2");
		
		t1.start();		
		t2.start();


	}

}
