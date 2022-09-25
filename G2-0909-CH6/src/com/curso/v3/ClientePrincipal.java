package com.curso.v3;

import java.util.*;

public class ClientePrincipal {

	public static void main(String[] args) {
		System.out.println("V3");
		Predicado pre1 =  a -> a.puedeSaltar();
		Predicado pre2 =  a -> a.puedeNadar();
		
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
