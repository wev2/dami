package ev1;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String []a= {"Iker", "Hugo", "Cagoneta", "Roberto"};
		String nombre1;
		boolean encontrado = false;
		int opcion;
		
		
		
		do {
			encontrado=false;
			System.out.println("Seleccione una opción:");
			System.out.println("1.- Salir");
			System.out.println("2.- Mostrar lista");
			System.out.println("3.- Pedir un nombre y contar las veces que aparece");
			System.out.println("4.- Pedir un nombre y decir si existe");
			System.out.println("5.- Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”");
			System.out.println("Que quieres hacer care monda");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agur");
				break;
			case 2:
				for (int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				break;
			case 3:
				int cantidad = 0;
				String nombre;
				System.out.println("Introduce tu nombre");
				nombre = teclado.next();
				for (int i=0;i<a.length;i++) {
					if (nombre.equalsIgnoreCase(a[i]));{
						cantidad++;
					}
				}
				System.out.println("El noombre introducido es "+nombre+ " y se repite " +cantidad+" veces");
				break;
			case  4:
				System.out.println("Introduce tu nombre");
				nombre1 = teclado.next();
				for (int i=0;i<a.length && !encontrado;i++) {
					if (nombre1.equals(a[i])){
						encontrado=true;
					}
				}
				if (encontrado) {
					System.out.println("ENCONTRADO");					
				}else {
					System.out.println("No encontrado");
				}
				break;
			case 5:
				System.out.println("Introduce tu nombre");
				nombre1 = teclado.next();
				for (int i=0;i<a.length && !encontrado;i++) {
					if (nombre1.equals(a[i])){
						encontrado=true;
					}
				}
				if (encontrado) {
					System.out.println("ENCONTRADO");					
				}else {
					System.out.println("No encontrado");
				}
				break;
			}


		}while(opcion != 1);
	}
}
