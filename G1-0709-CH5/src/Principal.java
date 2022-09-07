
public class Principal {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("abc"); 
		StringBuilder b = a.append("de"); //abcde 
		b.append("f");
		a.append("g"); //abcdefg
		System.out.println("a=" + a); 
		System.out.println("b=" + b);
		
		StringBuilder sb3 = new StringBuilder(10);
		sb3.append("abcdefghijklmnopqrstuv");
		System.out.println(sb3);
	}

}
