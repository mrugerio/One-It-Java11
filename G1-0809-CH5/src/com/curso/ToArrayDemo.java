package com.curso;

import java.util.*;

public class ToArrayDemo {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("hawk"); 
		lista.add("robin"); 
		
		Object[] objectArray = lista.toArray(); 
		
		String[] stringArray = 
				lista.toArray(new String[0]);
		
		lista.clear(); 
		System.out.println(lista);
		System.out.println(Arrays.toString(stringArray));
		System.out.println(objectArray.length); //2
		System.out.println(stringArray.length); //2
		
		
	}

}
