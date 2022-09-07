import java.util.Arrays;

public class Principal4 {

	public static void main(String[] args) {

		int[] numbers = new int[] {18,3,2,1,8,99}; 
		Arrays.sort(numbers); //1,2,3,8,18,99  =>98
		System.out.println(Arrays.binarySearch(numbers, 2)); 
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 98));

	}

}
