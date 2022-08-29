package com.curso;

import java.io.PrintStream;

public class Principal6 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 010; //8
		
		System.out.println(x+y); //9
		
		short s1 = 10;
		short s2 = 20;
		
		int r = s1 + s2;
		
		long l = 10;
		int i = 5;
		i = i + (int)l;
		
		i += l; // i = i+l;
		
		//Archivo.java => Archivo.class =>Ejecutar
		//Archivo.java => Ejecturar
		
		PrintStream ps = System.out;
		ps = System.err;
		
	}

}
