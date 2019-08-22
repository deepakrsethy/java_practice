package com.deepak.multithreading;

public class PrintEvenOdd implements Runnable{
	public static int num =1 ;
	public static Object lock = new Object();
	
	public int max;
	public int remainder;
	
	public PrintEvenOdd(int max, int remainder) {
		this.max = max;
		this.remainder = remainder;
	}
	
	@Override
	public void run() {
		while(num<max) {
			synchronized (lock) {
				while(num%2 != remainder) {// wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" : "+num);
				num++;
				lock.notifyAll();				
			}
		}		
	} 
}
