package examen;

import java.util.Scanner;

public class MainNaveEspacial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opcion;
		int contador;
		boolean salir = false;
		NaveEspacial[] a = new NaveEspacial[50];

		while (!salir) {
			System.out.println("\n----------Menu----------");
			System.out.println("1. Añadir naves espaciales");
			System.out.println("2. Mostrar naves cuya antiguedad ea superior a una dada");
			System.out.println("3. Ordenar naves por año de lanzamiento");
			System.out.println("4. Modificar capacidad total de las naves que admiten pasajeros");
			System.out.println("5. Mostrar todas las naves espaciales registradas");
			System.out.println("6. Eliminar una nave espacial");
			System.out.println("7. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				añadirNaves(a, scanner);
				break;
			case 2:
				mostrarNaves(a, scanner);
				break;
			case 3:
				ordenarNaves(a, scanner);
				break;
			case 4:
				modificarCapacidad(a, scanner);
				break;
			case 5:
				mostrarNaves(a, scanner);
				break;	
			case 7:
				salir = true;
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
				break;
			}
		}
		scanner.close();
	}

	private static void añadirNaves(NaveEspacial[] a, Scanner scanner) {

		int indiceLibre = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				indiceLibre = i;
				break;
			}
		}

		if (indiceLibre == -1) {
			System.out.println("No se pueden añadir mas naves. El arreglo esta lleno (maximo 50 naves).");
			return;
		}

		System.out.print("Introduzca el nombre de la nave: ");
		String nombre = scanner.nextLine();
		for (NaveEspacial nave : a) {
			if (nave != null && nave.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("El nombre de la nave ya existe. No se puede añadir otra con el mismo nombre.");
				return;
			}
		}

		System.out.print("Introduzca el año de creacion: ");
		int añoCreacion = scanner.nextInt();

		System.out.print("Introduzca el año de lanzamiento: ");
		int añoLanzamiento = scanner.nextInt();
		if (añoLanzamiento < añoCreacion) {
			System.out.println("El año de lanzamiento no puede ser anterior al año de creacion.");
			return;
		}

		System.out.print("Introduzca la capacidad total: ");
		int capacidad = scanner.nextInt();

		System.out.print("Introduzca el numero de tripulantes necesarios: ");
		int tripulantesNecesarios = scanner.nextInt();
		scanner.nextLine();

		NaveEspacial nuevaNave = new NaveEspacial(nombre, añoCreacion, añoLanzamiento, capacidad, tripulantesNecesarios);
		a[indiceLibre] = nuevaNave;
		System.out.println("Nave añadida exitosamente.");
	}

	public static void mostrarNaves(NaveEspacial[] a, Scanner scanner) {
		System.out.print("Introduzca la antigüedad maxima permitida: ");
		int antiguedadMaxima = scanner.nextInt();
		scanner.nextLine(); 

		System.out.print("Introduzca el año actual: ");
		int anioActual = scanner.nextInt();
		scanner.nextLine();

		boolean naveEncontrada = false;

		System.out.println("\nNaves con antigüedad no superior a " + antiguedadMaxima + " años:");
		for (NaveEspacial nave : a) {
			if (nave != null) {
				int antiguedad = anioActual - nave.getAñoCreacion();
				if (antiguedad <= antiguedadMaxima) {
					System.out.println(nave);
					naveEncontrada = true;
				}
			}
		}

		if (!naveEncontrada) {
			System.out.println("No se encontraron naves con antigüedad dentro del rango especificado.");
		}
	}

	public static void ordenarNaves(NaveEspacial[] a, Scanner scanner) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] != null && a[j + 1] != null) {
					if (a[j].getAñoLanzamiento() < a[j + 1].getAñoLanzamiento()) {
						NaveEspacial temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
		}

		System.out.println("\nNaves ordenadas en orden descendente por año de lanzamiento:");
		for (NaveEspacial nave : a) {
			if (nave != null) {
				System.out.println(nave);
			}
		}
	}

	public static void modificarCapacidad(NaveEspacial[] a, Scanner scanner) {
		boolean naveEncontrada = false;

		for (NaveEspacial nave : a) {
			if (nave != null && nave.getCapacidad() > nave.getTripulantesNecesarios()) {
				naveEncontrada = true;

				System.out.println("Informacion de la nave:");
				System.out.println(nave);
				System.out.print("¿Desea cambiar la capacidad total de esta nave? (si/no): ");
				String respuesta = scanner.nextLine();

				if (respuesta.equalsIgnoreCase("sí")) {
					System.out.print("Introduzca la nueva capacidad total de la nave: ");
					int nuevaCapacidad = scanner.nextInt();
					scanner.nextLine();

					if (nuevaCapacidad >= nave.getTripulantesNecesarios()) {
						nave.setCapacidad(nuevaCapacidad);
						System.out.println("Capacidad actualizada exitosamente a " + nuevaCapacidad + " personas.");
					} else {
						System.out.println("Error: la nueva capacidad no puede ser menor al número de tripulantes necesarios (" + nave.getTripulantesNecesarios() + ").");
					}
				}
			}
		}

		if (!naveEncontrada) {
			System.out.println("Error: no se encontraron naves que admitan pasajeros.");
		}
	}
	public static void mostrarNaves(int contador,NaveEspacial a[]) {
		System.out.println("Estas son las naves que hay: ");
		for(int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}

}