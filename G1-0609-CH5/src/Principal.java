
public class Principal {

	public static void main(String[] args) {
		String s1 = "1";
		//String s2 = "12";
		
		String s2 = s1.concat("2").intern(); //12
		String s3 = "12";
		
		System.out.println(s2==s3); //true
		System.out.println(s2.equals(s3)); //true
		
		
	}

}
