package com.curso;

import java.util.Arrays;

public class Mismatch {

	public static void main(String[] args) {
		
		System.out.println(new int[]{1,2,3}.equals(new int[]{1,2,3}) ); 


		System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); //-1
		System.out.println(Arrays.mismatch(new String[] {"a"},new String[] {"A"})); //0
		System.out.println(Arrays.mismatch(new int[] {1, 2,3}, new int[] {1,2,3,9})); //1
	}

}
