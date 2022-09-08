import java.util.ArrayList;
import java.util.List;

public class ClienteEstudiante {

	public static void main(String[] args) {

		List<String> listaMat = new ArrayList<>();
		listaMat.add("Mate");
		listaMat.add("Fisica");
		
		StringBuilder tutorCliente = new StringBuilder("Tercio");
		
		Estudiante e = new Estudiante("Patrobas",
				18,listaMat,tutorCliente);
		
		String nombre = e.getNombre();
		nombre = "Andronico";
		
		int edad = e.getEdad();
		edad = 8;
		
		
		e.getMaterias().add("C");
		
		tutorCliente = tutorCliente.append(" Otro");
		e.getTutor().append(" Otro");
		
		System.out.println(e);
		
		//Modicar la lista materias
		listaMat.add("Java");
		
		//SE CAMBIA LA REFERENCIA A UN NUEVO OBJETO INMUTABLE
		e = new Estudiante(e.getNombre(),
				e.getEdad(),listaMat,e.getTutor());
		
		System.out.println("NuevoEstudiante:"+e);
		
	}

}
