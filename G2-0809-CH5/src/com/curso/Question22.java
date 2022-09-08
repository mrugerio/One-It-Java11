package com.curso;

import java.util.*;

public class Question22 {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		for (Integer age : ages) 
			System.out.print(age);
	}

}
