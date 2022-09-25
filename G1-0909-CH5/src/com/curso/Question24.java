package com.curso;

import java.util.*;

public class Question24 {

	public static void main(String[] args) {
		new Question24().run(
				new Integer[] {1,2,3}, new Double[] {1.0,2.0,3.0});
	}
	
	public void run(Integer[] ints, Double[] doubles) {
		//Mutable
		List<Integer> intList = Arrays.asList(ints);
		intList.set(0, 4);
		//intList.add(4);
		//intList.remove(2);
		System.out.println(intList);
		System.out.println("[] ints: "+Arrays.toString(ints));
		
		//Inmutable
		List<Double> doubleList = List.of(doubles);
		//doubleList.set(0, 4.0);
		//doubleList.add(5.0);
	}

}
