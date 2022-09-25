
public class Question02 {

	public static void main(String[] args) {

		var s = "Hello";
		var t = new String(s);
		
		if ("Hello".equals(t)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.intern() == s) System.out.println("three");
		if ("Hello" == t.intern()) System.out.println("four");
		if ("Hello".intern() == t) System.out.println("five");
	}

}
