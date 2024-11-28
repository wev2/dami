package ev1;

import java.util.Scanner;

public class GestionPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[10];
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n----------Menu----------");
            System.out.println("1. Introducir las personas");
            System.out.println("2. Muestra la persona de mayor edad");
            System.out.println("3. Muestra la información de una persona (por DNI)");
            System.out.println("4. Muestra la información de todas las personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    introducirPersonas(scanner, personas);
                    break;
                case 2:
                    mostrarPersonaMayor(personas);
                    break;
                case 3:
                    mostrarPersonaPorDNI(scanner, personas);
                    break;
                case 4:
                    mostrarTodasLasPersonas(personas);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    public static void introducirPersonas(Scanner scanner, Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nIntroduciendo datos para la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            personas[i] = new Persona(nombre, edad, dni);
        }
    }

    public static void mostrarPersonaMayor(Persona[] personas) {
        Persona personaMayor = null;
        for (Persona persona : personas) {
            if (persona != null && (personaMayor == null || persona.getEdad() > personaMayor.getEdad())) {
                personaMayor = persona;
            }
        }

        if (personaMayor != null) {
            System.out.println("\nLa persona de mayor edad es:");
            personaMayor.mostrar();
        } else {
            System.out.println("No hay personas registradas.");
        }
    }

    public static void mostrarPersonaPorDNI(Scanner scanner, Persona[] personas) {
        System.out.print("Ingrese el DNI de la persona: ");
        String dniBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Persona persona : personas) {
            if (persona != null && persona.getDni().equals(dniBuscado)) {
                persona.mostrar();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Persona con DNI " + dniBuscado + " no encontrada.");
        }
    }

    public static void mostrarTodasLasPersonas(Persona[] personas) {
        System.out.println("\nInformación de todas las personas:");
        boolean hayPersonas = false;

        for (Persona persona : personas) {
            if (persona != null) {
                persona.mostrar();
                System.out.println("---------------------");
                hayPersonas = true;
            }
        }

        if (!hayPersonas) {
            System.out.println("No hay personas registradas.");
        }
    }
}