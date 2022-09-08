package com.curso;

public class Question14 {
	
	int[][] scores = new int[5][];
	Object[][][] cubbies = new Object[3][0][5];
	String beans[]  = new String[6];
	java.util.Date dates[][] = new java.util.Date[2][];
	int[][] types = new int[6][];
	
	
	public static void main(String[] args) {
		new Question14().poblar();
	}
	
	public void poblar() {
		int[][] java = new int[3][];
		java[0] = new int[5];
		java[1] = new int[2];
		java[3] = new int[4];
		java[0][0] = 8;
		System.out.println(java[0][0]);
		
		
		//cubbies[0][0][0] = "Hola";
		//System.out.println(cubbies[0][0][0]);
	}

}
