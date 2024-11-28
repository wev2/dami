package ev1;

import java.util.Scanner;

public class PrimerPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.println("¡Hola!");
		System.out.println("¿Cual es tu nombre?");
		nombre = teclado.next();
		System.out.println("Bienvenido/a "+nombre+". Vamos a realizar diferentes calculos.");
		System.out.println("***************************************");
		
		double i;
		System.out.println("CIRCULO");
		System.out.println("Introduce el valor del radio");
		i = teclado.nextDouble();
		System.out.println("El area del circulo es "+(Math.PI*i*i)+ "m2");
		System.out.println("***************************************");
		
		double lado;
		System.out.println("CUADRADO");
		System.out.println("Introduce el valor del lado");
		lado = teclado.nextDouble();
		System.out.println("El area del cuadrado es "+lado*lado+ "m2");
		System.out.println("***************************************");
		
		double largo;
		double corto;
		System.out.println("RECTANGULO");
		System.out.println("Introduce el valor del lado más largo");
		largo = teclado.nextDouble();
		System.out.println("Introduce el valor del lado más corto");
		corto = teclado.nextDouble();
		System.out.println("El area del rectangulo es "+largo*corto+ "m2");
		System.out.println("***************************************");
		
		double altura;
		double base;
		System.out.println("TRIANGULO");
		System.out.println("Introduce el valor de la altura");
		altura = teclado.nextDouble();
		System.out.println("Introduce el valor de la base");
		base = teclado.nextDouble();
		System.out.println("El area del triangulo es "+(base*altura)/2+ "m2");
		teclado.close();
		
	}

}
