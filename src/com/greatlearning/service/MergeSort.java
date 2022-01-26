package com.greatlearning.service;

public class MergeSort {
	public void sortArray(int array[], int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = (left + right)/2;
		sortArray(array, left, mid);
		sortArray(array, mid+1, right);
		merge(array, left, mid, right);
	}
	
	public void merge(int array[], int left, int mid, int right) {
		// find size of left and right subarrays
		// Create temporary arrays -> init, copy data
		int leftArraySize = mid - left + 1;
		int rightArraySize = right - mid;
		int leftSubArray[] = new int[leftArraySize], 
			rightSubArray[] = new int[rightArraySize];
		for(int i = 0; i < leftArraySize; i++) {
			leftSubArray[i] = array[left + i];
		}
		for(int i = 0; i < rightArraySize; i++) {
			rightSubArray[i] = array[mid + i + 1];
		}
		int i = 0, j = 0, k = left;
		while(i < leftArraySize && j < rightArraySize) {
			if(leftSubArray[i] < rightSubArray[j]) {
				array[k] = leftSubArray[i];
				i++;
			} else {
				array[k] = rightSubArray[j];
				j++;
			}
			k++;
		}
		while(i < leftArraySize) {
			array[k] = leftSubArray[i];
			i++; k++;
		}
		while(j < rightArraySize) {
			array[k] = rightSubArray[j];
			j++; k++;
		}
		
	}
	
	
	public void applySort(int array[], int left, int right) {
		if(left >= right) {
			System.out.println("Invalid left and right parameters");
			return;
		}
		sortArray(array, left, right);

	}
	
	public void applySortDesc(int array[], int left, int right) {
		applySort(array, left, right);
		ArrayUtil.reverseArray(array, right+1);
	}
}
