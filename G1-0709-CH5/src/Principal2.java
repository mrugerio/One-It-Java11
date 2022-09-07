
public class Principal2 {

	public static void main(String[] args) {

		String x = "Hello World";
		String y = "Hello World";
		String z = new String("Hello World");
		
		System.out.println(x==y); //true
		System.out.println(x==z); //false
		
		//CREA FUERA DEL POOL DE STRINGS
		String w = "Hello";
		w = w.concat(" World"); //false
		//w += " World"; //false
		
		System.out.println(x.equals(w)); //true
		System.out.println(x==w); //false
		
		String t = "   Hello World   ".trim();
		System.out.println(x.equals(t)); //true
		System.out.println(x==t); //false
		
		//CREA DENTRO DEL POOL DE STRINGS
		String v = "Hello" + " World";
		System.out.println(x.equals(v)); //true
		System.out.println(x==v); //true
		
		System.out.println("************");
		
		String singleString = "hello world"; 
		String oneLine = "hello " + "world";
		System.out.println(singleString == oneLine); //true
		
		String concat = "hello"; 
		concat += " world";
		System.out.println(singleString.equals(concat)); //true
		System.out.println(singleString == concat); //false
		
		String name = "Hello World"; 
		String name2 = new String("Hello World").intern(); 
		System.out.println(name == name2); //true
		
	}

}
