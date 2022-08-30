package com.curso;

import java.io.PrintStream;
import java.util.Objects;

public class Pato{

	String name;
	
	public Pato(String name) {
		this.name = name;
		PrintStream ps;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return Objects.equals(name, other.name);
	}

	
	
}
