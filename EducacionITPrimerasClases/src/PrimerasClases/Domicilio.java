package PrimerasClases;

public class Domicilio {
//ATRIBUTOS
	public String calle;
	public int numero;
	public String localidad;

	public Domicilio(String calle, int numero, String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
	}
	
	public String getCalle() {
		return calle;		
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}	
	public String getLocalidad() {
		return localidad;		
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}
