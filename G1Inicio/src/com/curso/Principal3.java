package com.curso;

public class Principal3 {

	public static void main(String[] args) {
		
		//StringBuilder es Mutable
		StringBuilder s1 = new StringBuilder("Hello");
		
		StringBuilder s2 = s1;
		
		s2 = s2.append(" World");
		
		System.out.println("s1: "+s1); //x/"Hello" /c/"Hello World"
		
		
		
	}

}
