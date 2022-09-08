package com.curso.v1;

public class ClientePrincipal {

	public static void main(String[] args) {
		
		Predicado pre1 = new Predicado() {
			@Override
			public boolean test(Animal a) {
				return a.puedeSaltar();
			}
		};
		
		Predicado pre2 = new Predicado() {
			@Override
			public boolean test(Animal a) {
				return a.puedeNadar();
			}
		};
		
		Animal a1 = new Animal("Conejo",true,false);
		System.out.println(a1);
		boolean bSalta = pre1.test(a1); //Checar si puede saltar
		boolean bNadar = pre2.test(a1); //Checar si puede nadar
		System.out.println("PuedeSaltar?: "+bSalta);
		System.out.println("PuedeNadar?:  "+bNadar);
		
		Animal a2 = new Animal("Delfin",false,true);
		System.out.println(a2);
		bSalta = pre1.test(a2); //Checar si puede saltar
		bNadar = pre2.test(a2); //Checar si puede nadar
		System.out.println("PuedeSaltar?: "+bSalta);
		System.out.println("PuedeNadar?:  "+bNadar);
		
		Animal a3 = new Animal("Pato",true,true);
		System.out.println(a3);
		bSalta = pre1.test(a3); //Checar si puede saltar
		bNadar = pre2.test(a3); //Checar si puede nadar
		System.out.println("PuedeSaltar?: "+bSalta);
		System.out.println("PuedeNadar?:  "+bNadar);
		
		
		
	}

}
