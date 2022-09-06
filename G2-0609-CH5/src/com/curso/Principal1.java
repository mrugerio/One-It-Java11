package com.curso;

public class Principal1 {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("abc"); 
		StringBuilder b = a.append("de"); 
		//a = b
		//abcde
		b.append("f").append("g");
		//a = b
		//abcdefg
		System.out.println("a=" + a); 
		System.out.println("b=" + b);
		
		StringBuilder sb3 = new StringBuilder(10);
		
		System.out.println("sb3: "+sb3.append("abcdefghijklmnopq"));
		
	}

}
