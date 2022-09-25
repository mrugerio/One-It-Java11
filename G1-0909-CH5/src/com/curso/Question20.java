package com.curso;

import java.util.*;

public class Question20 {

	public static void main(String[] args) {

		double one = Math.pow(1, 2);
		long two = Math.round(1.0);
		double three = Math.random();
		
		var doubles = new double[] { one, two, three};
		
		String [] names = {"Tom", "Dick", "Harry"};
		List<String> list = Arrays.asList(names);
		var other = Arrays.asList(names);
		other.set(0, "Sue");
		
		System.out.println(Arrays.toString(names));
		System.out.println(list);
		
	}

}
