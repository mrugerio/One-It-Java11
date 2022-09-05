package com.curso;

public class Question17 {

	public static void main(String[] args) {
		int ticketsTaken = 1;
		int ticketsSold = 3;

		ticketsSold += 1 + ticketsTaken++; //5 //ticketsTaken=2
		ticketsTaken *= 2; //4
		ticketsSold += (long)1; //6
		//ticketsSold = ticketsSold + (long)1; //NO COMPILA
		
		System.out.println("ticketsTaken: "+ticketsTaken);
		System.out.println("ticketsSold: "+ticketsSold);

	}

}
