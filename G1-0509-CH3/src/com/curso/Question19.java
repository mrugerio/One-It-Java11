package com.curso;

public class Question19 {

	public static void main(String[] args) {
		int start = 7;
		int end = 4;
		end += ++start;
		start = (int) (Integer.MAX_VALUE+1);
		
		System.out.println("end: "+end);
		System.out.println("start: "+start);

	}

}
