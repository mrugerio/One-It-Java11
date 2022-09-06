package com.curso;

public class Question19 {

	public static void main(String[] args) {
		String instrument = "violin";
		final String CELLO = "cello";
		//String viola = "viola";
		int p = -1;

		switch (instrument) {
		case "bass":
			break;
		case CELLO:
			p++;
		default:
			p++; //PUNTO DE ENTRADA //0
		case "VIOLIN":
			p++; //1
		case "viola":
			++p; //2
			break;
		}
		System.out.print(p);
	}

}
