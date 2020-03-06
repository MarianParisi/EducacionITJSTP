package POO;

public class Vehiculo {
	private double alto;
	private double largo;
	private double ancho;
	public String modeloPrueba;

	public Vehiculo() {
	}
	public Vehiculo (double alto, double largo, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
}
