package com.curso;

import java.util.*;

public class Question24 {

	public static void main(String[] args) {
		new Question24().run(new Integer[]{1,2,3}, new Double[]{3.4,6.7});
		new Question24().run(new int[]{1,2,3});
	}

	public void run(Integer[] ints, Double[] doubles) {

		List<Integer> intList = Arrays.asList(ints);
		//intList.add(3);
		intList.set(0, 0);
		System.out.println(intList);
		System.out.println(Arrays.toString(ints));

		List<Double> doubleList = List.of(doubles);
		//doubleList.add(3.4);
		//doubleList.set(0, 0.0);
		//System.out.println(doubleList);
	
	}
	
	public void run(int[] ints) {
		
	}

}
