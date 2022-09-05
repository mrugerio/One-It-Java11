
public class Question11 {

	public static void main(String[] args) {
		
		final char a = 'A', e = 'E';

		char grade = 'B'; 
		
		switch (grade) {
			default:
			case a:
			case 'B': case 'C': System.out.print("great "); 
			case 'D': System.out.print("good "); 
				break; 
			case e:
			case 'F': System.out.print("not good ");
		} // great good

	}

}
