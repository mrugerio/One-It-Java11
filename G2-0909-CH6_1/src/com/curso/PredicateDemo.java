package com.curso;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<String> pre0 = x -> x.contains("x");
		System.out.println(pre0.test("México"));
		System.out.println(pre0.test("Colombia"));
		
		Predicate<Integer> pre1 = y -> Math.pow(y, 3)>200;
		System.out.println(pre1.test(5));
		System.out.println(pre1.test(6));
		
		
		
	}

}
