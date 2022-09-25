package com.curso.v2;

import java.util.*;

public class ClientePrincipal {

	public static void main(String[] args) {
		
		Predicado pre1 = new Predicado() {
			@Override
			public boolean test(Animal a) {
				return a.puedeSaltar();
			}
		};
				
		Predicado pre2 = new Predicado() {
			@Override
			public boolean test(Animal a) {
				return a.puedeNadar();
			}
		};
		
		List<Animal> listaAnimals = Arrays.asList(
				new Animal("Gato",true,false),
				new Animal("Delfin",false,true),
				new Animal("Pato",true,true));
		
		print (listaAnimals,pre1,pre2);
	}
	
	private static void print(List<Animal> animals,
			Predicado pre1, Predicado pre2) {
		for (Animal a : animals) {
			boolean bSalta = pre1.test(a);
			System.out.println(a + ", salta?:" + bSalta);
			boolean bNada = pre2.test(a);
			System.out.println(a + ", nada?:" + bNada);
		}
	}
}
