package com.curso.v6;

import java.util.*;
import java.util.function.Predicate;

public class ClientePrincipal {

	public static void main(String[] args) {
		System.out.println("V5");
		
		List<Animal> listaAnimals = Arrays.asList(
				new Animal("Gato",true,false),
				new Animal("Delfin",false,true),
				new Animal("Pato",true,true));
		
		print (listaAnimals,a -> a.puedeSaltar(),a -> a.puedeNadar());
	}
	
	private static void print(List<Animal> animals,
			Predicate<Animal> pre1, Predicate<Animal> pre2) {
		for (Animal a : animals) {
			boolean bSalta = pre1.test(a);
			System.out.println(a + ", salta?:" + bSalta);
			boolean bNada = pre2.test(a);
			System.out.println(a + ", nada?:" + bNada);
		}
	}
}
