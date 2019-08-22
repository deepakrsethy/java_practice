
package com.deepak.multithreading;

public class Thread1 extends Thread{
	int number ;
	Table table;
	
	Thread1(int number, Table table){
		this.number = number;
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(number);
	}

}
