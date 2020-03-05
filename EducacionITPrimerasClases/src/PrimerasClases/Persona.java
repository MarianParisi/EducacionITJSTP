package PrimerasClases;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;
	public String domicilio;

	public Persona() {

	}

	public void verDatos(Persona persona) {
		System.out.print("Nombre: " + persona.nombre + "\n" + "Apellido: " + persona.apellido + "\n" + "Edad: "
				+ persona.edad + "\n" + "Domicilio: " + persona.domicilio);
	}
}
