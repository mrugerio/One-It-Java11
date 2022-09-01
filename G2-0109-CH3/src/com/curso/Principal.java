package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		int lion = 3; 
		int tiger = ++lion * 5 / lion--; 
		//            3  * 5    / 3 
		// 5
		System.out.println("lion is " + lion); //3
		System.out.println("tiger is " + tiger); //5

		System.out.println("----------------");
		int cookies = 4; 
		double reward = 3 + 2 * cookies-- * 2; //19
		System.out.println(cookies); //3
		System.out.print("Zoo animal receives: "+reward+" reward points");
	}

}
