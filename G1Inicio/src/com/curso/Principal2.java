package com.curso;

public class Principal2 {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Donald");
		Pato pato2 = new Pato("Donald");
		
		System.out.println(pato1.equals(pato2));
	}

}
