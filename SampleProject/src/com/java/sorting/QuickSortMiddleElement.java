package com.java.sorting;

import java.util.Arrays;

public class QuickSortMiddleElement {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		
		quickMiddleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	public static void quickMiddleSort(int[] arr) {
		quickMiddleSort(arr, 0,arr.length-1);
	}
	
	private static void quickMiddleSort(int[] arr, int left, int right) {
		if(left<right) {
			int index  = partitionWithMiddleElementPivot(arr,left,right);
			quickMiddleSort(arr,left,index);
			quickMiddleSort(arr,index+1,right);
		}
	}
	private static int partitionWithMiddleElementPivot(int[] arr, int left, int right) {
		int pivot= arr[(left+right)/2];
		while(true) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
			if(left>=right) {
				return right;
			}
			swap(arr,left,right);
			left++;
			right--;
		}
	}
	
	private static void swap(int[] arr, int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
	}

}
