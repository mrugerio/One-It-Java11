import java.util.*;
import static java.util.Collections.sort;

public class DemoSort {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(99); 
		numbers.add(8); 
		numbers.add(81); 
		sort(numbers); 
		System.out.println(numbers);
	}

}
