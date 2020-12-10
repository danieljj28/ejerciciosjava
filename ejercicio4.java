package javafempa;

import java.util.Scanner;


public class ejercicio4 {
	
	static int factorial(int numero) {
		int acumulador=1;
		
		for(int i=numero; i>=1;i--) {
			acumulador*= i;
			
		}

		
		return acumulador;
		
	}
	
	public static void main(String[]args) {
	int numero;
	
	Scanner teclado= new Scanner(System.in);
	
	System.out.println("Introduce un numero");
	numero=teclado.nextInt();
	int resultado=factorial(numero);
	System.out.println(resultado);
	
	
	}

}
