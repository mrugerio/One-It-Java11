import java.util.*;

public class Principal {

	public static void main(String[] args) {

		var lista1 = new ArrayList<String>();
		lista1.add("a");
		lista1.add("b");

		var lista2 = new ArrayList<String>();
		lista2.add("c");
		lista2.add("d");
		lista2.add("e");

		var lista3 = new ArrayList<ArrayList<String>>();
		
		lista3.add(lista1);
		lista3.add(lista2);
		
		for (var lista: lista3) {
			for (var s: lista) {
				System.out.print(s);
			}
			System.out.println();
		}
		
		
		Boolean res = Boolean.valueOf(false);
		boolean res1 = Boolean.valueOf(false);
		//res1 = new Boolean(true);
		
		int primitive = Integer.parseInt("123");
		primitive = Integer.valueOf("123");
		Integer iW = Integer.parseInt("123");
		
		System.out.println("*******");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1); 
		numbers.add(2); 
		numbers.remove(1); //ELIMINA EL INDICE 1
		//numbers.remove(Integer.valueOf(1)); //ELIMINA EL OBJETO IGUAL A 1
		System.out.println(numbers); //1
	}

}
