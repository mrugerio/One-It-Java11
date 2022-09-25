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
		
		Animal a1 = new Animal("Gato",true,false);
		boolean bSalta = pre1.test(a1);
		System.out.println(a1 + ", salta?:" + bSalta);
		boolean bNada = pre2.test(a1);
		System.out.println(a1 + ", nada?:" + bNada);
		
		Animal a2 = new Animal("Delfin",false,true);
		bSalta = pre1.test(a2);
		System.out.println(a2 + ", salta?:" + bSalta);
		bNada = pre2.test(a2);
		System.out.println(a2 + ", nada?:" + bNada);
		
		Animal a3 = new Animal("Pato",true,true);
		bSalta = pre1.test(a3);
		System.out.println(a3 + ", salta?:" + bSalta);
		bNada = pre2.test(a3);
		System.out.println(a3 + ", nada?:" + bNada);
		
	}

}
