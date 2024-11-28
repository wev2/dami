package ev2;

import utilidades.Utilidades;
import java.util.ArrayList;
import utilidades.LineaListado;
import utilidades.MyObjectOutputStream;

public class GestionEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleade> Array = new ArrayList <Empleade>();
		int opcion;
		do {
			mostrarMenu();
			opcion = Utilidades.leerInt("Introduzca opcion");

			switch (opcion) {

			case 1:
				introducirEmpleado(Array);
				break;
			case 2:
				break;
			case 3:
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
	
	private static void introducirEmpleado(ArrayList<Empleade> array) {
		
		
	}

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
}
