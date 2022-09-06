package com.curso;

public class Question14 {

	public static void main(String[] args) {
		double iguana = 0;
		int snake = 1;
		do {
			System.out.print(snake++ + " ");
			iguana--;
		} while (snake <= 5);
		System.out.println(iguana);
	}

}
