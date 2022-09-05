import java.util.*;

public class Question03 {
	

	public static void main(String[] args) {

		List<Integer> myFavoriteNumbers = 
				new ArrayList<>();
		myFavoriteNumbers.add(10); 
		myFavoriteNumbers.add(14);
		
		for (var a : myFavoriteNumbers) {
			System.out.print(a + ", ");
			break; 
		}
		System.out.println("****");
		for (int b : myFavoriteNumbers) {
			continue; 
			//System.out.print(b + ", ");
		}
		
		for (Object c : myFavoriteNumbers) 
			System.out.print(c + ", ");

	}

}
