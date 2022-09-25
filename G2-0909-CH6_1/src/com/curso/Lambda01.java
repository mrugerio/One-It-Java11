package com.curso;

import java.util.function.Consumer;

public class Lambda01 {
	
	public static void main(String[] args) {
		Consumer<Integer> c = 
				 x -> System.out.println(x);
		c.accept(123);
		new Lambda01().whatAmI();
	}

	public void whatAmI() {
		consume((var x) -> System.out.println(x), 123);
	}

	public void consume(Consumer<Integer> c, int num) {
		c.accept(num);
	}

}
