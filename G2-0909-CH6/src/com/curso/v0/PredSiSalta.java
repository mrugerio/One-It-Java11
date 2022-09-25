package com.curso.v0;

public class PredSiSalta implements Predicado {

	@Override
	public boolean test(Animal a) {
		return a.puedeSaltar();
	}

}
