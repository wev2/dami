package ev1;

import java.util.Scanner;

public class Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la temperatura en grados Celsius");
		double Celsius;
		Celsius = teclado.nextDouble();
		System.out.println("La grados en Celsius es "+Celsius+"°C");
		System.out.println("Los grados en Fahrenheit son "+(32+(1.8*Celsius))+"°F");
		System.out.println("Los grados en Kelvin son "+(273+Celsius)+"K");
		teclado.close();
	}
}