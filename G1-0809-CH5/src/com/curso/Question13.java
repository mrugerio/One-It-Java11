package com.curso;

public class Question13 {

	public static void main(String[] args) {
		var puzzle = new StringBuilder("Java");
		String s = puzzle.append("vaJ$").substring(0, 4);
		//JavavaJ$
		//Java
		System.out.println(puzzle); //JavavaJ$
		System.out.println(s); //Java
		
		var puzzle1 = new StringBuilder("Java");
		puzzle1.append("vaJ$") //JavavaJ$
		.delete(0, 3) //avaJ$
		.deleteCharAt(puzzle1.length() - 1); //avaJ
		System.out.println(puzzle1);
		
		var puzzle2 = new StringBuilder("Java");
		puzzle2.append("vaJ$").delete(0, 3).deleteCharAt(puzzle2.length());
	}

}
