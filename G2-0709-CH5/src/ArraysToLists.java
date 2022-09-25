import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ArraysToLists {

	public static void main(String[] args) {

		String[] array1 = { "hawk", "robin" };
		//REGRESA UNA LISTA FIJA (FIXED)
		//SI SE MODIFICA UN ELEMENTO SE MODIFICA AL OTRO ELEMENTO
		var list1 = Arrays.asList(array1);
		//list1.remove(1);
		//list1.add("rolas");
		list1.set(0, "rolas");
		list1.set(1, null);
		array1[1] = "paco";
		System.out.println("List:  "+list1);
		System.out.println("Array: "+Arrays.toString(array1));
		
		String[] array2 = { "hawk", "robin" };
		//REGRESA UNA LISTA INMUTABLE
		var list2 = List.of(array2);
		//list2.remove(1);
		//list2.add("rolas");
		//list2.set(0, "rolas");
		array2[0] = "paco";
		System.out.println(list2);
		System.out.println(Arrays.toString(array2));
		
		
		
	}

}
