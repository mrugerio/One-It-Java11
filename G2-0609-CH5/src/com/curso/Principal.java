package com.curso;

public class Principal{

	public static void main(String[] args) {
		
		String x = "Hello World"; 
		String z = " Hello World".trim(); 
		System.out.println(x==z); 

		String s1 = "12";
		String s2 = "12";
		String s4 = new String("12");
		
		System.out.println(s1==s2);
		
		//String s3 = "1".concat("2");
		String s3 = "1";
		s3 += "2";	
				
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1==s3); //false
	}

}
