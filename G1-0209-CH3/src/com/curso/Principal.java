package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(null == null);
		
		boolean healthy = false; 
		if(healthy = true) 
			System.out.println("Good!");
		
		int i = (int)6.7f;
		System.out.println(i);
		
		short sh = (short)8L;
		System.out.println(sh);
		
		short x = 10;
		short y = 3;
		var z = x * y;
		System.out.println(z);
		
		byte b = 5;
		
		char ch1 = 10;
		char ch2 = 3;
		var ch3 = ch1 * ch2;
		System.out.println(ch3);
		
		int lion = 3; 
		int tiger = ++lion * 5 / lion--; 
		//            3    *5 /     3
		// lion = 2 -> 3
		System.out.println("lion is " + lion); //3 
		System.out.println("tiger is " + tiger); //5

		
		
		int cookies = 4; 
		double reward = 3 + 2 * cookies--; 
		
		System.out.println(reward);
		System.out.println(cookies);

	}

}
