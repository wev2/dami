package ev1;

import java.util.Scanner;

public class Fruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int edad;
		System.out.println("Introduzca su nombre");
		nombre = teclado.next();
		System.out.println("Introduzca su primer apellido");
		apellido = teclado.next();
		System.out.println("Introduzca su edad");
		edad = teclado.nextInt();
		if (edad < 18) {
			System.out.println("No puede acceder al sistema por ser menor de edad");
			return;
		}
		System.out.println("Bienvenido, " + nombre + " " + apellido + "!");
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Realizar una nueva compra");
            System.out.println("2.- Comprobar si existe fruta");
            System.out.println("3.- Introducir fruta");
            System.out.println("4.- Salir del programa");
            System.out.println("¿Que quieres realizar?");
            opcion = teclado.nextInt();
            
            switch (opcion) {
            case 1:
            	double precio1, precio2,precio3;
                do {
                    System.out.print("Inserta el precio del primer producto: ");
                    precio1 = teclado.nextDouble();
                    if (precio1 < 0) {
                        System.out.println("El precio no puede ser negativo.");
                    }
                } while (precio1 < 0);
                
                do {
                    System.out.print("Inserta el precio del segundo producto: ");
                    precio2 = teclado.nextDouble();
                    if (precio2 < 0) {
                        System.out.println("El precio no puede ser negativo.");
                    }
                } while (precio2 < 0);
                
                do {
                    System.out.print("Inserta el precio del tercer producto: ");
                    precio3 = teclado.nextDouble();
                    if (precio3 < 0) {
                        System.out.println("El precio no puede ser negativo.");
                    }
                } while (precio3 < 0);
                
                double total = precio1 + precio2 + precio3;
                System.out.printf("Total: %.2f Euros%n", total);
                
                System.out.print("¿Quieres salir del programa? (SI / NO): ");
                teclado.nextLine();
                String respuesta = teclado.nextLine().trim().toUpperCase();
                
                if (respuesta.equals("SI")) {
                    System.out.println("Saliendo del programa.");
                    opcion = 4;
                }
            	break;
            case 2:
            	teclado.nextLine();
                System.out.print("Inserta el nombre de la fruta: ");
                String nombreProducto = teclado.nextLine().trim();
                
                if (nombreProducto.equalsIgnoreCase("Manzana")) {
                    System.out.println("Si tenemos esa fruta.");
                } else {
                    System.out.println("Esa fruta no esta disponible.");
                }
                
                System.out.print("¿Quieres salir del programa? (SI / NO): ");
                String respuestaStock = teclado.nextLine().trim().toUpperCase();
                
                if (respuestaStock.equals("SI")) {
                    System.out.println("Saliendo del programa.");
                    opcion = 4;
                }
        
            	break;
            case 3:
            	 String password = "abc";
                 String inputPassword;
        
                 do {
                     System.out.print("Introduce la contraseña de administrador: ");
                     inputPassword = teclado.nextLine();

                     if (!inputPassword.equals(password)) {
                         System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
                     }
                 } while (!inputPassword.equals(password));

                 System.out.print("Introduce el nombre de la fruta: ");
                 String fruta = teclado.nextLine();

                 for (int i = 0; i < 3; i++) {
                     System.out.println("La fruta: " + fruta + " se ha guardado");
                 }
                 System.out.print("¿Quieres salir del programa? (SI / NO): ");
                 teclado.nextLine();
                 String palabra = teclado.nextLine().trim().toUpperCase();
                 
                 if (palabra.equals("SI")) {
                     System.out.println("Saliendo del programa.");
                     opcion = 4;
                 }
                 break;
                 
            case 4:
            	System.out.println("Saliendo del programa. Hasta la proxima");
            	break;
            
            }
        } while(opcion != 4);
	}

}
