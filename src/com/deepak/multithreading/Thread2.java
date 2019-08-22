package com.deepak.multithreading;

public class Thread2 extends Thread{
	int number ;
	Table table;
	
	Thread2(int number, Table table){
		this.number = number;
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(number);
	}
}

