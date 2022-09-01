package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Swan.contador);
		
		Swan s1 = new Swan();
		Swan s2 = new Swan();
		
		s1.numberEggs = 5;
		s2.numberEggs = 8;
		
		System.out.println(s1.contador);
		System.out.println(s2.contador);

	}

}
