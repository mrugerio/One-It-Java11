package com.curso.v4;

import java.util.*;

public class ClientePrincipal {

	public static void main(String[] args) {
		
		List<Animal> listaAnimals = new ArrayList<>(
				Arrays.asList(new Animal("Conejo",true,false),
						new Animal("Delfin",false,true),
						new Animal("Pato",true,true)
						)
				);
		print(listaAnimals,x -> x.puedeSaltar(),y -> y.puedeNadar());
	}
	
	private static void print(List<Animal> animals,
			Predicado pre1, Predicado pre2) {
		
		for (Animal a : animals) {
			System.out.println(a);
			boolean bSalta = pre1.test(a); //Checar si puede saltar
			boolean bNadar = pre2.test(a); //Checar si puede nadar
			System.out.println("PuedeSaltar?: "+bSalta);
			System.out.println("PuedeNadar?:  "+bNadar);
			
		}
		
	}

}
