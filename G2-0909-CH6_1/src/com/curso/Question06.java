package com.curso;

import java.util.Comparator;
import java.util.function.Consumer;

public class Question06 {
	
	Consumer<String> consumer = (var x) -> {};
	Comparator<Boolean> comp = (var x, var y) -> 0;
	
	public static void main(String[] args) {
		new Question06().method();
	}

	public void method() {
		x ( consumer, comp);
	}

	public void x(Consumer<String> x, Comparator<Boolean> y) {
		System.out.println("hola mundo 2");
	}

}
