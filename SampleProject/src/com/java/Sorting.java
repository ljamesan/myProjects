package com.java;

public class Sorting {
	
	public static void main(String[] args) {
		
		int[] arr = {8,4,3,7,9,2,1,8};
		
		//selectionSort(arr);
		//bubbleSort(arr);
		quickSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	
	}
	public static void quickSort(int[] arr) {
		quickSort(arr, 0,arr.length-1);
	}
	private static void quickSort(int[] arr, int left, int right) {
		if(left<right) {
			int index  = partitionWithMiddleElementPivot(arr,left,right);
			//int index  = partitionWithLastElementPivot(arr,left,right);
			quickSort(arr,left,index);
			quickSort(arr,index+1,right);
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
	
	
	private static int partitionWithLastElementPivot(int[] arr, int low, int high) {
		int pivot = arr[high];  
	    int i = (low-1);  
	    for (int j=low; j<high; j++) { 
	        if (arr[j] <= pivot){ 
	            i++; 
	            swap(arr,i,j);
	        } 
	    }
	    swap(arr,i+1,high);
	    return i+1;
	}
	
	private static void swap(int[] arr, int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
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
