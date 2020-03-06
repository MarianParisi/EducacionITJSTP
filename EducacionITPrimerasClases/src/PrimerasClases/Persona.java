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
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setDomicilio(String domicilio){
		this.domicilio = domicilio;
	}
}
