package com.curso;

import java.util.*;

public class Question07 {

	public static void main(String[] args) {
		List list = List.of(1, 2, 3);
		Set set = Set.of(1, 2, 3);
		Map map = Map.of(1, 2, 3, 4,8,9);
		
		//map.keySet().forEach(x -> System.out.println(x));
		//map.values().forEach(x -> System.out.println(x));
		
		map.forEach(
				(x,y) -> System.out.println(x +",valor: "+y));
	}

}
