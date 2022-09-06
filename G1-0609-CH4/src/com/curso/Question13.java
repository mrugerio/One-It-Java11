package com.curso;

public class Question13 {

	public static void main(String[] args) {
		new Question13().countAttendees();
	}

	private void countAttendees() {
		int participants = 4, animals = 2, performers = -1;

		while ((participants = participants + 1) < 10) {
		}
		
		do {
		} while (animals++ <= 1);
		
		for (; performers < 2; performers += 2) {
		}

		System.out.println(participants); //10
		System.out.println(animals); //3
		System.out.println(performers); //3

	}

}
