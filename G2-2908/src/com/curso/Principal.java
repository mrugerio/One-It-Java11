package com.curso;

public class Principal {

	public static void main(String[] args) {

		String x = "hola"; //POOL STRINGS
		String y = "hola";
		String z = "hola"; //x/3 OBJETOS /x/0 OBJETOS
		//c/3 VARIABLES /c/1 OBJETO
		
		boolean r = (y == z); //true
		System.out.println(r);
		
		String m = new String("hola");
		r = (x == m.intern()); //true
		System.out.println("m: "+r);
		
		String w = new String("hola");
		String v = new String("hola"); //x/2 OBJETOS
		//x/3 VARIABLES 
		//c/ 6 VARIABLES /c/4 OBJETOS
		
		r = (w == z); //false
		System.out.println(r);

		boolean res = x.equals(z); //true
		res = x.equals(w); //true
		
		System.out.println("x.equals(w): "+res);
		
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("hello");
		
		res = s1.equals(s2); //x/true /c/false
		System.out.println("s1.equals(s2): "+res);
		
		//String m = new String("hola");
		//String n = m;


	}

}
