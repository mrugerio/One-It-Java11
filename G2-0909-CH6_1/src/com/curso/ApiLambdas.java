package com.curso;

import java.util.*;

public class ApiLambdas {

	public static void main(String[] args) {

		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear"); 
		bunnies.add("floppy");
		bunnies.add("hoppy"); 
		System.out.println(bunnies); 
		// [long ear, floppy, hoppy]  
		//bunnies.removeIf(s -> s.charAt(0) != 'h'); 
		System.out.println(bunnies);
		
		List<Empleado> listaEmp = new ArrayList<>();
		listaEmp.add(new Empleado("Az",25,59.00));
		listaEmp.add(new Empleado("Za",45,19.00));
		listaEmp.add(new Empleado("7a",15,29.00));
		listaEmp.add(new Empleado("au",34,33.00));
		
		//listaEmp.removeIf(e -> e.getSueldo()<30);
		listaEmp.sort(
			(e1,e2) -> e2.getName().compareTo(e1.getName()));
		
		listaEmp.sort(
			(e1,e2) -> new Integer(e1.getEdad()).compareTo(e2.getEdad()));
			
		listaEmp.replaceAll(e -> {
						e.setSueldo(e.getSueldo()+10);
						return e;
					}
		);
		
		listaEmp.forEach(y -> System.out.println(y));
		
		
	}

}
