package com.curso;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("Hola Mundo");
		c.accept("Hello World");
		
		Consumer<Double> c1 = u -> System.out.println(u.intValue());
		c1.accept(3.4);
		c1.accept(99.9999);
	}

}
