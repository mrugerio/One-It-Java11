package com.curso;

public class Chick {

	private String name = "Fluffy";
	{
		System.out.println("setting field");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");

	}

	public static void main(String[] args) {

		Chick chick = new Chick();

		System.out.println(chick.name);
	}
	{
		System.out.println("setting field 2");
	}
}
//setting field
//setting field 2
//setting constructor
//Tiny

