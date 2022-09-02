package com.curso;

public class Principal3 {

	public static void main(String[] args) {
		
		int pig = (short)4;
		pig = pig++;
		long goat = (int)2;
		//goat = goat - 1.0;
		goat -= 1.0; 
		//System.out.print(pig + " - " + goat);

		long l = 5l;
		double d = 1.0;
		
		//l = l - d;
		l -= d;
		
		//4-1
		
		int a = 2, b = 4, c = 2;

		System.out.println(a > 2 ? --c : b++); //4 
		//b = 5; 
		//System.out.println(b);
		System.out.println(b = (a!=c ? a : b++)); //5
		//b = 5
		//System.out.println(b);
		System.out.println(a > b ? (b < c ? b : 2 ): 1); //1
		
		
		short s = (byte)10;
		
	}

}
