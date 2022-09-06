package com.curso;

public class TridimensionalArray {

	public static void main(String[] args) {

		int[][] twoD = new int[3][];
		twoD[0] = new int[5];
		twoD[1] = new int[3];
		twoD[2] = new int[9];
		
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		System.out.println("****");
		for (int[] inner : twoD) { 
			for (int num : inner) 
				System.out.print(num + " "); 
			System.out.println(); }
	}

}
