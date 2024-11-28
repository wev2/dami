package ev1;

import java.util.Scanner;

public class TiendaLibrosv2 {

	public static void AñadirArticulosPrecio ( String a[], int[] b) {
		Scanner teclado = new Scanner(System.in);
		String libro;
		int precio;
		char continuar;

		do {
			System.out.println("¿Cuál es el libro que quiere añadir?");
			libro = teclado.next();

			boolean existe = false;
			for (String l : a) {
				if (libro.equalsIgnoreCase(l)) {
					System.out.println("Error: El libro ya está en el inventario.");
					existe = true;
					break;
				}
			}

			if (!existe) {
				System.out.println("Ahora añada el precio de ese artículo:");
				precio = teclado.nextInt();

				boolean añadido = false;
				for (int i = 0; i < a.length; i++) {
					if (a[i] == null) {
						a[i] = libro;
						b[i] = precio;
						añadido = true;
						System.out.println("Libro añadido con éxito.");
						break;
					}
				}

				if (!añadido) {
					System.out.println("Error: No hay espacio disponible para más libros.");
				}
			}

			System.out.println("¿Desea añadir otro libro? (s/n):");
			continuar = teclado.next().charAt(0);

		} while (Character.toLowerCase(continuar) == 's');
	}

	public static void mostrarArticulos(String[] a, int[] b) {
		for (int i=0;i<a.length;i++) {
			if (a[i]!= null){
				System.out.println(a[i]+ " precio "+b[i]+ " Euros");
			}
		}

	}
	

	public static void obtenerPrecio(String[] a, int[] b) {
		for (int i=0;i<a.length;i++) {
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String []a = new String[10];
		int []b = new int[10];

		a[0] = "Viento";
		a[1] = "Agua";
		a[2] = "Cagoneta";
		a[3] = "Martillazos";
		a[4] = "Tierra";
		a[5] = "Piedras";
		a[6] = "20";
		a[7] = "Eclipse";
		a[8] = "Niggers";

		b[0] = 10;
		b[1] = 11;
		b[2] = 12;
		b[3] = 13;
		b[4] = 14;
		b[5] = 15;
		b[6] = 16;
		b[7] = 17;
		b[8] = 18;



		int opcion;
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1.- Añadir artículos y precios");
			System.out.println("2.- Mostrar productos de la tienda");
			System.out.println("3.- Obtener el precio de un producto");
			System.out.println("4.- Obtener el IVA de un producto");
			System.out.println("5.- Modificar el precio de un producto");
			System.out.println("6.- Eliminar un producto");
			System.out.println("7.- Salir");
			System.out.println("Que quieres hacer care monda");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				AñadirArticulosPrecio (a,b);
				break;
			case 2:
				mostrarArticulos (a,b);
				break;
			case 3:
				obtenerPrecio (a,b);
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while (opcion !=1);

	}
}
