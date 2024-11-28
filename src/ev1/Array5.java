package ev1;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] contador = new int[10];
		int num;
		int totalNumeros = 0;

		while (totalNumeros < 10) {
			System.out.println("Introduzca un número del 0 al 9 (o un número negativo para finalizar):");
			num = teclado.nextInt();

			if (num < 0) {

			} else if (num >= 0 && num < 10) {
				contador[num]++;
				totalNumeros++;
			} else {
				System.out.println("ERROR. El número debe estar entre 0 y 9.");
			}
		}

		System.out.println("Número de veces que se ha introducido cada número:");
		for (int i = 0; i < contador.length; i++) {
			System.out.println(i + ": " + contador[i] + " veces");
		}

		teclado.close();
	}
}
