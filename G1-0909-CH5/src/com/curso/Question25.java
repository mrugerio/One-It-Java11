package com.curso;

import java.util.Arrays;

public class Question25 {

	public static void main(String[] args) {
		
		String[] s1 = { "Camel", "a", "Peacock", "Llama"};

		String[] s2 = { "Camel", "A", "Llama", "Peacock"};

		String[] s3 = { "Camel"};

		String[] s4 = { "Camel", null};
		
		//compare:  iguales=0, 1er>2do = #Positivo, 1er<2do = #Negativo
		//a < z, A < Z, A < a
		//mismatch: iguales=-1, Te regreso el indice donde son diferentes
		
		System.out.println(Arrays.compare(s1, s2));
		System.out.println(Arrays.mismatch(s1, s2));
		
		System.out.println(Arrays.compare(s3, s4));
		System.out.println(Arrays.mismatch(s3, s4));
		
		System.out.println(Arrays.compare(s4, s4));
		System.out.println(Arrays.mismatch(s4, s4));


	}

}
