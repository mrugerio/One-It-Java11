package com.curso;

public class Principal4 {

	public static void main(String[] args) {

		String emp1 = "Patrobas";
		asignaName(emp1);
		
		StringBuilder sb = new StringBuilder("Andronico");
		asignaNombre(sb);
	}

	private static void asignaName(String emp1) {
		String s = "";
		for (int x=1;x<10_000_000;x++) {
			s = emp1 + x;
			System.out.println(s);
		}
		s.toString();
	}
	
	private static String asignaNombre(StringBuilder sb) {
		//StringBuilder sb1 = new StringBuilder();
		for (int x=1;x<10_000_000;x++) {
			sb.append(x);
			System.out.println(sb);
		}	
		return sb.toString();
	}

}
