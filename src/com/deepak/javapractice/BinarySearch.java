package com.deepak.javapractice;

public class BinarySearch {
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
		
		System.out.println();
		
		int index = performBinarySearch(array, 144);
		System.out.println("14 is present at :"+index+" th position");
	}

	private static int performBinarySearch(int[] array, int x) {
		
		int l =0; 
		int r = array.length-1;
		while(l<r) {
			int m = l+(r-l)/2;
			if(array[m]==x) {
				return m;
			}
			
			if(x<array[m]) {
				r = m-1;
			}
			
			if(x>array[m]) {
				l = m+1;
			}
		}
		
		return -1;
		
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
