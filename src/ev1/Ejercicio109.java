package ev1;

import java.util.Scanner;

public class Ejercicio109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		int numero;
		System.out.println("Introduce un numero ");
		numero = teclado.nextInt();
		while (contador<=numero) {
			System.out.println(contador);
			contador+=2;
		}

	}

}
