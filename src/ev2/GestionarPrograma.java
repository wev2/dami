package ev2;
import utilidades.Utilidades;
import java.util.ArrayList;
import utilidades.LineaListado;
import utilidades.MyObjectOutputStream;

public class GestionarPrograma {

	private static final String Profesor = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Profesor> Array = new ArrayList <Profesor>();
		int opcion;
		do {
			mostrarMenu();
			opcion = Utilidades.leerInt("Introduzca opcion");

			switch (opcion) {

			case 1:
				introducirProfesor(Array);
				break;
			case 2:
				añadirPublicacion(Array);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;	
			}

		} while (opcion !=1);
	}
	
	private static void añadirPublicacion(ArrayList<ev2.Profesor> array) {
		// TODO Auto-generated method stub
		
	}

	private static void introducirProfesor(ArrayList<Profesor> array) {
		// TODO Auto-generated method stub
		String email;
        boolean emailValido;
        do {
            email = Utilidades.leerString(100, "Introduzca el email del profesor: ");
            emailValido = validarEmail(array, email);
        } while (!emailValido);

        String nombre = Utilidades.leerString(100, "Introduzca el nombre del profesor: ");
        String departamento = Utilidades.leerString(100,"Introduzca el nombre del departamento: ");

        Profesor nuevoProfesor = new Profesor(email, nombre, departamento);
        array.add(nuevoProfesor);
        System.out.println("Profesor " + nombre + " registrado con éxito.");
    }

    private static boolean validarEmail(ArrayList<Profesor> array, String email) {
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]+$";
        if (!email.matches(regex)) {
            System.out.println("Error: El formato del email no es válido.");
            return false;
        }

        for (Profesor p : array) {
            if (p.getEmail().equals(email)) {
                System.out.println("Error: El email ya está registrado.");
                return false;
            }
        }

        return true;
	}

	private static void mostrarMenu() {
		System.out.println("\n--- Menú de gestión de vehículos---");
		System.out.println("1. Introducir un nuevo profesor");
		System.out.println("2. Añadir publicación.");
		System.out.println("3. Mostrar los libros galardonados de un año concreto.");
		System.out.println("4. Mostrar un listado por departamento de los profesores con mayor número de publicaciones");
		System.out.println("5. Listado de los profes");
		System.out.println("6. Salir");
		System.out.println("Seleccione una opción: ");
	}
}
