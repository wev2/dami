package ev1;
import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su DNI: ");
        String dni = scanner.nextLine();
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad <= 18) {
            System.out.println("Debes tener más de 18 años");
            return;
        }
        
        System.out.println("Bienvenido, " + nombre + " " + apellido + "!");
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Comprar libro");
            System.out.println("2.- Comprobar si hay stock");
            System.out.println("3.- Salir del programa");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                	double precio1, precio2;
                    do {
                        System.out.print("Inserta el precio del primer libro: ");
                        precio1 = scanner.nextDouble();
                        if (precio1 < 0) {
                            System.out.println("El precio no puede ser negativo.");
                        }
                    } while (precio1 < 0);
                    
                    do {
                        System.out.print("Inserta el precio del segundo libro: ");
                        precio2 = scanner.nextDouble();
                        if (precio2 < 0) {
                            System.out.println("El precio no puede ser negativo.");
                        }
                    } while (precio2 < 0);
                    
                    double total = precio1 + precio2;
                    System.out.printf("Total: %.2f Euros%n", total);
                    
                    System.out.print("¿Quieres salir del programa? (SI / NO): ");
                    scanner.nextLine();
                    String respuesta = scanner.nextLine().trim().toUpperCase();
                    
                    if (respuesta.equals("SI")) {
                        System.out.println("Saliendo del programa.");
                        opcion = 3;
                    }
                case 2:
                	scanner.nextLine();
                    System.out.print("Inserta el nombre del libro: ");
                    String nombreLibro = scanner.nextLine().trim();
                    
                    if (nombreLibro.equalsIgnoreCase("Tiburon")) {
                        System.out.println("Ese libro está disponible.");
                    } else {
                        System.out.println("Ese libro no está disponible.");
                    }
                    
                    System.out.print("¿Quieres salir del programa? (SI / NO): ");
                    String respuestaStock = scanner.nextLine().trim().toUpperCase();
                    
                    if (respuestaStock.equals("SI")) {
                        System.out.println("Saliendo del programa.");
                        opcion = 3;
                    }
                    break;
            }
                    break;
                    
        } while (opcion != 3);
        
        scanner.close();
    }
}
