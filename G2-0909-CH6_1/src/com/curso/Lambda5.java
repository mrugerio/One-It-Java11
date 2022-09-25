package com.curso;
import java.util.function.Predicate;

public class Lambda5 {
	
	String s;
	static int i;
	
	public void variables(int a) {
		int b = 1;
		s = "Hola";
		//a += 1;
		//b += 3;
		Predicate<Integer> p1 = e -> {
			System.out.println(s+""+i);
			int d = 0;
			int c = 0;
			return b == a;
		};
		
	}

}
