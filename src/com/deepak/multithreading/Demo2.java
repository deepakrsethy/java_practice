package com.deepak.multithreading;

public class Demo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getId()+" is running.");
	}
	
	public static void main(String[] args) {		
		for(int i =0; i<=10;i++) {
			Thread t = new Thread(new Demo2());
			t.start();
		}
	}
	
}
