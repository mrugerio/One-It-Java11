package com.curso;

public class Aguila extends Ave {
	
	String tipo = "Aguila";
	
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
	
	void volarAguila() {
		System.out.println("Volar como Aguila");
	}

}
