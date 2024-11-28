package ev2;

import java.util.Scanner;

public class MainCoches {
	private static void mostrarMenu() {
		System.out.println("\n--- Menú de gestión de vehículos---");
		System.out.println("1. Introducir un nuevo vehículo");
		System.out.println("2. Listar los datos de los coches que sean descapotables");
		System.out.println("3. Pedir una tara al usuario y listar las furgonetas con una tara menor a la introducida");
		System.out.println("4. Pedir una nueva carga y modificarla para todas las furgonetas");
		System.out.println("5. Mostrar los datos de la furgoneta más antigua y más nueva");
		System.out.println("6. Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos");
		System.out.println("7. Ordenar el listado de furgonetas por tara y mostrarlo");
		System.out.println("8. Listar todos los vehículos ordenados por matrícula");
		System.out.println("9. Introducir una matrícula y borrar dicho vehículo");
		System.out.println("10. Salir");
		System.out.println("Seleccione una opción: ");
	}

	private static void introducirNuevoVehiculo(Vehiculo[] misVehiculos, int contadorVehiculos, Scanner teclado) {
		if (contadorVehiculos >= misVehiculos.length) {
			System.out.println("No hay espacio para más vehículos.");
			return;
		}
		System.out.println("¿Qué tipo de vehículo deseas introducir?");
		System.out.println("1. Coche");
		System.out.println("2. Furgoneta");
		int tipoVehiculo = teclado.nextInt();
		teclado.nextLine();

		if (tipoVehiculo == 1) {
			System.out.print("Introduce la matrícula del coche: ");
			String matricula = teclado.nextLine();
			System.out.print("Introduce la marca del coche: ");
			String marca = teclado.nextLine();
			System.out.print("Introduce el modelo del coche: ");
			String modelo = teclado.nextLine();
			System.out.print("Introduce los años de antigüedad del coche: ");
			int añosAntigüedad = teclado.nextInt();
			System.out.print("Introduce el precio del coche: ");
			int precio = teclado.nextInt();
			teclado.nextLine();
			System.out.print("¿Es un coche descapotable? (true/false): ");
			boolean descapotable = teclado.nextBoolean();
			teclado.nextLine();

			misVehiculos[contadorVehiculos] = new Coche(matricula, marca, modelo, añosAntigüedad, precio, descapotable);
			System.out.println("Coche añadido correctamente.");
		} else if (tipoVehiculo == 2) {
			System.out.print("Introduce la matrícula de la furgoneta: ");
			String matricula = teclado.nextLine();
			System.out.print("Introduce la marca de la furgoneta: ");
			String marca = teclado.nextLine();
			System.out.print("Introduce el modelo de la furgoneta: ");
			String modelo = teclado.nextLine();
			System.out.print("Introduce los años de antigüedad de la furgoneta: ");
			int añosAntigüedad = teclado.nextInt();
			System.out.print("Introduce el precio de la furgoneta: ");
			int precio = teclado.nextInt();
			System.out.print("Introduce la altura de la furgoneta (en metros): ");
			double alto = teclado.nextDouble();
			System.out.print("Introduce la tara de la furgoneta (en kg): ");
			int tara = teclado.nextInt();
			System.out.print("Introduce la carga de la furgoneta (en kg): ");
			int carga = teclado.nextInt();
			teclado.nextLine();

			misVehiculos[contadorVehiculos] = new Furgoneta(matricula, marca, modelo, añosAntigüedad, precio, alto, tara, carga);
			System.out.println("Furgoneta añadida correctamente.");
		} else {
			System.out.println("Opción no válida. Por favor, selecciona 1 para coche o 2 para furgoneta.");
		}
	}
	private static void listarCochesDescapotables(Vehiculo[] misVehiculos) {
		boolean hayCochesDescapotables = false;

		System.out.println("Coches descapotables:");

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo instanceof Coche) {
				Coche coche = (Coche) vehiculo;
				if (coche.getDescapotable()) {
					System.out.println(coche.toString());
					hayCochesDescapotables = true;
				}
			}
		}
		if (!hayCochesDescapotables) {
			System.out.println("No hay coches descapotables registrados.");
		}
	}

	private static void listarFurgonetasPorTara(Vehiculo[] misVehiculos, Scanner teclado) {
		System.out.print("Introduce una tara para filtrar las furgonetas: ");
		int taraIntroducida = teclado.nextInt();
		teclado.nextLine();

		boolean hayFurgonetas = false;

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo instanceof Furgoneta) {
				Furgoneta furgoneta = (Furgoneta) vehiculo;
				if (furgoneta.getTara() < taraIntroducida) {
					System.out.println(furgoneta);
					hayFurgonetas = true;
				}
			}
		}

		if (!hayFurgonetas) {
			System.out.println("No se encontraron furgonetas con una tara menor a " + taraIntroducida);
		}
	}


	private static void modificarCargaFurgonetas(Vehiculo[] misVehiculos, Scanner teclado) {
		System.out.print("Introduce la nueva carga para todas las furgonetas (en kg): ");
		int nuevaCarga = teclado.nextInt();
		teclado.nextLine();

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo instanceof Furgoneta) {
				Furgoneta furgoneta = (Furgoneta) vehiculo;
				furgoneta.setCarga(nuevaCarga);
			}
		}
		System.out.println("La carga ha sido actualizada para todas las furgonetas.");
	}

	private static void mostrarFurgonetaMasAntiguaYMasNueva(Vehiculo[] misVehiculos) {
		Furgoneta furgonetaMasAntigua = null;
		Furgoneta furgonetaMasNueva = null;

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo instanceof Furgoneta) {
				Furgoneta furgoneta = (Furgoneta) vehiculo;
				if (furgonetaMasAntigua == null || furgoneta.getAñosantigüedad() > furgonetaMasAntigua.getAñosantigüedad()) {
					furgonetaMasAntigua = furgoneta;
				}
				if (furgonetaMasNueva == null || furgoneta.getAñosantigüedad() < furgonetaMasNueva.getAñosantigüedad()) {
					furgonetaMasNueva = furgoneta;
				}
			}
		}

		if (furgonetaMasAntigua == null || furgonetaMasNueva == null) {
			System.out.println("No hay furgonetas en el sistema.");
		} else {
			System.out.println("Furgoneta más antigua: " + furgonetaMasAntigua);
			System.out.println("Furgoneta más nueva: " + furgonetaMasNueva);
		}
	}

	private static void mostrarAntigüedadMedia(Vehiculo[] misVehiculos) {
		int sumaCoches = 0, sumaFurgonetas = 0, totalAntigüedad = 0;
		int contadorCoches = 0, contadorFurgonetas = 0;

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo instanceof Coche) {
				sumaCoches += vehiculo.getAñosantigüedad();
				contadorCoches++;
			} else if (vehiculo instanceof Furgoneta) {
				sumaFurgonetas += vehiculo.getAñosantigüedad();
				contadorFurgonetas++;
			}
			if (vehiculo != null) {
				totalAntigüedad += vehiculo.getAñosantigüedad();
			}
		}

		if (contadorCoches > 0) {
			System.out.println("Antigüedad media de los coches: " + (sumaCoches / (double) contadorCoches));
		} else {
			System.out.println("No hay coches para calcular la antigüedad media.");
		}

		if (contadorFurgonetas > 0) {
			System.out.println("Antigüedad media de las furgonetas: " + (sumaFurgonetas / (double) contadorFurgonetas));
		} else {
			System.out.println("No hay furgonetas para calcular la antigüedad media.");
		}

		if (totalAntigüedad > 0) {
			System.out.println("Antigüedad media de todos los vehículos: " + (totalAntigüedad / (double) (contadorCoches + contadorFurgonetas)));
		}
	}

	private static void listarVehiculosPorMatricula(Vehiculo[] misVehiculos) {
		Vehiculo[] vehiculosOrdenados = new Vehiculo[misVehiculos.length];
		int contador = 0;

		for (Vehiculo vehiculo : misVehiculos) {
			if (vehiculo != null) {
				vehiculosOrdenados[contador++] = vehiculo;
			}
		}

		for (int i = 0; i < contador - 1; i++) {
			for (int j = i + 1; j < contador; j++) {
				if (vehiculosOrdenados[i].getMatricula().compareTo(vehiculosOrdenados[j].getMatricula()) > 0) {
					Vehiculo temp = vehiculosOrdenados[i];
					vehiculosOrdenados[i] = vehiculosOrdenados[j];
					vehiculosOrdenados[j] = temp;
				}
			}
		}

		System.out.println("Vehículos ordenados por matrícula:");
		for (int i = 0; i < contador; i++) {
			System.out.println(vehiculosOrdenados[i]);
		}
	}

	private static int eliminarVehiculoPorMatricula(Vehiculo[] misVehiculos, Scanner teclado, int contadorVehiculos) {
		System.out.print("Introduce la matrícula del vehículo a eliminar: ");
		String matricula = teclado.nextLine();
		boolean eliminado = false;

		for (int i = 0; i < contadorVehiculos; i++) {
			if (misVehiculos[i] != null && misVehiculos[i].getMatricula().equalsIgnoreCase(matricula)) {
				eliminado = true;
				for (int j = i; j < contadorVehiculos - 1; j++) {
					misVehiculos[j] = misVehiculos[j + 1];
				}
				misVehiculos[contadorVehiculos - 1] = null;
				contadorVehiculos--;
				break;
			}
		}

		if (eliminado) {
			System.out.println("Vehículo eliminado con éxito.");
		} else {
			System.out.println("No se encontró ningún vehículo con esa matrícula.");
		}

		return contadorVehiculos;
	}

	public static void main(String[] args) {
		Vehiculo[] misVehiculos = new Vehiculo[100];
		misVehiculos[0]=new Coche(" matricula", "arca", " modelo", 1, 1000, true) ;
		misVehiculos[1]=new Furgoneta(" matricula", "arca", " modelo", 1, 1000,2,1000,2000);
		int contadorVehiculos = 2;
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				introducirNuevoVehiculo(misVehiculos, contadorVehiculos, teclado);
				contadorVehiculos++;
				break;
			case 2:
				listarCochesDescapotables(misVehiculos);
				break;
			case 3:
				listarFurgonetasPorTara(misVehiculos, teclado);
				break;
			case 4:
				modificarCargaFurgonetas(misVehiculos, teclado);
				break;
			case 5:
				mostrarFurgonetaMasAntiguaYMasNueva(misVehiculos);
				break;
			case 6:
				mostrarAntigüedadMedia(misVehiculos);
				break;
			case 8:
				listarVehiculosPorMatricula(misVehiculos);
				break;
			case 9:
				contadorVehiculos = eliminarVehiculoPorMatricula(misVehiculos, teclado, contadorVehiculos);
				break;
			case 10:
				System.out.println("Saliendo del programa. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
				break;
			}
		} while (opcion != 10);
		teclado.close();
	}
}
