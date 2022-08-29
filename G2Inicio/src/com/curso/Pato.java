package com.curso;

import java.util.Objects;

public class Pato  {

	String nombre;
	
	Pato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return other.nombre.equals(((Pato)(obj)).nombre);
	}
	
	
}
