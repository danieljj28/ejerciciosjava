package ejps;
import java.util.Scanner;
import java.util.Random;

public class ej {

	public static void main(String[]args) {
		
		int i = 0;
		Random r1 = new Random();
		int num = r1.nextInt(100);
	
		while(i < 5) {
			
			Scanner data = new Scanner(System.in);
			System.out.println("Escribe un número:");
			int nm = Integer.parseInt(data.nextLine());
			if(nm < 0 || nm > 100) {
				System.out.println("Fuera de rango chaval");
			}else {
				if(nm == num) {
					System.out.println("Enhorabuena");
					break;
				}else {
					
					if(nm < num) {
						i++;
						System.out.println("Prueba con un número más grande");
					}else {
						i++;
						System.out.println("Prueba con un número más pequeño");
					}
				}
			
			}
		}
		System.out.println("Has fallado, el número era " + num);
	}
	

}
