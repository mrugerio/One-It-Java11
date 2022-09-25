package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		String s1 = "hola";
		String s2 = "Hola";
		String s3 = "hola";
		String s4 = "5hola";
		
		System.out.println(s1.compareTo(s2));
		//+ porque h > H
		
		System.out.println(s2.compareTo(s1));
		//- porque H < h
		
		System.out.println(s1.compareTo(s3));//0
		
		System.out.println(s4.compareTo(s1));
		//+ porque Hh > #
		
		// minusculas > mayusculas > numeros
		
	}

}
