package com.curso;

public class Question16 {

	public static void main(String[] args) {
		
		var v = 3L * 3.0;
		System.out.println(v);

		int note = 1 * 2 + 3;
		short melody = (byte)(double)(note *= 2);
		double song = melody;
		float symphony = (float)((song == 1_000f) ? song * 2L : song);
		
	}

}
