package com.curso;

import java.util.*;

public class Question19 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		
		Integer converted[] = list.toArray(new Integer[4]);
		System.out.println(converted[0]); //-1

		int[] array = { 6, -4, 12, 0, -10 };
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 12));
		
	}

}
