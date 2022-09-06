package com.curso;

import java.util.Arrays;

public class ArrayType {
	public static void main(String args[]) {

		String[] bugs = { "cricket", "beetle", "ladybug" };

		String[] alias ={ "cricket", "beetle", "ladybug" };
		System.out.println(bugs.equals(alias)); //false
		System.out.println(bugs.toString());
		System.out.println(Arrays.toString(bugs));
		
		String[] mammals = {"monkey", "chimp", "donkey"}; 
		System.out.println(mammals.length);
		System.out.println("otro".length());
		System.out.println(new StringBuilder("").length());

		int[] numbers = { 6, 9, 1 }; 
		Arrays.sort(numbers); 
		
		for (int i = 0; i < numbers.length; i++) 
			System.out.print(numbers[i] + " ");
		System.out.println("");
		for (int i : numbers)
			System.out.print(i + " ");
		System.out.println("");
		String[] strings = { "10", "9", "100" }; 
		Arrays.sort(strings); 
		for (String string : strings) 
			System.out.print(string + " ");
		//10,100,9
		System.out.println("*******");
		int[] numeros = new int[] {3,2,1};
		Arrays.sort(numeros);
		System.out.println(Arrays.binarySearch(numeros, 2)); 
		System.out.println(Arrays.binarySearch(numeros, 3));
		System.out.println(Arrays.binarySearch(numeros, 10));

	}
}
