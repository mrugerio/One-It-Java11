package com.curso.v0;

public class ChecaSiNada implements Predicado {

	@Override
	public boolean test(Animal a) {
		return a.puedeNadar();
	}

}
