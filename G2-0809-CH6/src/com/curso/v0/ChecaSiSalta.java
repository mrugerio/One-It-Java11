package com.curso.v0;

public class ChecaSiSalta implements Predicado {

	@Override
	public boolean test(Animal a) {
		return a.puedeSaltar();
	}

}
