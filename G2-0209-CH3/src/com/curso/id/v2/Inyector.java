package com.curso.id.v2;

public class Inyector {
	
	static Compu linux = new CompuLinux("Fedora 8");
	static Compu windows = new CompuWindows("Windows 10");
	static Compu mac = new CompuMac("Sierra 15");
	
	//SPRING
	static void inyectaPc(Becario bec, char c) {
		if (c == 'w') 
			bec.compu = windows;
		else if (c == 'm') 
			bec.compu = mac;
		else
			bec.compu = linux;
	}

}
