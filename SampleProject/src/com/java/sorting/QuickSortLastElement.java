package com.java.sorting;

import java.util.Arrays;

public class QuickSortLastElement {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 9, 8, 2, 7, 5};
		
		quickLastSort(arr);
		
		System.out.println( Arrays.toString(arr));
	}
	
	public static void quickLastSort(int[] arr) {
		quickLastSort(arr, 0,arr.length-1);
	}
	
	private static void quickLastSort(int[] arr, int left, int right) {
		if(left<right) {
			int index  = partitionWithLastElementAnotherApproach(arr,left,right);
			quickLastSort(arr, left, index-1);
			quickLastSort(arr, index+1, right);
		}
	}
	
	private static int partitionWithLastElementPivot(int[] arr, int left, int right) {
		int p = arr[right];
        int i = left-1;
        for(int j=left; j<=right; j++){
            if(arr[j] < p){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,right);
        System.out.println(Arrays.toString(arr));
        return i+1;
	}
	
	private static int partitionWithLastElementAnotherApproach(int arr[], int left, int right) {
		 int pivotIndex = right;
		int pivot = arr[pivotIndex];
      

        while(left < right){
            while(left < right && arr[left] < pivot){
                left++;
            }
            while(left < right && arr[right] >= pivot){
                right--;
            }
            swap(arr,left, right);
        }
        swap(arr, left, pivotIndex);
        
        return left;
    }
	
	private static void swap(int[] arr, int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
	}

}
