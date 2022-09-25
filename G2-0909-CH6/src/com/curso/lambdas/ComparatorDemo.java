package com.curso.lambdas;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Comparator<String> com = (s1, s2) -> s2.compareTo(s1);
		System.out.println(com.compare("a", "A")); //NEGATIVO
		System.out.println(com.compare("A", "a")); //POSITIVO
		System.out.println(com.compare("A", "A")); //CERO

		
	}
//compare:  iguales=0, 1er>2do = #Positivo, 1er<2do = #Negativo
//a < z, A < Z, A < a, # < Aa

}
