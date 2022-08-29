package com.curso;

public class Principal4 {

	public static void main(String[] args) {

		String name = "Patrobas";
		generarNames(name);
		
		StringBuilder nombre = new StringBuilder("Andronico");
		generarNombres(nombre);
		
	}

	private static void generarNames(String name) {
		for (int x=0 ; x<10_000_000; x++) {
			String resultado = name+x;
			//System.out.println(resultado);	
		}
	}
	
	private static void generarNombres(StringBuilder nombre) {
		for (int x=0 ; x<10_000_000; x++) {
			StringBuilder resultado = nombre.append(x);
			System.out.println(resultado);	
		}
		
		String resultado = nombre.toString();
	}

}
