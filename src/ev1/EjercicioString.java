package ev1;

import java.util.Scanner;

public class EjercicioString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre, palabra,palabra1,palabra2,igualar,igualar2,letra;
		int numero,numero1;
		
		
		System.out.println("Hola ¿Cual es su nombre?");
		nombre = teclado.next();
		System.out.println("Bienvenido/a "+nombre);
		
		System.out.println("====== Menú ======");
        System.out.println("1. Dar la vuelta a una palabra");
        System.out.println("2. Comparar dos palabras");
        System.out.println("3. Numero de letras");
        System.out.println("4. Repetir palabra con while");
        System.out.println("5.Repetir palabra con do while");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
        int opcion = teclado.nextInt();
        
        switch (opcion) {
        case 1: 
        	System.out.println("Escriba una palabra que quiera dar la vuelta");
        	palabra = teclado.next();
        	 String palabraInvertida = new StringBuilder(palabra).reverse().toString();
             System.out.println("Palabra original: " + palabra);
             System.out.println("Palabra invertida: " + palabraInvertida);
             System.out.println("La palabra dada la vuelta es "+palabraInvertida);
            break;
        case 2:
        	System.out.println("Introduzca la primera palabra");
        	igualar = teclado.next();
            System.out.println("Introduzca la segunda palabra");
            igualar2 = teclado.next();
            if (igualar.equalsIgnoreCase(igualar2)) {
            	System.out.println("Las palabras son iguales");
            }
            else {
            	System.out.println("Las palabras no son iguales");
            }
            break;
        case 3:
            System.out.println("Introduzca una palabra que quiera saber cuantas letras tiene");   
            letra = teclado.next();
            System.out.println("La palabra tiene "+(letra.length()));
            if(letra.length()>7) {
            	System.out.println("La palabra es larga");            	
            }
            else {
            	System.out.println("La palabra es corta");
            }        
            break; 
        	
        case 4:
        	System.out.println("Introduzca una palabra que quiera repetir");
        	palabra1 = teclado.next();
        	System.out.println("Introduce el numero de veces que quieres que se repita");
        	numero = teclado.nextInt();
        	int contador = 0;
        	while (contador < numero) {
        		System.out.println(palabra1.toUpperCase());
                contador++;
        	}
        	
        	break;
        	
        case 5:
        	System.out.println("Introduzca una palabra que quiera repetir");
        	palabra2 = teclado.next();
        	System.out.println("Introduce el numero de veces que quieres que se repita");
        	numero1 = teclado.nextInt();
        	int contador1 = 0;
        	
        	do {
        		System.out.println(palabra2.toUpperCase());
                contador1++;
        	}while(contador1<numero1);
        	
        	break;
        	
        case 6:
            System.out.println("Saliendo del programa, hasta la proxima");
        
            	break;
            	
        default:
            System.out.println("Opción no válida. Intenta de nuevo."); 
        }
        teclado.close();
	}
}