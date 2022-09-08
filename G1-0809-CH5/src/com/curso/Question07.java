package com.curso;

public class Question07 {

	public static void main(String[] args) {
		
		var sb = "hola";
		        //0123
		//System.out.println(sb.substring(3,4));

		var string = "12345";
		var builder = new StringBuilder("12345");
		                              // 01234
		
		//System.out.println(builder.charAt(4));
		//System.out.println(builder.replace(2, 4, "6").charAt(3));
		                             //1265
		//System.out.println(builder.replace(2, 5, "6").charAt(2));
		                             //126
		//System.out.println(string.charAt(5));
		//System.out.println(string.length()); //5
		System.out.println(string.replace("123", "1").charAt(2));
		                              //145
	}

}
