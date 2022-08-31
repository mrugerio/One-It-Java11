package com.curso;

public class Pato {

	String first = "Theodore";
	String last = "Moose";
	String full = first + last;
	
	
	String name; // variable de instancia (objeto)
	int edad; // variable de instancia (objeto)

	static int contador = 10;// variable de clase (Global)

	void volar(String nombre) {
		String name; // variable local
	}

	Pato() {
		this(8, "Lucas");
	}

	Pato(String name) {
		super(); // Opcional
		this.name = name;
	}

	// Overloading (Sobrecarga)
	Pato(int edad, String name) {

		this.edad = edad;
		this.name = name;
	}
	
	
}
