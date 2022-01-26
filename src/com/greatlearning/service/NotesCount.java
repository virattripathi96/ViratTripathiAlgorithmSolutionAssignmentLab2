package com.greatlearning.service;

public class NotesCount {
	public void notesCountImpl(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		for(int i = 0; i < notes.length; i++) {
			
			int denominationCount = amount / notes[i];
			int remainingAmount = amount % notes[i];
			notesCounter[i] = denominationCount;
			amount = remainingAmount;
		}
		if(amount > 0) {
			System.out.println("Sorry, we canot get exact denominations for the given amount");
			return;
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i = 0; i < notes.length; i++) {
			if(notesCounter[i] > 0) {
				System.out.println("" + notes[i] + ":" + notesCounter[i]);
			}
		}
	}
}