package com.curso;
import java.util.function.Predicate;

public class Question03 {

	public static void main(String[] args) {

		Predicate<String> p = (s) -> s.isEmpty();
		System.out.println(p.test("a"));
	}

}
