package com.curso;

import java.util.*;

public class Question20 {

	public static void main(String[] args) {
		double one = Math.pow(1, 2);
		System.out.println(one);
		
		int two = Math.round(1.0f);
		System.out.println(two);
		
		double three = Math.random();
		
		var doubles = new double[] { one, two, three};
		
		String [] names = {"Tom", "Dick", "Harry"};
		
		var other = Arrays.asList(names);
		other.set(0, "Sue");
		
		System.out.println(other);
		
		
		
	}

}
