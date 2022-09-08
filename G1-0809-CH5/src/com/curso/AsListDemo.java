package com.curso;

import java.util.*;

public class AsListDemo {

	public static void main(String[] args) {
		String[] arreglo = { "hawk", "robin" }; 
		List<String> lista = Arrays.asList(arreglo);
		
		//TAMAÑO FIJO
		//lista.add("patrobas");
		//lista.remove(0);
		lista.set(0, "patrobas");
		arreglo[1] = "andronico";
		
		System.out.println(lista);
		System.out.println(Arrays.toString(arreglo));
		System.out.println("*******");
		
		List<String> lista2 = new ArrayList<>(Arrays.asList(arreglo));
		lista2.add("robin");
		System.out.println(lista2);


	}

}
