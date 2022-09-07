import java.util.*;

public class Principal2 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("hawk"); 
		lista.add("robin");
		
		var objectArray = lista.toArray(new String[0]);
		
		System.out.println(Arrays.toString(objectArray));
	}

}
