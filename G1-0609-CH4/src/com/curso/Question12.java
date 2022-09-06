package com.curso;

public class Question12 {

	public static void main(String[] args) {

		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };

		int q = wolf.length;
		for (;;) {
			System.out.print(wolf[--q]);
			if (q == 0)
				break;
		}
		System.out.println("");
		for (int m = wolf.length - 1; m >= 0; --m)
			System.out.print(wolf[m]);
		System.out.println("");

		for (int z = 0; z < wolf.length; z++)
			System.out.print(wolf[wolf.length - z - 1]);
		System.out.println("");

		int x = wolf.length - 1;
		for (int j = 0; x >= 0 && j == 0; x--)
			System.out.print(wolf[x]);

//		System.out.println("");
//		final int r = wolf.length;
//		for(int w = r-1; r>-1; w = r-1)
//		System.out.print(wolf[w]);

		System.out.println("");
		for (int i = wolf.length-1; i >= 0; --i)
			System.out.print(wolf[i]);
	}

}
