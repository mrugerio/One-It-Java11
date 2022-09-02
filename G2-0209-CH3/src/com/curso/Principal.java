package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.println(null instanceof Object); //false
		Object noObjectHere = 4; 
		System.out.println(noObjectHere instanceof Number); //false
		
		System.out.println("********");
		Double i = Double.valueOf(0);
		Number n = i;
		Object o = i;
		
		Double d = 6.5;
		int entero = Integer.valueOf(4);
		
		Number n2 = (Number)o;
		if (n2 instanceof Double) {
			Double double1 = (Double)n2; //ClassCastException
			System.out.println("Double: "+double1.toString());
		}
		if (n2 instanceof Integer) {
			Integer integer = (Integer)n2;
			System.out.println("Integer: "+integer.toString());
		}
		
		
		
		

		boolean healthy = false; 
		if(healthy == true) 
			System.out.print("Good!");
		
		
	}

}
