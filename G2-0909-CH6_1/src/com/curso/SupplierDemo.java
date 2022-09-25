package com.curso;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> "Hola";
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
	}

}
