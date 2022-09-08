package com.curso.v3;

import java.util.*;

public class ClientePrincipal {

	public static void main(String[] args) {
		
		Predicado pre1 = x -> x.puedeSaltar();
		Predicado pre2 = y -> y.puedeNadar();
		
		List<Animal> listaAnimals = new ArrayList<>(
				Arrays.asList(new Animal("Conejo",true,false),
						new Animal("Delfin",false,true),
						new Animal("Pato",true,true)
						)
				);
		
		print(listaAnimals,pre1,pre2);
		
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
