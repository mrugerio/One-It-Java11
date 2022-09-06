package com.curso;

import java.util.*;

public class Question10 {

	public static void main(String[] args) {

		List parrots = new ArrayList();
		
		parrots.add(new Object());
		parrots.add("hola");
		parrots.add(Integer.valueOf(4));
		
		for (var macaw : parrots)
			System.out.println(macaw);
	}

}
