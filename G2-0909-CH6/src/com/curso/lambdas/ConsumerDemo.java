package com.curso.lambdas;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> con = w -> System.out.println(w);
		con.accept("Hello World");
		con.accept("Hola Mundo");
		
		Consumer<Double> con2 = 
				r -> System.out.println(Math.round(r));
		con2.accept(5.45);
		con2.accept(8.90);
		
				
	}

}
