package ev1;

import java.util.Scanner;

public class Interes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double cantidad;
		double tipointeres;
		int tiempo;
		System.out.println("Introduce la cantidad");
		cantidad = teclado.nextDouble();
		System.out.println("Introduce el tipo de interes");
		tipointeres = teclado.nextDouble();
		System.out.println("Introduce el tiempo");
		tiempo = teclado.nextInt();
		System.out.println("El interes producido es "+(cantidad*tipointeres*tiempo)/(360*100)+"%");
		teclado.close();
		
	}
}
