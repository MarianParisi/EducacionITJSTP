package PrimerasClases;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPositivos =0;
		int totalNegativos=0;
		int[] vecNumeros = {11,-22,33,-44,55,-66,77,-88,99};
		for (int i=0; i< vecNumeros.length; i++){
			if (vecNumeros[i]>0) {				
				totalPositivos = totalPositivos + vecNumeros[i];
			}
			else {
				totalNegativos = totalNegativos + vecNumeros[i];
			}			
		}
		System.out.println("La suma de los numeros positivos es "+ totalPositivos + 
				"\n" + "La suma de los numeros negativos es "+ totalNegativos);
	
	}
	
}
