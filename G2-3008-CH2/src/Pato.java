
public class Pato {
	
	String name;
	int edad;
	
	Pato(){
		this("Sin nombre");
		System.out.println("Paso por cons sin args");
	}
	
	Pato(String name){
		this("Lucas",10);
	}
	
	Pato(String name, int edad){
		super();
		this.name = name;
		this.edad = edad;
	}
}
