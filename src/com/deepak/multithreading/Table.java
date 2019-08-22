package com.deepak.multithreading;

public class Table {
	
	public synchronized void printTable(int n) {
		for(int i = 1; i<=10;i++) {
			System.out.println( n+" X "+i+" = "+(n*i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
