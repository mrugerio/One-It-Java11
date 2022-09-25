package com.curso;

public class Empleado {
	
	private String name;
	private int edad;
	private double sueldo;
	
	public Empleado(String name, int edad, double sueldo) {
		super();
		this.name = name;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [name=" + name + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
	

}
