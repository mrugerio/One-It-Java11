package com.curso;

public class Question16 {

	public static void main(String[] args) {
		int note = (int)(1 * 2 + (long)3);
		short melody = (byte)(double)(note *= 2);
		double song = melody;
		float symphony = (float)((song == 1_000f) ? song * 2L : song);
	}

}
