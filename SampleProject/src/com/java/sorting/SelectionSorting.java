package com.java.sorting;

public class SelectionSorting {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		
		selectionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void selectionSort(int[] arr) {
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length-i; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp= arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
