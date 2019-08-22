package com.deepak.javapractice;

public class QuickSort {
	public static void main(String[] args) {
		int array[] = {1,14,7,5,0,23,11};
		System.out.println("Array Before Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
		
		System.out.println();
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("Array After Sorting");
		for(int i : array) {
			System.out.print(i+",");
		}
	}

	private static void quickSort(int[] array, int low, int high) {
		if(low<high) {
			 /* pi is partitioning index, arr[pi] is  
            now at right place */
			int pivot = partition(array, low,  high);
			
			// Recursively sort elements before 
            // partition and after partition 
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
			
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1;
	}

}
