package com.curso.v5;

import java.util.*;
import java.util.function.Predicate;

public class ClientePrincipal {

	public static void main(String[] args) {
		System.out.println("V5");
		Predicate<Animal> pre1 =  a -> a.puedeSaltar();
		Predicate<Animal> pre2 =  a -> a.puedeNadar();
		
		List<Animal> listaAnimals = Arrays.asList(
				new Animal("Gato",true,false),
				new Animal("Delfin",false,true),
				new Animal("Pato",true,true));
		
		print (listaAnimals,pre1,pre2);
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
