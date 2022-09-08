package com.curso;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Boolean b = Boolean.valueOf(true);
		
		Boolean b1 = new Boolean(false);
		
		System.out.println(b1);
		
		byte byte1 = Byte.valueOf((byte)127);
		System.out.println(byte1);
		
		Integer bad2 = Integer.valueOf("123");
		System.out.println(bad2);
		
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1); //1
		numbers.add(2); //1,2
		//numbers.remove(1); //Elimina al 2
		//numbers.remove(Integer.valueOf(1)); //Elimina al 1
		numbers.remove(Integer.parseInt("1")); //Elimina al 2
		System.out.println(numbers);
		
	}

}
