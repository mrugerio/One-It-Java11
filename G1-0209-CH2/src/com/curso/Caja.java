package com.curso;

public class Caja {
	
	long ancho;
	long largo;
	Caja cajaIns;
	
	public Caja(long ancho, long largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	void asignarCaja(Caja c) {
		cajaIns = c;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", largo=" + largo + "]";
	}

	

}
