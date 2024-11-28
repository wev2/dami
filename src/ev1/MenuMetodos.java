package ev1;

import java.util.Scanner;

public class MenuMetodos {

	public static void introducirNumeros() {
		Scanner teclado = new Scanner(System.in);
		int []a = new int[10];
		int []b = new int[] {110,144,666,508,998,800,66,58,88,338};
		String nombre;
		System.out.println("Introduzca su nombre");
		nombre = teclado.next();

		a[0] = 55;
		a[1] = 77;
		a[2] = 333;
		a[3] = 254;
		a[4] = 499;
		a[5] = 400;
		a[6] = 33;
		a[7] = 29;
		a[8] = 44;
		a[9] = 169;

		for (int i:a) {
			System.out.println(i);	
		}

		System.out.println(" ");

		for (int j:b) {
			System.out.println(j);
		}
		System.out.println(nombre.toUpperCase());

	}
	public static void positivosMedia() {
		Scanner scanner = new Scanner(System.in);
		int positivos = 0;
		int sumaPositivos = 0;
		int numero;
		String respuesta;

		do {
			System.out.println("Introduce un número (positivo o negativo): ");
			numero = scanner.nextInt();

			if (numero > 0) {
				for (int i = 0; i < numero; i++) {
					System.out.print("*");
				}
				System.out.println();
				positivos++;
				sumaPositivos += numero;
			} else if (numero < 0) {
				System.out.println("?");
			}

			System.out.println("¿Deseas introducir otro número? (s/S para continuar, n/N para salir): ");
			respuesta = scanner.next();
		} while (respuesta.equalsIgnoreCase("s"));

		if (positivos > 0) {
			double mediaPositivos = (double) sumaPositivos / positivos;
			System.out.println("Has introducido " + positivos + " números positivos.");
			System.out.println("La media de los números positivos es: " + mediaPositivos);
		} else {
			System.out.println("No has introducido ningún número positivo.");
		}
	}

	public static void mostrarNumeros() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1.- Introducir 10 numeros entre 10 y 500");
			System.out.println("2.- Positivos y la media de ellos");
			System.out.println("3.- 10 numeros");
			//System.out.println("4.- Obtener el IVA de un producto");
			//System.out.println("5.- Modificar el precio de un producto");
			//System.out.println("6.- Eliminar un producto");
			System.out.println("7.- Salir");
			System.out.println("Que quieres hacer care monda");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				introducirNumeros();
				break;
			case 2:
				positivosMedia();
				break;
			case 3:
				mostrarNumeros();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;	
			}

		} while (opcion !=1);
	}
}
