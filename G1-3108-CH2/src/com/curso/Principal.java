package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Pato.contador);

		Pato pato = new Pato();
		
		System.out.println(pato.name);
		System.out.println(pato.edad);
		
		Pato pato1 = new Pato("Lucas");
		Pato pato2 = new Pato("Donald");
		System.out.println(pato1.name);
		System.out.println(pato2.name);

		System.out.println(pato1.contador);
		System.out.println(pato2.contador);
	}

}
