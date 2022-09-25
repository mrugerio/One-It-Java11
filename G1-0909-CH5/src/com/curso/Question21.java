package com.curso;
import java.util.*;

public class Question21 {

	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");

		Collections.sort(hex); //30, 3A, 8, FF
		
		System.out.println(hex);

		int x = Collections.binarySearch(hex, "8"); //2
		int y = Collections.binarySearch(hex, "3A");  //1
		int z = Collections.binarySearch(hex, "4F"); //-3
		System.out.println(x + " " + y + " " + z);
	}

}
