package com.curso;

public class Principal5 {

	public static void main(String[] args) {

		int x = 10;
		String s = "Hola";
		StringBuilder sb = new StringBuilder("Hello");
		
		actualizar(x,s,sb); //Pasamos variables por Valor
		
		System.out.println(x); //10
		System.out.println(s); //Hola 
		System.out.println(sb); //Hello World 

	}

	private static void actualizar(int x, String s, StringBuilder sb) {
		x = x + 10;
		s.concat(" Mundo");
		sb.append(" World");
		
		System.out.println(x); //20
		System.out.println(s); //Hola
		System.out.println(sb); //Hello World


	}

}
