package com.curso.v6;

public class Animal {

	private String especie;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		especie = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean puedeSaltar() {
		return canHop;
	}

	public boolean puedeNadar() {
		return canSwim;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie+"]";
	}

	

}