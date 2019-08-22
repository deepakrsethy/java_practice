package com.deepak.javapractice;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {1,14,7,5,0,23,11};
		System.out.println("Array Before Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
		
		System.out.println();
		
		bubbleSort(array);
		
		System.out.println("Array After Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
	}

	private static void bubbleSort(int[] array) {
		int length = array.length;
		
		for(int i = 0; i < length-1; i++) {
			for(int j =0; j<length-i-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
	}

}
