package com.curso;

public class Caja {
	
	//has-a
	double ancho;
	double largo;
	Caja insCaja; //OJO
	
	public Caja(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	
}
