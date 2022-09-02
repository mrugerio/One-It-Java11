package com.curso;

public class Principal5 {

	public static void main(String[] args) {
		boolean sunny = true, raining = false, sunday = true; 
		boolean goingToTheStore = sunny & raining ^ sunday;  //true
		                              //false     -> =true
		boolean goingToTheZoo = sunday && !raining; //true
		                        //true        
		boolean stayingHome = !(goingToTheStore && goingToTheZoo); //false
		System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" +stayingHome);

		String x = "hola";
		String y = "hola";
		boolean res = x!=y;
		System.out.println(res); //false
		
		StringBuilder sb1 = new StringBuilder("hola");
		StringBuilder sb2 = new StringBuilder("hola");
		res = sb1!=sb2;
		System.out.println(res); //true


		
	}

}
