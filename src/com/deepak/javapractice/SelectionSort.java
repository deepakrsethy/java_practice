package com.deepak.javapractice;

public class SelectionSort {
	
	public static void main(String[] args) {
		int array[] = {1,14,7,5,0,23,11};
		System.out.println("Array Before Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
		
		System.out.println();
		
		selectionSort(array);
		
		System.out.println("Array After Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
	}

	private static void selectionSort(int[] array) {
		int length = array.length;
		for(int i =0; i<length-1; i++) {
			int min_index = i;
			for(int j = i+1; j<length; j++) {
				if(array[j]< array[min_index]) {
					min_index = j;
				}
			}
			int temp = array[min_index];
			array[min_index] = array[i];
			array[i] =temp;
		}
		
	}

}
