package com.curso;

public class PrincipalCast {

	public static void main(String[] args) {

		AguilaReal ave01 = new AguilaReal();
		System.out.println("Tipo: "+ave01.tipo);
		ave01.volar();
		ave01.volarAve();
		ave01.volarAguila();
		ave01.volarAguilaReal();
		System.out.println("**************");
		
		Aguila ave02 = new AguilaReal();
		System.out.println("Tipo: "+ave02.tipo);
		ave02.volar();
		ave02.volarAve();
		ave02.volarAguila();
		//ave02.volarAguilaReal(); //NO PUEDE
		((AguilaReal)ave02).volarAguilaReal();

		System.out.println("**************");
		Ave ave03 = new AguilaReal();
		System.out.println("Tipo: "+ave03.tipo);
		ave03.volar();
		ave03.volarAve();
		//ave03.volarAguila(); //NO PUEDE
		((Aguila)ave03).volarAguila();
		//ave03.volarAguilaReal(); //NO PUEDE
		((AguilaReal)ave03).volarAguilaReal();
		
		System.out.println("**************");

		AguilaReal aReal = new AguilaReal();
		Aguila aguila = aReal;
		Ave ave = aguila;
		Object o = ave;
		
		((AguilaReal)ave).volarAguilaReal();
		((AguilaReal)aguila).volarAguilaReal();
		
		Ave otraAve = new AguilaReal();
		AguilaReal otraAguilaReal = (AguilaReal)otraAve;
		otraAguilaReal.volarAguilaReal();
		
		((AguilaReal)otraAve).volarAguilaReal();
		
		System.out.println("*************");
		//DEMO INSTANCE OF
		
		AguilaReal otraAguilaReal01 = 
				new AguilaReal();
		Aguila otraAguila01 = otraAguilaReal01;
		Ave otraAve01 = otraAguila01;
		
		if (otraAve01 instanceof AguilaCalva) {
			AguilaCalva aguilaCalva = 
					(AguilaCalva)otraAve01;
			aguilaCalva.volarAguilaCalva();
		} else if(otraAve01 instanceof AguilaReal) {
			
		}
		
		Integer zooTime = Integer.valueOf(0); 
		Number num = zooTime; 
		Object obj = zooTime;
		
		System.out.println("***********");
		if (obj instanceof String)
			System.out.println(((Integer)obj).sum(2, 4));
		
		System.out.print(null instanceof Object);

		Object noObjectHere = ""; 
		System.out.print(noObjectHere instanceof String);
		
		String string = (String)noObjectHere;
		
	}

}
