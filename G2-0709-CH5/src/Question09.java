
public class Question09 {

	public static void main(String[] args) {

		String s1 = "purr";
		String s2 = "";
		
		s1.toUpperCase(); 
		s1.trim(); 
		s1.substring(1, 3);
		s1 += "two"; //SI MODIFICA A S1
		
		System.out.println(s1);
		
		s2 += 2;
		s2 += 'c';
		s2 += false;
		System.out.println(s2);
		
		//s2 = "2"+'c'+false;
		if ( s2 == "2cfalse") System.out.println("==");
		if ( s2.equals("2cfalse")) System.out.println("equals");
		System.out.println(s1.length());
		
		
	}

}
