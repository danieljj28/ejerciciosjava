package es.fempa;

public class ejercicio6 {
	 
		
	
	public static void main(String[] args) {
		
		int []densidad = {2,4,6,8};
		int[]Area = {3,4,1,6};
		String[] Zonas= {"Ciudad","Bosque","Descampado","Rio"};
		
		int rest=1;
		int suma=0;
		
		for( int i=0; i<=densidad.length - 1; i++) {
			for (int j=0; j <= densidad[i]; j ++);
			
			 rest= densidad[i] * Area [i];
			System.out.println("¿cuantos arboles se puede plantar en " + Zonas [i]);
			System.out.println( densidad[i] + "*" + Area[i] + "=" + rest );
			suma= suma + rest;
			rest=1;
			
		}
		System.out.println("Cuantos arboles se plantan en total?");
		System.out.println();
	}

}
