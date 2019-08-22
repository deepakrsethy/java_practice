package com.deepak.multithreading;

public class TestSynchronize {
	public static void main(String[] args) {
		Table table = new Table();
		Thread1 t1 = new Thread1(5, table);
		Thread2 t2 = new Thread2(7, table);
		
		t1.start();
		t2.start();
		
	}

}
