package com.curso;

public class Question8 {

	public static void main(String[] args) {
		int pig = (short)4;
		pig = pig++; //NO HACE NADA
		//pig++;
		System.out.println("Pig: "+pig); //4
		long goat = (int)2; 
		//goat = goat - 1.0;
		goat -= 1.0; 
		System.out.print(pig + " - " + goat);
	}

}
