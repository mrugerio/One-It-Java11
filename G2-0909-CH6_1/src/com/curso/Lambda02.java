package com.curso;
import java.util.*;

public class Lambda02 {

	public static void main(String[] args) {
		new Lambda02().counts(Arrays.asList(4,8,9,1,6,3));
	}

	public void counts(List<Integer> list) {
		//list.sort((var x, var y) -> x.compareTo(y));
		list.sort((var x, var y) -> x-y);
		System.out.println(list);
	}

}
