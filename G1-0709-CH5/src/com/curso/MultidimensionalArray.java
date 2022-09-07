package com.curso;

import java.util.*;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int x = 0;
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				twoD[i][j] = ++x;
		}
		
		System.out.println(twoD[0][0]);
		System.out.println(twoD[2][0]);
		System.out.println(twoD[2][1]);
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(4);
		lista2.add(8); //indice 1
		lista2.add(6);
		
		List<List<Integer>> lista3 = new ArrayList<>();
		lista3.add(lista1);
		lista3.add(lista2);
		
		boolean resultado = false;
		for (List<Integer> lista : lista3) {
			for (int i:lista) {
				System.out.print(i+" ");
				if (i==5) {
					resultado = true;
				}
			}
			System.out.println();
		}
		System.out.println(resultado);


		
	}

}
