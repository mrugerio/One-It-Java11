package com.curso;

public class Defaults {
	
	static long l; //0L
	static float f; //0.0f
	static double d; //0.0d

	public static void main(String...args) {
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		new Defaults().printMagicData();
	}
	
	public void printMagicData() { 
		
		double magic = 3_1.00;
		System.out.println(magic);
		
		var v = "Hi";
		v = null;
	}

}

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
//Data Type	Default Value (for fields)
//byte	0
//short	0
//int	0
//long	0L
//float	0.0f
//double	0.0d
//char	'\u0000'
//String (or any object)  	null
//boolean	false