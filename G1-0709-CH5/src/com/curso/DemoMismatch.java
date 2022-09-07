package com.curso;

import java.util.Arrays;

public class DemoMismatch {

	public static void main(String[] args) {

		System.out.println(Arrays.mismatch(
				new int[] { 1 }, new int[] { 1 }));
		
		
		System.out.println(Arrays.mismatch(
				new String[] { "a" },new String[] { "A" }));
		
		System.out.println(Arrays.mismatch(
				new int[] { 1,2,3,4,5,6,7 }, new int[] { 1,2,3,4,5,6 }));
	}

}
