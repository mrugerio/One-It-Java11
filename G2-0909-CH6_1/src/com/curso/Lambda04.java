package com.curso;
import java.util.function.Predicate;

public class Lambda04 {
	
	
	public void variables(int a) {
		int b = 1;
		Predicate<Integer> p1 = e -> {
			int d = 0;
			int c = 0;
			return d == a;
		};
	}

}
