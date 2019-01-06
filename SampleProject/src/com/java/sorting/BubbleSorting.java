package com.java.sorting;

public class BubbleSorting {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		
		bubbleSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static void bubbleSort(int[] arr) {
		boolean swap;
		for (int i = 0; i < arr.length; i++) {
			swap=false;
			for (int j = i; j < arr.length; j++) {
				if(arr[i]> arr[j]) {
					int temp= arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
			System.out.println("Pass: "+(i+1));
		}
		
	}

}
