package com.curso.id.v2;

public class Becario {
	
	String nombre;
	//BAJO ACOPLAMIENTO
	Compu compu;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void prederCompu() {
		System.out.println(nombre);
		compu.encenderCompu();
	}

}
