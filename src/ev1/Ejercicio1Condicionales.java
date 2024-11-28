package ev1;

import java.util.Scanner;

public class Ejercicio1Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                System.out.println("MITAD");
            } else if (i % 2 == 0) {
                System.out.println(i + " PAR");
            } else {
                System.out.println(i);
            }
        }
    }
}
