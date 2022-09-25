package com.curso.lambdas;

import java.util.*;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		
		List<String> listaString = Arrays.asList("Gato","Delfin","Pato");
		
		print(listaString,x -> x.endsWith("o"));
		System.out.println("****");
		print(listaString,w -> w.length()>5);
		System.out.println("****");
		print(listaString,str -> str.contains("in"));
	}
	
	private static void print(List<String> lista,
			Predicate<String> pre) {
		
		for(String s:lista) {
			if (pre.test(s)){
				System.out.println(s);
			}
		}
	}
}
