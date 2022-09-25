package com.curso.lambdas;

import java.util.*;
import java.util.function.Predicate;

public class Principal1 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(4,5,6,7);
		
		print(lista, (Integer x) -> {
								String s= "hola";
								System.out.println("Paso por la lambda");
								System.out.println(s);
								return x > 5;
							});
		
		//print(lista, x -> x > 5);
		
		System.out.println("****");
		
		print(lista,z -> Math.pow(z, 3)>200);
		
	}
	
	private static void print(List<Integer> lista,
			Predicate<Integer> pre) {
		
		for(int s:lista) {
			if (pre.test(s)){
				System.out.println(s +" "+(Math.pow(s, 3)));
			}
		}
	}
}
