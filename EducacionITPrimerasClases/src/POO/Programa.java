package POO;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto fordFiesta = new Auto("Ford", "Fiesta", "2005", 1.3, 2.3, 1.5);
		fordFiesta.modeloPrueba = "prueba de variables";
		String resultado = fordFiesta.ToString(fordFiesta.getMarca(),fordFiesta.getModelo(), fordFiesta.getColor(), fordFiesta.getAlto(), fordFiesta.getLargo(), fordFiesta.getAncho());
		System.out.println(resultado);
	}

}
