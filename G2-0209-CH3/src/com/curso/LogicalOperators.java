package com.curso;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int rabbit = 6; 
		boolean bunny = (rabbit >= 6) || (++rabbit <= 7); 
		System.out.println(rabbit); 
		
//		Duck duck = null;
//		
//		if(duck!=null & duck.getAge()<5) {
//			
//		}

		boolean eyesClosed = true; 
		boolean breathingSlowly = false;

		boolean resting = eyesClosed | breathingSlowly; 
		boolean asleep =  breathingSlowly & eyesClosed ; 
		boolean awake = eyesClosed ^ breathingSlowly; 
		
		System.out.println(resting); // true 
		System.out.println(asleep); // false 
		System.out.println(awake); // true
	}

}
