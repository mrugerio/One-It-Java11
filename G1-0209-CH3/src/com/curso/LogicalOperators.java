package com.curso;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean eyesClosed = true; 
		boolean breathingSlowly = false;

		boolean resting = eyesClosed | breathingSlowly; 
		boolean asleep = breathingSlowly & eyesClosed; 
		boolean awake = eyesClosed ^ breathingSlowly; 
		
		System.out.println(resting);
		System.out.println(asleep);
		System.out.println(awake);
		
		
	}

}
