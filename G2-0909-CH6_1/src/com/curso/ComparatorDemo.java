package com.curso;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Empleado> listaEmp = Arrays.asList(
				new Empleado("Az",25,59.00),
				new Empleado("Za",45,19.00),
				new Empleado("7a",15,29.00),
				new Empleado("au",34,33.00));
		
//		Comparator<String> c1 = (s1,s2) -> s1.compareTo(s2);
		
//		System.out.println(c1.compare("Az","au"));
//		System.out.println(c1.compare("au","Za"));
//		System.out.println(c1.compare("7a","au"));
		System.out.println("***** POR NOMBRE ****+");
		Collections.sort(listaEmp,
				(e1,e2) -> e1.getName().compareTo(e2.getName()));
		
		listaEmp.forEach(System.out::println);
		// numeros  < mayusculas < minusculas
		System.out.println("***** POR EDAD ****+");
		Collections.sort(listaEmp,
				(e1,e2) -> e1.getEdad() - e2.getEdad());
		listaEmp.forEach(System.out::println);
		
		System.out.println("***** POR SUELDO ****+");
		Collections.sort(listaEmp,
				(e1,e2) -> (int)(e2.getSueldo() - e1.getSueldo()));
		listaEmp.forEach(System.out::println);
		                                
	}

}
