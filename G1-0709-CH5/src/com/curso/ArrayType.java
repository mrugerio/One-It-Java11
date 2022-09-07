package com.curso;

import java.util.Arrays;
import static java.util.Arrays.*;

public class ArrayType {
	public static void main(String args[]) {

		String [] bugs  = { "cricket", "beetle", "ladybug" };
		String [] alias = { "cricket", "beetle", "ladybug" };
		System.out.println(bugs.equals(alias)); //false 
		System.out.println(bugs);
		System.out.println(Arrays.toString(bugs));
		
		int[] numbers = new int[10]; 
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers1 = new int[10];
		//numbers1[10] = 3;
		//numbers1[numbers1.length] = 5;
		//for (int i = 0; i <= numbers.length; i++) 
		//	numbers[i] = i + 5;
		
		int[] numbers2 = { 6, 9, 1 }; 
		sort(numbers2); 
		for (int i = 0; i < numbers2.length; i++) 
			System.out.print(numbers2[i] + " ");
		
		System.out.println("***");
		
		int[] numbers3 = { 8, 11, 3 }; 
		sort(numbers3);
		for  (int i : numbers3) {
			System.out.print(i+ " ");
		}
		System.out.println("***");
		String[] strings = { "10","ana", "9","Ana", "100" }; 
		sort(strings); 
		for (String string : strings) 
			System.out.print(string + " ");
		//10,100,9,Ana,ana
		
	}
}
