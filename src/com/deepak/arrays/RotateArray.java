package com.deepak.arrays;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * e.g. given array [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 * Result should be [3, 4, 5, 6, 7,1, 2]
 */

public class RotateArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int d = 2, n = input.length;
        System.out.println("Input Array: ");
        printAraay(input, n);
        System.out.println("No of elements to rotate: " + d);
        int[] output = rotateArray(input, d, n);

        System.out.println("Rotated Array: ");
        printAraay(output, n);

    }

    private static void printAraay(int[] input, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

    private static int[] rotateArray(int[] input, int noOfElementsToRotate, int sizeOfArray) {
        for (int i = 0; i < noOfElementsToRotate; i++) {
            int temp = input[0];
            for (int j = 0; j < sizeOfArray - 1; j++) {
                input[j] = input[j + 1];
            }
            input[sizeOfArray - 1] = temp;

        }
        return input;
    }
}
//Time complexity : O(n * d)
//Auxiliary Space : O(1)