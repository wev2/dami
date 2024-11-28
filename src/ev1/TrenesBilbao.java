package ev1;

import java.util.Scanner;

public class TrenesBilbao {

	private static void introducirTrenes(Scanner teclado, Tren[] trenes) {
		int contadorTrenes = 0;
		while (contadorTrenes < trenes.length) {
			System.out.println("Introduzca la referencia del tren:");
			String referencia = teclado.nextLine();

			System.out.println("¿Qué tipo de tren es? Solo están disponibles: Cercanias, Ave o Mercancias.");
			String tipo;
			while (contadorTrenes < trenes.length) {
				System.out.println("Introduzca la referencia del tren:");
				referencia = teclado.nextLine();

				System.out.println("¿Qué tipo de tren es? Solo están disponibles: Cercanias, Ave o Mercancias.");
				while (true) {
					tipo = teclado.nextLine();
					if (tipo.equalsIgnoreCase("Cercanias") || tipo.equalsIgnoreCase("Ave") || tipo.equalsIgnoreCase("Mercancias")) {
						break;
					} else {
						System.out.println("Tipo no válido. Ingrese 'Cercanias', 'Ave' o 'Mercancias'.");
					}
				}

				System.out.println("Introduzca el número de asientos ocupados:");
				int asientosOcupados = teclado.nextInt();

				System.out.println("Introduzca la distancia recorrida en kilómetros:");
				double kilometrosRecorridos = teclado.nextDouble();

				System.out.println("Introduzca la duración del viaje en minutos:");
				int duracion = teclado.nextInt();
				teclado.nextLine();

				Tren tren = new Tren(tipo, referencia);
				tren.setAsientosocupados(asientosOcupados);
				tren.setKilometrosrecorridos(kilometrosRecorridos);
				tren.setDuracion(duracion);
				trenes[contadorTrenes] = tren;
				contadorTrenes++;

				System.out.print("¿Desea agregar otro tren? (si/no): ");
				String respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase("no")) {
					break;
				}
			}

			if (contadorTrenes == trenes.length) {
				System.out.println("Se ha alcanzado el límite máximo de 30 trenes.");
			}
		}
	}

	private static void mostrarTrenesVelocidad(Scanner teclado, Tren[] trenes, int contadorTrenes) {
		System.out.print("Introduzca la velocidad mínima en Km/h: ");
		double velocidadMinima = teclado.nextDouble();
		teclado.nextLine();

		boolean encontrado = false;
		for (int i = 0; i < contadorTrenes; i++) {
			double velocidad = trenes[i].obtenerVelocidadTotal();
			if (velocidad > velocidadMinima) {
				System.out.println("Referencia del tren: " + trenes[i].getReferencia() + ", Velocidad: " + velocidad + " Km/h");
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No hay trenes que superen la velocidad indicada.");
		}
	}

	private static void ordenarTrenes(Scanner teclado , Tren[] trenes, int contadorTrenes) {
		Tren[] trenesCercanias = new Tren[contadorTrenes];
	    int index = 0;

	    for (int i = 0; i < contadorTrenes; i++) {
	        if (trenes[i].getTipo().equalsIgnoreCase("Cercanias")) {
	            trenesCercanias[index] = trenes[i];
	            index++;
	        }
	    }

	    Tren[] trenesCercaniasFiltrados = new Tren[index];
	    System.arraycopy(trenesCercanias, 0, trenesCercaniasFiltrados, 0, index);

	    for (int i = 0; i < trenesCercaniasFiltrados.length - 1; i++) {
	        for (int j = 0; j < trenesCercaniasFiltrados.length - 1 - i; j++) {
	            if (trenesCercaniasFiltrados[j].getDuracion() > trenesCercaniasFiltrados[j + 1].getDuracion()) {
	                Tren temp = trenesCercaniasFiltrados[j];
	                trenesCercaniasFiltrados[j] = trenesCercaniasFiltrados[j + 1];
	                trenesCercaniasFiltrados[j + 1] = temp;
	            }
	        }
	    }

	    if (trenesCercaniasFiltrados.length > 0) {
	        System.out.println("Trenes de cercanías ordenados por duración del viaje:");
	        for (Tren tren : trenesCercaniasFiltrados) {
	            System.out.println("Referencia: " + tren.getReferencia() + ", Duración del viaje: " + tren.getDuracion() + " minutos");
	        }
	    } else {
	        System.out.println("No hay trenes de tipo 'Cercanias' para mostrar.");
	    }
	}
	
	private static void reservaAsientos(Scanner teclado, Tren[] trenes, int contadorTrenes) {
		System.out.print("Introduzca la referencia del tren para reservar asientos: ");
	    String referenciaBuscada = teclado.nextLine();

	    Tren trenSeleccionado = null;
	    for (int i = 0; i < contadorTrenes; i++) {
	        if (trenes[i].getReferencia().equalsIgnoreCase(referenciaBuscada)) {
	            trenSeleccionado = trenes[i];
	            break;
	        }
	    }

	    if (trenSeleccionado != null) {
	        System.out.print("Introduzca la cantidad de asientos a reservar: ");
	        int asientosAReservar = teclado.nextInt();
	        teclado.nextLine();

	        int asientosDisponibles = Tren.CAPACIDAD_MAXIMA - trenSeleccionado.getAsientosocupados();
	        if (asientosAReservar <= asientosDisponibles) {
	            trenSeleccionado.setAsientosocupados(trenSeleccionado.getAsientosocupados() + asientosAReservar);
	            System.out.println("Reserva realizada con éxito. Asientos ocupados ahora: " + trenSeleccionado.getAsientosocupados());
	        } else {
	            System.out.println("No hay suficientes asientos disponibles. Solo hay " + asientosDisponibles + " asientos libres.");
	        }
	    } else {
	        System.out.println("No se encontró ningún tren con la referencia proporcionada.");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Tren[] trenes = new Tren[30];
		int opcion;
		int contadorTrenes = 0;
		boolean salir = false;

		while (!salir) {
			System.out.println("\n----------Menu----------");
			System.out.println("1. Introducir trenes");
			System.out.println("2. Mostrar los trenes que superen una velocidad dada");
			System.out.println("3. Ordenar los trenes de cercanías por duración del viaje");
			System.out.println("4. Reserva de asientos");
			System.out.println("5. Mostrar todos los trenes que se han introducido");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				introducirTrenes(teclado, trenes);
				break;
			case 2:
				mostrarTrenesVelocidad(teclado, trenes, contadorTrenes);
				break;
			case 3:
				ordenarTrenes(teclado, trenes, contadorTrenes);
				break;
			case 4:
				reservaAsientos(teclado, trenes, contadorTrenes);
				break;
			case 5:
				mostrarTrenes(teclado, trenes);
				break;
			case 6:
				salir = true;
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
				break;
			} 
		}
	}
}
