package ev1;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a, b;
		System.out.println("Introduzca un primer numero");
		a = teclado.nextInt();
		System.out.println("Introduzca un segundo numero");
		b = teclado.nextInt();
		if (a>b) {
			System.out.println("El primer numero es mayor que el segundo");
		}
		else if (a<b) {
			System.out.println("El segundo numero es mayor que el primero");
		}
		else {
			System.out.println("Los numeros son iguales");
		}
		teclado.close();
	}

}
