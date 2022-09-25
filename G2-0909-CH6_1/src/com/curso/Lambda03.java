package com.curso;
import java.util.Comparator;

public class Lambda03 {

	public static void main(String[] args) {
		
		//int c = 9;
		Comparator<StringBuilder> csb =
				(a, b) -> { 
					System.out.println("Paso X Comp");
					int r = 0; 
					return 5;
				};
				
		int r = csb.compare(new StringBuilder("a"), 
				new StringBuilder("a"));
		
		System.out.println(r);
	}

}
