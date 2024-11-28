package ev1;
import java.util.Scanner;

public class GestionarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String contrasena;

        
        do {
            System.out.print("Introduce tu usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Introduce tu contraseña: ");
            contrasena = scanner.nextLine();

          
            if (contrasena.toLowerCase().indexOf('e') != -1) {
                System.out.println("ERROR, en la contraseña no puede aparecer la letra e. Introduce de nuevo, por favor:");
            } else {
                break;
            }
        } while (true);


        System.out.println("Menú:");
        System.out.println("1.- Introducir notas");
        System.out.println("2.- Salir del programa");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce el apellido del alumno: ");
            String apellido = scanner.nextLine();

            
            double examen1, examen2, examen3, ultimoExamen, trabajo;
            
            do {
                System.out.print("Introduce la nota del primer examen (0-10): ");
                examen1 = scanner.nextDouble();
            } while (examen1 < 0 || examen1 > 10);

            do {
                System.out.print("Introduce la nota del segundo examen (0-10): ");
                examen2 = scanner.nextDouble();
            } while (examen2 < 0 || examen2 > 10);

            do {
                System.out.print("Introduce la nota del tercer examen (0-10): ");
                examen3 = scanner.nextDouble();
            } while (examen3 < 0 || examen3 > 10);

            do {
                System.out.print("Introduce la nota del último examen (0-10): ");
                ultimoExamen = scanner.nextDouble();
            } while (ultimoExamen < 0 || ultimoExamen > 10);

            do {
                System.out.print("Introduce la nota del trabajo (0-10): ");
                trabajo = scanner.nextDouble();
            } while (trabajo < 0 || trabajo > 10);

            
            double mediaParciales = (examen1 + examen2 + examen3) / 3;
            
            
            double notaFinal = (mediaParciales * 0.55) + (ultimoExamen * 0.30) + (trabajo * 0.15);

            
            System.out.printf("La nota final del alumno %s %s es %.1f, ", nombre, apellido, notaFinal);
            if (notaFinal < 5) {
                System.out.println("SUSPENSO.");
            } else if (notaFinal < 6) {
                System.out.println("SUFICIENTE.");
            } else if (notaFinal < 7) {
                System.out.println("BIEN.");
            } else if (notaFinal < 9) {
                System.out.println("NOTABLE.");
            } else {
                System.out.println("SOBRESALIENTE.");
            }
        } else if (opcion == 2) {
            System.out.println("Saliendo del programa.");

            
        }

        scanner.close();
    }
}
