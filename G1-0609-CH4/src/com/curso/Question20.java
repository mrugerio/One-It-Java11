package com.curso;

public class Question20{

	public static void main(String[] args) {

		int w = 0, r = 1;

		String name = "";
		while (w < 2) {
			name += "A";
			do {
				System.out.println("r:"+r);
				name += "B";
				if (name.length() > 0)
					name += "C";
				else
					break;
				r++;
			} while (r <= 1);
			
			w++;
		}
		System.out.println(name);

	}

}
