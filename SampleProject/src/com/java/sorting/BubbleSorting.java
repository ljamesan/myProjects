package com.java.sorting;

import java.util.Arrays;

public class BubbleSorting {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		
		bubbleSort(arr);
		
		//System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr) {
		boolean swap;
		for (int i = 1; i < arr.length; i++) {
			swap=false;
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}
				System.out.println(Arrays.toString(arr));
			}
			
			if(!swap) {
				break;
			}
		}
		
	}

}
