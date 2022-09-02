package com.curso.id.v1;

public class Inyector {
	//SPRING
	static void inyectaPc(Becario bec) {
		bec.compu = new CompuLinux("Fedora 8");
	}

}
