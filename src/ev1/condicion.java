package ev1;

import java.util.Scanner;

public class condicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double euros;
		System.out.println("Introduzca su capital en euros");
		euros = teclado.nextDouble();
		if (euros<20000) {
			System.out.println("La cantidad del IVA es 7%");
		}
		else {
			System.out.println("El IVA es del 16%");
		}
	}

}
