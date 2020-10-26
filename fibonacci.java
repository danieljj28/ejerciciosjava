package fibonacci;

import java.util.Scanner;

 public class fibonacci {
	


	 private static int fibonaci(int num) {
		 int suma = 1;
		 int valor1 = 0;
		 int valor2 = 1;
		 
		 for(int i = 1;i < num; i++) {
			
			suma = valor1 + valor2;
			valor1 = valor2;
			valor2 = suma;
		 }
		 return suma;
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe una posición");
		 int posicion = Integer.parseInt(sc.nextLine());
		 int valor = fibonaci(posicion);
		 System.out.println("El número que hay en la posicion" + posicion + " en la sucesion de fibonacci es: " + valor);
		 
		 
	 }



}
