package com.curso;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Question15 {

	public static void main(String[] args) {

		char[]c = new char[2];
		
//		ArrayList<String> l = 
//				(ArrayList<String>) Arrays.asList("a","b","c");
//		
		List<String> l = Arrays.asList("a","b","c");
		System.out.println(l.getClass().getName());
		//java.util.Arrays$ArrayList
		
		List<String> al = new ArrayList<>();
		System.out.println(al.getClass().getName());
		
		List<String> lo = List.of("a","b","c");
		System.out.println(lo.getClass().getName());
		
		List<String> lx = Stream.of("java", "python", "node")
				.collect(Collectors.toList());
		System.out.println(lx.getClass().getName());
		
		//lx.forEach(System.out::println);
		
		int length = c.length + l.size();
		//System.out.println(length);
		
		"Hola".length();
	}

}
