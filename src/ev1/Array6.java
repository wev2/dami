package ev1;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int totalNumeros = 0; 
		int suma = 0;
		int num;
		boolean finalizar = false;

		// Bucle principal
		while (totalNumeros < 10 && !finalizar) { 
			System.out.println("Introduzca un número (o un número negativo para finalizar):");
			num = teclado.nextInt();

			if (num >= 0) {
				numeros[totalNumeros] = num;
				suma += num;
				totalNumeros++;
			} else {
				finalizar = true;
			}
		}

		if (totalNumeros > 0) {
			double media = (double) suma / totalNumeros;
			System.out.println("La media de los números introducidos es: " + media);
		} else {
			System.out.println("No se introdujeron números válidos.");
		}

		teclado.close();
	}
}
