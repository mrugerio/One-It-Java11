import java.util.*;

public class Question06 {

	public static void main(String[] args) {

		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					continue BUNNY;
				count++;
			}
		System.out.println(count);
		
		List parrots = new ArrayList<String>();
		parrots.add("Paco");
		
		for(var macaw : parrots) {
			System.out.println(macaw.getClass().getName());
			
		}
	}

}
