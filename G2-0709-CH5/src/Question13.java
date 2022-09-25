
public class Question13 {

	public static void main(String[] args) {

		var puzzle1 = new StringBuilder("Java");
		//puzzle.reverse();
		//String s = puzzle.append("vaJ$").substring(0, 4);
		//JavavaJ$ = puzzle 
		//s = Java
		//System.out.println(puzzle);
		//System.out.println(s);
		
		System.out.println(puzzle1.append("vaJ$").delete(0, 3)
				//JavavaJ$      //avaJ$
					.deleteCharAt(puzzle1.length() - 1));
						//avaJ
		
		var puzzle = new StringBuilder("Java");
		//System.out.println(puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length()));
		
	}

}
