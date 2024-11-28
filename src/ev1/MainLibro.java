package ev1;

import java.util.Scanner;

public class MainLibro {

	public static int mostrarMenu(Scanner teclado) {
		int opcion;
		System.out.println("\n1-Introducir libros");
		System.out.println("2-Libro de autor en concreto");
		System.out.println("3-Ordenar super ventas");
		System.out.println("4-Eliminar un libro");
		System.out.println("5-Mostrar libros");
		System.out.println("6-Modificar por ISBN");
		System.out.println("7-Salir");

		System.out.println("¿Qué quieres hacer?");
		opcion = teclado.nextInt();
		return opcion;
	}

	public static int introducirLibro(Scanner teclado, int contador, Libro a[]) {
		String respuesta = "si";
		String isbn;
		String nombre;
		String autor;
		int ejemplares;
		int precio;
		int pos;

		if(contador>=a.length) 
		{
			System.out.println("La libreria esta llena");
		}else {
			for(int i=contador;i<a.length&&respuesta.equalsIgnoreCase("si");i++) 
			{
				System.out.println("ISBN del libro; ");
				isbn= teclado.next();
				pos= buscarIsbn(isbn,a,contador);
				if (pos==-1) 
				{
					System.out.println("Nombre:");
					nombre=teclado.next();
					System.out.println("Autor: ");
					autor = teclado.next();
					System.out.println("Ejemplares:");
					ejemplares= teclado.nextInt();
					System.out.println("Precio:");
					precio= teclado.nextInt();

					Libro l1 = new Libro(isbn, nombre, autor, ejemplares,precio );
					a[i]=l1;
					contador++;

					do 
					{
						System.out.print("Quiere añadir otro libro?: ");
						respuesta = teclado.next();

						if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) 
						{
							System.out.println("Las opciones válidas son Si/No");
						}
					} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));

				}else {
					System.out.println("El libro ya existe");
				}

			}
		}

		return contador;
	}


	public static int buscarIsbn(String isbn, Libro a[], int contador) {
		boolean encontrado=false;

		for (int i=0; i<contador&&!encontrado;i++) 
		{
			if(isbn.equalsIgnoreCase(a[i].getIsbn())) 
			{
				encontrado=true;
				return i;
			}
		}
		return -1;
	}


	public static void mostrarPorAutor(Scanner teclado, Libro a[], int contador) {
		String autor;
		boolean encontrado=false;

		System.out.println("Que autor quieres buscar?");
		autor = teclado.next();
	
			for (int i=0; i<contador;i++) 
			{
				if(autor.equalsIgnoreCase(a[i].getAutor())) 
				{
					System.out.println("Libro:"+ a[i].getNombre()+" Beneficio: "+a[i].obtenerBeneficioTotal()+" €");	
					encontrado=true;
				}
			}					

		if (!encontrado) {
			System.out.println("El autor no esta");
		}
		
	}

	

	public static int eliminarPorIsbn(Scanner teclado, Libro a[], int contador) {
		String isbn, respuesta="";
		int pos=0;

		System.out.println("Introduce ISBN:");
		isbn = teclado.next();
		pos=buscarIsbn(isbn, a, contador);

		if(pos!=-1) {
			do 
			{
				System.out.println("Seguro que quiere borrar el libro?");
				respuesta = teclado.next();
				if(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")) 
				{
					System.out.println("Introduce Si o No");
				}
			}while(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"));

			if(respuesta.equalsIgnoreCase("si")) 
			{

				a[pos]=null;
				contador--;
				for(int i=pos;i<contador;i++) {
					a[i]=a[i+1];
				}
				a[contador]=null;
				System.out.println("Libro eliminado");

			}else {
				System.out.println("Eliminacion cancelada");

			}
		}else {
			System.out.println("El libro no existe.");
		}
		return contador; 
	}


	public static void ordenarSupers(Scanner teclado, Libro a[], int contador) {
		Libro l1; 
		boolean encontrado=false;
		
			for(int i=0; i<a.length-1; i++)
			{
				for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
					if(a[j].getVendidos()<a[j+1].getVendidos()){ 
						l1=a[j];
						a[j]=a[j+1];
						a[j+1]=l1;
					}   
				}
			}

			for(int i=0;i<contador;i++) 
			{
				if(a[i].esSuperVentas()) 
				{
					System.out.println(a[i].toString());
					encontrado=true;
				}
			}

		if (!encontrado) {
			System.out.println("No hay super ventas");
		}

	}

	public static void mostrar(int contador,Libro a[]) {
		System.out.println("Estos son los libros que hay: ");
		for(int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}

	public static void modificar(Scanner teclado, int contador,Libro a[]) {
		String respuesta, isbn;
		int pos, opcion;

		do {
			System.out.println("Introduce ISBN");
			isbn = teclado.next();
			pos = buscarIsbn(isbn, a, contador);

			if(pos!=-1) 
			{
				do {
					
					System.out.println("1-Nombre");
					System.out.println("2-Autor");
					System.out.println("3-Ejemplares");
					System.out.println("4-Precio");
					System.out.println("5-Salir");

					System.out.println("Que quires cambiar?");
					opcion = teclado.nextInt();

					switch (opcion) {
					
					case 1:
						System.out.println("¿Que nombre quieres ponerle?");
						a[pos].setNombre(teclado.next());
						System.out.println("Datos cambiados"+a[pos].toString());
						break;

					case 2:
						System.out.println("Que autor quieres asignarle?");
						a[pos].setAutor(teclado.next());
						System.out.println("Datos cambiados"+a[pos].toString());
						break;

					case 3:
						System.out.println("Cuantos ejempalres se han vendido?");
						a[pos].setVendidos(teclado.nextInt());
						System.out.println("Datos cambiados"+a[pos].toString());
						break;

					case 4:
						System.out.println("Que precio quires ponerle?");
						a[pos].setPrecio(teclado.nextInt());
						System.out.println("Datos cambiados"+a[pos].toString());

						break;

					case 5:
						System.out.println("ADIOS");
						break;

					default: System.out.println("ERROR");
					}
					
				}while(opcion!=5);
				
			}else {
				System.out.println("Ese libro no esta");
			}

			do 
			{
				System.out.println("Quieres cambiar otro libro?");
				respuesta = teclado.next();
				if(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")) 
				{
					System.out.println("Introduce si o no");
				}
			}while(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"));

		}while(respuesta.equalsIgnoreCase("si"));

	}


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		int contador=0; // cuantos libros hay en el array
		Libro[] a = new Libro[250];


		do {
			opcion = mostrarMenu(teclado);
			switch (opcion) {
			case 1:
				contador = introducirLibro(teclado,contador, a);
				break;
			case 2:
				if(contador==0) {
					System.out.println("No hay libros introducidos");
				}else {
					mostrarPorAutor(teclado, a, contador);
				}
				break;

			case 3:
				if(contador==0) {
					System.out.println("No libros introducidos");
				}else {
					ordenarSupers(teclado, a, contador);
				}
				break;

			case 4:
				if(contador==0) {
					System.out.println("No hay libros introducidos");
				}else {
					contador=eliminarPorIsbn(teclado,a, contador);
				}
				break;

			case 5:
				if(contador==0) {
					System.out.println("No hay libros introducidos");
				}else {
					mostrar(contador,a);
				}
				break;

			case 6:
				if(contador==0) {
					System.out.println("No hay libros introducidos");
				}else {
					modificar(teclado, contador, a);
				}
				break;

			case 7:
				System.out.println("ADIOS");
				break;

			default: System.out.println("ERROR");
			}
		}while(opcion!=7);

		teclado.close();
	}

}