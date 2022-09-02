package com.curso.id.v2;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		Inyector.inyectaPc(bec1,'m');
		bec1.prederCompu();
		
		Becario bec2 = new Becario("Andronico");
		Inyector.inyectaPc(bec2,'w');
		bec2.prederCompu();
		
		Becario bec3 = new Becario("Tercio");
		Inyector.inyectaPc(bec3,'w');
		bec3.prederCompu();

	}

}
