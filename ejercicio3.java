package javafempa;

import java.util.Scanner;

public class ejercicio3 {
	

	

		
		public static  int mostrarSubMenu(int opcion) {
			System.out.println("1. Datos");
			System.out.println("2. Estadisticas");
			System.out.println("3. Guardar");
			System.out.println("4. Salir");
			
			
			
			switch (4) {
			case 1:
				System.out.println("Datos");
				
				break;
			case 2:
				System.out.println("Estadisticas");
				break;
			case 3:
				System.out.println("GUARDAR");
				break;
			case 4:
				System.out.println("SALIR");
				break;
			}
			return opcion;
				
			
			
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			boolean continuar=true;
			int opcion;
			
			do {
				System.out.println("Elige una opción:");
				System.out.println("1. Abrir programa");
				System.out.println("2. Cerrar programa");
				System.out.println("3. Guardar");
				System.out.println("4. Salir");
				System.out.println("5. Mostrar SubMenu");
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("ABRIR");
					
					break;
				case 2:
					System.out.println("CERRAR");
					break;
				case 3:
					System.out.println("GUARDAR");
					break;
				case 4:
					System.out.println("SALIR");
					continuar=false;
					break;
				case 5: 
					mostrarSubMenu( opcion);
					continuar=false;
					break;
				
					
				}
				
			} while (continuar);
		}
	}



