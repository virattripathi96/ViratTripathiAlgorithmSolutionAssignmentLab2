package com.greatlearning.service;

public class ArrayUtil {
	public static void printArray(int array[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	public static void reverseArray(int array[], int size) {
		int i = 0; 
		while(i < size - i - 1) {
			int temp = array[i];
			array[i] = array[size - i - 1];
			array[size - i - 1] = temp;
			i++;
		}
	}
}