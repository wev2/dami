package ev1;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double sueldo;
		System.out.println("Introduzca su sueldo");
		sueldo = teclado.nextDouble();
		if (sueldo>1000.00){
			System.out.println("Su retencion es de "+sueldo/(100*0.14));
		}
		else if (sueldo<1000.00) {
			System.out.println("Su rentencion es de "+sueldo/(100*0.10));
		}
		else  {
			System.out.println("Su retencion es de "+sueldo/(100*0.12));
		}
		teclado.close();
	}	
}

