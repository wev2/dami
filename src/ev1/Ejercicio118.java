package ev1;

import java.util.Scanner;

public class Ejercicio118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero, resultado = 0;
		System.out.println("Introduce un numero");
		numero = teclado.nextInt();
		if (numero % 2 != 0) {
		            numero--;
		}
		
		while (numero>=0) {
			if (numero % 2==0) {
				System.out.print(numero+"+");
				resultado=resultado+numero;
	            
			}
			numero--;
		}
		System.out.println("\nResultado "+resultado);
		teclado.close();
		
	}

}
