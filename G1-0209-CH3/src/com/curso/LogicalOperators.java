package com.curso;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean eyesClosed = false; 
		boolean breathingSlowly = true;

		boolean resting = eyesClosed | breathingSlowly; //true
		boolean asleep = eyesClosed & breathingSlowly; //false
		boolean awake = eyesClosed ^ breathingSlowly; //true
		
		System.out.println(resting);
		System.out.println(asleep);
		System.out.println(awake);
		
		
	}

}
