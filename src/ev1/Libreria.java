package ev1;
import java.util.Scanner;

public class Libreria {
    static String[] titulos = {
        "Nada", "Tímidamente de la oscuridad a la luz", "Pájaros a golpes", 
        "Caperucita Roja", "12 cuentos clásicos", "Pepe y Mila", "Enojaos", 
        "En casa vacía", "123", "Día Negro", "El Hobbit", "Calle Judía", 
        null, null, null, null, null, null, null, null
    };

    static int[] precios = { 
        15, 12, 15, 25, 19, 17, 25, 13, 11, 18, 25, 35, 
        0, 0, 0, 0, 0, 0, 0, 0 
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1.- Mostrar el título de todos los libros.");
            System.out.println("2.- Mostrar el título y el precio de todos los libros.");
            System.out.println("3.- Mostrar el precio de un libro.");
            System.out.println("4.- Introducir un nuevo libro.");
            System.out.println("5.- Eliminar un libro.");
            System.out.println("6.- Modificar el precio de un libro.");
            System.out.println("7.- Modificar el título de un libro.");
            System.out.println("8.- Salir del programa.");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Títulos de los libros:");
                    for (String titulo : titulos) {
                        if (titulo != null) {
                            System.out.println(titulo);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Títulos y precios de los libros:");
                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] != null) {
                            System.out.println("El precio del libro " + titulos[i] + 
                                               " es " + precios[i] + " euros.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("¿Cuál es el título del libro? ");
                    String tituloPrecio = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] != null && titulos[i].equalsIgnoreCase(tituloPrecio)) {
                            System.out.println("El precio del libro " + titulos[i] + 
                                               " es " + precios[i] + " euros.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El libro no se encuentra.");
                    }
                    break;

                case 4:
                    boolean espacioLibre = false;

                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] == null) {
                            System.out.print("¿Cuál es el título del libro? ");
                            titulos[i] = scanner.nextLine();
                            System.out.print("¿Cuál es el precio? ");
                            precios[i] = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer
                            System.out.println("El libro ha sido guardado.");
                            espacioLibre = true;
                            break;
                        }
                    }

                    if (!espacioLibre) {
                        System.out.println("Tienes muchos libros en la tienda, elimina un libro.");
                    }
                    break;

                case 5:
                    System.out.print("¿Cuál es el título del libro? ");
                    String tituloEliminar = scanner.nextLine();

                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] != null && titulos[i].equalsIgnoreCase(tituloEliminar)) {
                            titulos[i] = null;
                            precios[i] = 0;
                            System.out.println("El libro ha sido eliminado.");
                            compactarArrays();
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.print("¿Cuál es el título del libro? ");
                    String tituloModificarPrecio = scanner.nextLine();
                    encontrado = false;

                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] != null && titulos[i].equalsIgnoreCase(tituloModificarPrecio)) {
                            System.out.println("El precio del libro " + titulos[i] + 
                                               " es " + precios[i] + " euros.");
                            System.out.print("¿Cuál es el nuevo precio? ");
                            precios[i] = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer
                            System.out.println("El precio ha sido cambiado.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El libro no se encuentra.");
                    }
                    break;

                case 7:
                    System.out.print("¿Cuál es el título del libro? ");
                    String tituloModificarTitulo = scanner.nextLine();
                    encontrado = false;

                    for (int i = 0; i < titulos.length; i++) {
                        if (titulos[i] != null && titulos[i].equalsIgnoreCase(tituloModificarTitulo)) {
                            System.out.print("¿Cuál es el nuevo título del libro? ");
                            String nuevoTitulo = scanner.nextLine();
                            titulos[i] = nuevoTitulo;
                            System.out.println("El título ha sido modificado.");
                            System.out.println("El nuevo título del libro es " + titulos[i] + ".");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El libro no se encuentra.");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            if (opcion != 8) {
                System.out.print("¿Quieres continuar en el programa? SI / NO: ");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("SI")) {
                    opcion = 8; // Salir
                }
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void compactarArrays() {
        for (int i = 0; i < titulos.length - 1; i++) {
            if (titulos[i] == null && titulos[i + 1] != null) {
                titulos[i] = titulos[i + 1];
                precios[i] = precios[i + 1];
                titulos[i + 1] = null;
                precios[i + 1] = 0;
            }
        }
    }
}