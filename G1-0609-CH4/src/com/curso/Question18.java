package com.curso;

import java.util.*;

public class Question18 {

	public static void main(String[] args) {
		
//		Set<Integer> olivia = new HashSet<>();
//		olivia.add(4);
//		olivia.add(5);
		
//		int[] olivia = {3,4,5};
		
		Collection<String> olivia = new LinkedList<>();
		olivia.add("aa");
		olivia.add("bb");
		
		for(var sophia : olivia) { 
			System.out.println(sophia); 
		}
	}

}
