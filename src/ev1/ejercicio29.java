package ev1;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		String opcion;
		System.out.println("Introduce un primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2 = teclado.nextInt();
        do {
            System.out.println("---- Menú ----");
            System.out.println("a. Sumar");
            System.out.println("b. Restar");
            System.out.println("c. Multipliar");
            System.out.println("d. Dividir");
            System.out.println("e. Resto (%)");
            System.out.println("f. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.next();

            switch (opcion) {
                case "a":
                    System.out.println("La suma es "+(num1+num2));
                    break;
                case "b":
                    System.out.println("La resta es "+(num1-num2));
                    break;
                case "c":
                    System.out.println("La multiplicacion es "+(num1*num2));
                    break;
                case "d":
                    System.out.println("La dvision es "+(num1/num2));
                    break;
                case "e":
                    System.out.println("El resto es "+(num1%num2));
                    break;
                case "f":
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != "f");

        teclado.close();
    }
}         	