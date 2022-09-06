package com.curso;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int[] twoD[][] = new int[3][][];
		
		for (int[]inner[] : twoD) { 
			for (int num[] : inner) 
				for (int i : num) 
					System.out.print(i + " "); 
		}
	}

}
