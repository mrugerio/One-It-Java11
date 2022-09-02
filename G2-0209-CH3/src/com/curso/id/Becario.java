package com.curso.id;


public class Becario {
	
	String Nombre;
	//ALTO ACOMPLAMIENTO
	CompuWindows compu = 
			new CompuWindows("Windows XP");

	CompuLinux compuLinux = 
			new CompuLinux("Ubuntu 11.10");
	
	public Becario(String nombre) {
		Nombre = nombre;
	}
	
	void prederCompu() {
		compu.encenderCompu();
	}

}
