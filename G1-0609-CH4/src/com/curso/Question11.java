package com.curso;

public class Question11 {

	public static void main(String[] args) {

		final char a = 'A', e = 'E';
		char grade = 'Z';
		
		switch (grade) {
		default: System.out.println("default ");
		case a: System.out.println("a ");
		case 'B': case 'C': System.out.print("great ");
		case 'D':
			System.out.print("good ");
			break;
		case e:
		case 'F':
			System.out.print("not good ");
		}// great good -> B
		// default a great good
	}

}
