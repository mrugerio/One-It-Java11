package com.curso;

import java.util.*;

public class Question23 {

	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();

		one.add("def");
		one.add("abc");

		List<String> two = new ArrayList<>();

		two.add("abc");
		two.add("def");

		if (one == two)
			System.out.println("A");
		else if (one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");
	}

}
