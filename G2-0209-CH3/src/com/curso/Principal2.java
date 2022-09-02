package com.curso;

public class Principal2 {

	public static void main(String[] args) {
		//long l = 4.5f;
		//long l = 4.5;
		double d = 55L;
		var x = (long)(int)(short)2;
		System.out.println(x);
		
		System.out.print(addCandy((long)(int)(short)2, (float)4));
		System.out.print(addCandy2(2.0, (float)4)); 

	}
	
	static long addCandy(double fruit, float vegetables) { 
		System.out.println("fruit: "+fruit);
		return (int)(fruit+vegetables);
	}
	
	static long addCandy2(double fruit, float vegetables) { 
		System.out.println("fruit: "+fruit);
		return (int)(fruit+vegetables);
	}

}
