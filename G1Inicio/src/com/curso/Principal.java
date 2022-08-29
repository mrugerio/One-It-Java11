package com.curso;

public class Principal {

	public static void main(String[] args) {

		//String es Inmutable
		String x = "Hola Mundo";
		//x = "Hello World";
		//x = null;
		String y = "Hola Mundo"; //no crea un objeto, usa el PS
		String z = "Hola Mundo"; //x/3 Objetos /C/1 Objeto
		//3 Variables
		// == Sirve para ver si 2 variables apuntan al mismo objeto
		
		boolean r = (x == z);
		//System.out.println(r);
		
		String w = new String("Hola Mundo");
		String v = new String("Hola Mundo"); //5 Objetos
		//C/3 Objetos
		
		r = (x == v);
		//System.out.println(r); //false
		//5 Variables
		
		System.out.println(x.equals(z)); //true
		System.out.println(x.equals(w)); //true
		
		StringBuilder s1 = new StringBuilder("Hello");
		StringBuilder s2 = new StringBuilder("Hello");
		r = (s1 == s2); //false
		//System.out.println(r);
		System.out.println("StringBuilder: "+s1.equals(s2)); //x/true /c/false

		// equals() ó == Exactamente el mismo resultado para Object
		
		s1.append(" World");
		System.out.println("s1: "+s1); //Hello World
		
	}

}
