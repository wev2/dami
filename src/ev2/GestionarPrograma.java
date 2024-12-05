package ev2;
import utilidades.Utilidades;
import java.util.ArrayList;
import utilidades.LineaListado;
import utilidades.MyObjectOutputStream;

public class GestionarPrograma {

	private static final String Profesor = null;

	public static void main(String[] args) {
	    ArrayList<Profesor> array = new ArrayList<>();
	    int opcion;
	    do {
	        mostrarMenu();
	        opcion = Utilidades.leerInt("Introduzca una opción");

	        switch (opcion) {
	            case 1:
	                introducirProfesor(array);
	                break;
	            case 2:
	                añadirPublicacion(array);
	                break;
	            case 3:
	                librosGalardonados(array);
	                break;
	            case 4:
	                mayorNumeroPublicaciones(array);
	                break;
	            case 5:
	                listadoProfesores(array);
	                break;
	            case 6:
	                System.out.println("Saliendo del programa. ¡Hasta luego!");
	                break;
	            default:
	                System.out.println("Opción no válida. Inténtelo de nuevo.");
	        }
	    } while (opcion != 6);
	}

	private static void listadoProfesores(ArrayList<Profesor> array) {
		// TODO Auto-generated method stub
		if (array.isEmpty()) {
	        System.out.println("No hay profesores registrados.");
	    } else {
	        System.out.println("\n--- Lista de Profesores Registrados ---");
	        for (Profesor profesor : array) {
	            System.out.println("Nombre: " + profesor.getNombre());
	            System.out.println("Email: " + profesor.getEmail());
	            System.out.println("Departamento: " + profesor.getNombreDepartamento());
	            System.out.println("--------------------------------------");
	        }
	    }
	}

	private static void mayorNumeroPublicaciones(ArrayList<Profesor> array) {
		// TODO Auto-generated method stub
		
	}
	
	private static void librosGalardonados(ArrayList<Profesor> array) {
		// TODO Auto-generated method stub
		int anio = Utilidades.leerInt("Ingrese el año para buscar libros premiados: ");
		boolean encontrado = false;

		for (Profesor profesor : array) {
			for (Publicacion publicacion : profesor.getPublicaciones()) {
				if (publicacion instanceof Libro) {
					Libro libro = (Libro) publicacion;
					if (libro.getPremiado().equalsIgnoreCase("sí") && 
							libro.getFechaPublicacion().startsWith(String.valueOf(anio))) {

						System.out.println("Fecha: " + libro.getFechaPublicacion());
						System.out.println("Titulo: " + libro.getTitulo());
						System.out.println("ISBN: " + libro.getIsbn());
						System.out.println("Profesor: " + profesor.getNombre());
						System.out.println("Departamento: " + profesor.getNombreDepartamento());
						System.out.println("-------------------------------------");
						encontrado = true;
					}
				}
			}
		}

		if (!encontrado) {
			System.out.println("No se encontraron libros premiados en el año " + anio + ".");
		}
	}

	private static void añadirPublicacion(ArrayList<Profesor> array) {
		// TODO Auto-generated method stub
		Profesor profesor = null;
		for (Profesor p : array) {
			if (p.getEmail().equalsIgnoreCase(Profesor)) {
				profesor = p;
				break;
			}
		}

		if (profesor == null) {
			System.out.println("Error: No se encontro ningun profesor con el email proporcionado.");
			return;
		}

		System.out.println("Informacion del profesor:");
		System.out.println("Nombre: " + profesor.getNombre());
		System.out.println("Departamento: " + profesor.getNombreDepartamento());
		System.out.println("Publicaciones:");
		if (profesor.getPublicaciones().isEmpty()) {
			System.out.println("No tiene publicaciones registradas.");
		} else {
			for (Publicacion pub : profesor.getPublicaciones()) {
				System.out.println(" - Título: " + pub.getTitulo() + ", Fecha: " + pub.getFechaPublicacion());
			}
		}

		boolean continuar;
		do {
			String titulo = Utilidades.leerString(100, "Introduzca el titulo de la publicacion: ");
			String fecha = Utilidades.leerString(10, "Introduzca la fecha de publicacion (YYYY-MM-DD): ");

			Publicacion nuevaPublicacion = new Publicacion(fecha, titulo) {
				@Override
				public void mostrarDetalles() {
					System.out.println("Titulo: " + getTitulo() + ", Fecha: " + getFechaPublicacion());
				}
			};

			profesor.agregarPublicacion(nuevaPublicacion);
			System.out.println("Publicacion agregada con exito.");

			continuar = Utilidades.leerString(10, "¿Desea añadir otra publicacion? (s/n): ").equalsIgnoreCase("s");
		} while (continuar);
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
			String departamento = Utilidades.leerString(100, "Introduzca el nombre del departamento: ");

			Profesor nuevoProfesor = new Profesor(email, nombre, departamento);
			array.add(nuevoProfesor);
			System.out.println("Profesor " + nombre + " registrado con éxito.");

		}

		private static boolean validarEmail(ArrayList<Profesor> array, String email) {
			String regex = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]+$";
			if (!email.matches(regex)) {
				System.out.println("Error: El formato del email no es valido.");
				return false;
			}

			for (Profesor p : array) {
				if (p.getEmail().equals(email)) {
					System.out.println("Error: El email ya esta registrado.");
					return false;
				}
			}

			return true;
		}

		private static void mostrarMenu() {
			System.out.println("\n--- Menu de gestion de vehiculos---");
			System.out.println("1. Introducir un nuevo profesor");
			System.out.println("2. Añadir publicacion.");
			System.out.println("3. Mostrar los libros galardonados de un año concreto.");
			System.out.println("4. Mostrar un listado por departamento de los profesores con mayor numero de publicaciones");
			System.out.println("5. Listado de los profes");
			System.out.println("6. Salir");
			System.out.println("Seleccione una opcion: ");
		}
	}