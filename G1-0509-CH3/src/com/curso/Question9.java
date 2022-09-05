package com.curso;

public class Question9 {

	public static void main(String[] args) {
		
		int a = 2, b = 4, c = 2;

		System.out.println(a > 2 ? --c : b++); //4; b=5;
		//System.out.println("b: "+b); //5
		System.out.println(b = (a!=c ? a : b++)); //5; b=5
		//System.out.println("b: "+b); //5
		System.out.println(a > b ? (b < c ? b : 2) : 1);
		
		//4,5,1

	}

}
