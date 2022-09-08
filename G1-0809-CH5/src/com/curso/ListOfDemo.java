package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfDemo {

	public static void main(String[] args) {

		String[] arreglo = {"hawk", "robin"};
		//LA LISTA ES INMUTABLE
		List<String> lista = List.of(arreglo); 
		
		arreglo[0] = "patrobas";
		System.out.println(Arrays.toString(arreglo));
		//TAMAÑO FIJO
		//lista.add("patrobas");
		//lista.remove(0);
		//lista.set(0, "patrobas");
		System.out.println(lista);
		
		List<String> lista2 = new ArrayList<>(List.of(arreglo));
		lista2.add("robin");
		System.out.println(lista2);
	

	}

}
