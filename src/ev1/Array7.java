package ev1;

import java.util.Random;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int [] a = new int [10];
		int opcion, suma=0, max=0, min=0;
		Random rnd = new Random();

		for (int i = 0; i<a.length; i++){
			a[i]= rnd.nextInt(101);
		}

		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1.- Salir");
			System.out.println("2.- Mostrar la suma");
			System.out.println("3.- Mostrar el maximo");
			System.out.println("4.- Mostrar el minimo");
			System.out.println("5.- Mostrar la media");
			System.out.println("6.- Rellenarlo de nuevo con números (formatear)");
			System.out.println("Que quieres hacer care monda");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agur");
				break;
			case 2:
				for (int i=0;i<a.length;i++) {
					suma = suma+a[i];
				}
				System.out.println("Suma: "+suma);
				break;
			case 3:
				for (int i=0;i<a.length;i++) {
					if (a[i] > max) {
						max=a[i];
					}
				
				}
				System.out.println("Mayor: "+max);
				break;
			case 4:
				for (int i=0;i<a.length;i++) {
					if (a[i] < min) {
						min=a[i];
					}
				
				}
				System.out.println("Menor: "+min);
				break;
				
			case 5:
				for (int i=0;i<a.length;i++) {
					suma = suma+a[i];
				}
				System.out.println("Suma: "+suma/a.length);
				
				break;
			case 6:
				for (int i=0;i<a.length;i++) {
					a[i]= rnd.nextInt(101);
				}
				break;
			case 7:				
				for (int i=0;i<a.length;i++) {
					a[i]= rnd.nextInt(101);
				}

			}


		}while(opcion != 1);
	}
}
