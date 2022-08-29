package com.curso;

public class Principal3 {

	public static void main(String[] args) {

		Pato pato1 = new Pato("Lucas");
		Pato pato2 = new Pato("Lucas");
		
		System.out.println(pato1.equals(pato2));
		System.out.println(pato1==pato2);
	}

}
