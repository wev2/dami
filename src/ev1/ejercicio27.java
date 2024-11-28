package ev1;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota;
		System.out.println("Digame su nota del 0-10");
		nota = teclado.nextDouble();
		if (nota >=0 & nota <3) {
			System.out.println("Usted es un mediocre");			
		}
		if (nota >=3 & nota <5) {
			System.out.println("Su nota es insuficente");
		}
		if (nota >=5 & nota <6) {
			System.out.println("Su nota es suficiente");
		}
		if (nota >=6 & nota <7) {
			System.out.println("Su nota es buena");
		}
		if (nota >=7 & nota <9) {
			System.out.println("Su nota es notable");
		}
		if (nota >=9 & nota <10) {
			System.out.println("Su nota es un sobresaliente");
		}
		else {
			System.out.println("Mete un valor valido");
		}
		teclado.close();
	}

}
