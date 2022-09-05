package com.curso;

public class Question6 {

	public static void main(String[] args) {
		double d = 6.7;
		float f = 6.7f;
		
		int x = (int)d;
		x = (int)f;
		
		long l = (long)6.7f;
		l = (long)6.7;
		
		d = 500L;
		f = 500L;
		
		System.out.println("float: "+f);
		System.out.println("********");
		System.out.print(addCandy(1.4, 2.4f) + "-");  //3
		System.out.print(addCandy(1.9, 4) + "-");  //5
		System.out.print(addCandy((long)(int)(short)2, 4L));  //6
		
		
	}
	
	static long addCandy(double fruit, float vegetables) { 
		return (int)(fruit+vegetables);
	}

}
