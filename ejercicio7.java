package es.fempa;

import java.util.Scanner;

public class ejercicio7 {

	private static void mostrarResultados(int numZonas, String[] nombreZonas, int[][] densidadArea ) {
		int acumulador=0;
		
		for(int i=0;i<numZonas;i++) {
			System.out.println("En la "+ nombreZonas[i] +" se plantan: "+ densidadArea[0][i] * densidadArea[1][i] +" arboles.");
			acumulador += densidadArea[0][i] * densidadArea[1][i];
		}
		System.out.println("En total se plantan: "+acumulador+" arboles." );
		
	}
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas zonas vamos a registrar en el Mapa?");
		int numZonas=teclado.nextInt();
		
		String[] nombreZonas=new String[numZonas];		
		int[][] densidadArea = new int [2][numZonas];
		
		for(int i=0;i<numZonas;i++) {
			System.out.print("Introduzca el nombre de la "+(i+1)+"º zona: ");
			nombreZonas[i]=teclado.next();
			System.out.print("Introduzca la densidad de la "+(i+1)+"º zona: ");
			densidadArea[0][i]=teclado.nextInt();
			System.out.print("Introduzca el área de la "+(i+1)+"º zona: ");
			densidadArea[1][i]=teclado.nextInt();			
			System.out.println();
		}
		teclado.close();
		mostrarResultados(numZonas,nombreZonas,densidadArea);
		
	}
}

	
		
		
		

