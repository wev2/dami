package ev1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String [] meses = new String [5];
		int [] litros = new int [5];
		int opcion;

		litros[0] = 123;
		litros[1] = 333;
		litros[2] = 180;
		litros[3] = 211;
		litros[4] = 90;

		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";


		do {
			System.out.println("¿Que quiere hacer?");
			System.out.println("1- Mostrar en cada mes cuantos litros han llovido");
			System.out.println("2- Mostrar en pantalla el mes y los litros del mes más lluvioso.");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i <meses.length; i++ ) {
					System.out.println("En "+meses[i]+" ha llovido "+litros[i]+" Litros");							
				}
				break;
			case 2:
				System.out.println("El mes mas lluvioso ha sido "+meses[1]+" con "+litros[1]+ " Litros");

				break;
			}

		}while (opcion != 1);


	}
}
