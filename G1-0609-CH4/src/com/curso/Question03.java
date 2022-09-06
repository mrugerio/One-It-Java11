package com.curso;

import java.util.*;

public class Question03 {

	public static void main(String[] args) {

		List<Integer> myFavoriteNumbers = new ArrayList<>();

		myFavoriteNumbers.add(10);
		myFavoriteNumbers.add(14);
		
		for (int b : myFavoriteNumbers) {
			System.out.print(b + ", ");
			return; 
		}
	}

}
