package com.greatlearning.main;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		
		System.out.println("Enter values for the array");
		int transactionsArray[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			transactionsArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int numTargets = sc.nextInt();
		for(int i = 0; i < numTargets; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int achievedAfter = findTargetPosition(target, transactionsArray, arraySize);
			if(achievedAfter == -1) {
				System.out.println("Given target is not achieved");
			} else {
				System.out.println("Target achieved after " + achievedAfter + " transactions");
			}
		}
		sc.close();
	}

	private static int findTargetPosition(int target, int[] array, int arraySize) {
		int position = 0;
		while(position < arraySize && target > 0) {
			target -= array[position++];
		}
		if(target > 0) {
			return -1;
		}
		return position;
	}
}