package ev1;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String []alumnos= new String[6];
		int []edades = new int[6];
		int opcion;
		
		alumnos[0] = "Jon";
		alumnos[1] = "Sara";
		alumnos[2] = "Ander";
		alumnos[3] = "Marta";
		alumnos[4] = "Jone";
		alumnos[5] = "Mikel";
		
		edades[0] = 18;
		edades[1] = 20;
		edades[2] = 26;
		edades[3] = 21;
		edades[4] = 17;
		edades[5] = 24;
		
		do {
			System.out.println("¿Que quiere hacer?");
			System.out.println("1- El nombre y edad del más joven");
			System.out.println("2- El nombre y edad del mayor.");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("El alumno mas joven es "+alumnos[0]+" y tiene "+edades[0]+" años");
				break;
			case 2:
				System.out.println("El alumno mas mayor es "+alumnos[2]+" y tiene "+edades[2]+" años");
				break;
			
			}
		
		
			}while (opcion !=1);

	}
}

