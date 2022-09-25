package com.curso;

public class Question04 {

	public static void main(String[] args) {
//		Secret s = new MySecret();
//		System.out.println(s.magic(5.6));

		Secret s = (e) -> {
			String f = "";
			return "Poof";
		};
		
		System.out.println(s.magic(7.7));
	}
}

interface Secret {
	String magic(double d);
}

//class MySecret implements Secret {
//	public String magic(double d) {
//		return "Poof:"+d;
//	}
//}
