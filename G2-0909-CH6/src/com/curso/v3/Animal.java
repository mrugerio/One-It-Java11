package com.curso.v3;

public class Animal {

	private String name;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		name = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean puedeSaltar() {
		return canHop;
	}

	public boolean puedeNadar() {
		return canSwim;
	}

	public String toString() {
		return name;
	}

}
