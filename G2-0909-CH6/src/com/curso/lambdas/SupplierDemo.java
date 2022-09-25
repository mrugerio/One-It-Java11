package com.curso.lambdas;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "Hola";
		String res = sup.get();
		System.out.println(res);
		
		Supplier<LocalDateTime> sup1 = 
				() -> LocalDateTime.now();
		System.out.println(sup1.get());	
		
		Supplier<Integer> random = 
				() -> new Random().nextInt();
		System.out.println(random.get());
		
	}

}
