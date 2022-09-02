package com.curso.id.v1;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		Inyector.inyectaPc(bec1);
		bec1.prederCompu();
		
		Becario bec2 = new Becario("Andronico");
		Inyector.inyectaPc(bec2);
		bec2.prederCompu();

	}

}
