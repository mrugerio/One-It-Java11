package com.curso;

public class Principal {

	public static void main(String[] args) {

		Caja c1 = new Caja(4,5);
		Caja c2 = new Caja(2,3);
		
		//c1.cajaIns = c2;
		
		c1.asignarCaja(c2);
		c2.asignarCaja(c2);
		
		System.out.println(c2);
		System.out.println(c2.cajaIns);
		
	}

}
