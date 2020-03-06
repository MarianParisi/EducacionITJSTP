package POO;

public class Auto extends Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	
	public Auto(String marca, String modelo, String color, double alto, double largo, double ancho) {
		super(alto, largo, ancho);		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		
	}
	
public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//	public String getMarca() {
//		return marca;
//	}
//	 
	public String ToString(String marca, String modelo, String color, double alto, double largo, double ancho) {
		String concat = "Marca: "+ marca+ "\n"+ "Modelo: "+ modelo + "\n"+ "Color: "+ color + "\n"+ "Alto: "+ alto + "\n" +"Largo: "+ largo + "\n"+"Ancho: "+ ancho;
		return concat;
	}

}
