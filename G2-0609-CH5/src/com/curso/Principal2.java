package com.curso;

public class Principal2 {

	public static void main(String[] args) {

		String s = "rat1";
		
		String first = "rat" + "1" ;
		//first += "1";
		
		System.out.println(s==first);
		String second = "r" + "a" + "t" + "1";
		System.out.println(s==second);

		String third = "r" + "a" + "t" + new String("1");
		System.out.println(first == second);
		
		//System.out.println(first == second.intern());
		//System.out.println(first == third);
		//System.out.println(first == third.intern());
	}

}
