package ev1;

import java.util.Scanner;

public class condicion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double numero;
		System.out.println("¿Puede introducir un numero?");
		numero = teclado.nextDouble();
		//System.out.println("El cuadrado de ese numero es "+numero*numero);
		if ((numero*numero)>100) {
			System.out.println("El cuadrado del numero es  mayor que cien "+((numero*numero)-100));
		}
		else {
			System.out.println("No es mayor que 100 le falta "+(100-(numero*numero)));
		}
		teclado.close();
	}

}
