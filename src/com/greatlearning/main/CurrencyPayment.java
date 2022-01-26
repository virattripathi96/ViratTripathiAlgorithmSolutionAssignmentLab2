package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.*;

public class CurrencyPayment {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of curency denominations");
			int sizeOfDenominations = sc.nextInt();
			
			
			System.out.println("Enter the currency denominations value");
			int denominations[] = new int[sizeOfDenominations];
			for(int i = 0; i < sizeOfDenominations; i++) {
				denominations[i] = sc.nextInt();
			}
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			MergeSort mergeSort = new MergeSort();
			mergeSort.applySortDesc(denominations, 0, sizeOfDenominations - 1);
			NotesCount notesCount = new NotesCount();
			notesCount.notesCountImpl(denominations, amount);
		}
		
	}
}
