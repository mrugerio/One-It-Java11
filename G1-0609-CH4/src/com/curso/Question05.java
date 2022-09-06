package com.curso;

public class Question05 {

	public static void main(String args[]) {
		new Question05().print(new int[]{3,4,5,6});
	}
	
	private void print(int weather[]) { 
		for(int i=-1; i++<10 && i<weather.length; ) { 
			System.out.println(weather[i]); 
		} 
	}

}
