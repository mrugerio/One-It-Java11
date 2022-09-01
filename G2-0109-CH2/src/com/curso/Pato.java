package com.curso;

public class Pato {
	
	String name;
	int edad;
	static int contador;
	
	public Pato(String name, int edad) {
		this.name = name;
		this.edad = edad;
		contador++;
	}
	
	void addContador() {
		System.out.println(name);
		System.out.println(edad);
		contador++;
	}
	
	static void volar() {
		contador++;
		//System.out.println(name);
		//System.out.println(edad);
	}
	

}
