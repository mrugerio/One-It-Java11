package com.curso;

public class Principal5 {

	public static void main(String[] args) {
		
		int x = 5;
		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		
		transforma(x,s,sb); //Paso por Valor
		
		System.out.println(x); //5
		System.out.println(s); //Hello
		System.out.println(sb); //Hola Mundo
	}

	private static void transforma(int x, String s, StringBuilder sb) {
		x = x+10;
		s.concat(" World");
		sb.append(" Mundo");
		
		System.out.println(x); //15
		System.out.println(s); //Hello
		System.out.println(sb); //Hola Mundo
	}

	
}
