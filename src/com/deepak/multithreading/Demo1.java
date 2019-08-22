package com.deepak.multithreading;

public class Demo1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread : "+Thread.currentThread().getId()+" is running.");
	}
	
	
	public static void main(String[] args) {		
		for(int i =0; i<=10;i++) {
			Demo1 d = new Demo1();
			d.start();
		}
	}

}

