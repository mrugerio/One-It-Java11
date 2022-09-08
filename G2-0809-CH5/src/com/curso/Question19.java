package com.curso;

import java.util.*;

public class Question19 {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(10, 4, -1, 5);
		Collections.sort(lista); // -1, 4,5,10
		Integer converted[] = lista.toArray(new Integer[4]);
		System.out.println(converted[0]);
		//System.out.println(Arrays.toString(converted));

		int[] arreglo = { 6, -4, 12, 0, -10 };
		Arrays.sort(arreglo); //-10, -4, 0, 6, 12
		System.out.println(Arrays.binarySearch(arreglo, 12));

	}

}
