import java.util.ArrayList;
import java.util.List;

public final class Estudiante {

	final private String nombre;
	final private StringBuilder tutor;
	final private int edad;
	final private List<String> materias;
	
	public Estudiante(String nombre, int edad, List<String> materias,StringBuilder tutor) {
		this.nombre = nombre;
		this.edad = edad;
		this.materias = new ArrayList<String>(materias);
		this.tutor = new StringBuilder(tutor);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public StringBuilder getTutor() {
		return new StringBuilder(tutor);
	}

	public int getEdad() {
		return edad;
	}

	public List<String> getMaterias() {
		return new ArrayList<String>(materias);
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", tutor=" + tutor + ", edad=" + edad + ", materias=" + materias + "]";
	}
	
	
}
