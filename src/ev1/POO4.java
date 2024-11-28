package ev1;

import java.util.Scanner;

public class POO4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System .in); 
		 int menu=0 ;
		 Cuentas a[] = new Cuentas [5];
		 
		 do {
			 menu=menu(teclado);
			 switch (menu) {
			 case 1:
				 introducir(teclado, a);
				 break;
			 case 2:
				 mostrar(teclado, a);
				 break;
			 case 3:
				
				 break;
			 case 4:
				 break;
			 case 5:
				 
				 break;
			 case 6:
				 break;
			 case 7:
				 
				 break;
			 case 8:
				 break;
			 case 9:
				 break;
			 case 10:
				 compactarEliminar(teclado, a);
				 break;
			 case 11:
				 System.out.println("Hasta la vista!");
				 break;
			 default: 
				 System.out.println("Opcion incorrecta");
				 menu=11;
				 break;
			 	}
		 }while(menu!=11);	 
		 teclado.close();
	}

	private static void compactarEliminar(Scanner teclado, Cuentas[] a) {
		// TODO Auto-generated method stub
		System.out.println("Cuentas actuales:");
	    for (Cuentas num : a) {
	        System.out.print(num + " ");
	    }
	    System.out.println();

	    System.out.print("Ingrese el número de la cuenta a eliminar (1-5): ");
	    int posicion = teclado.nextInt() - 1;

	    if (posicion < 0 || posicion >= a.length) {
	        System.out.println("Posición no válida.");
	        return;
	    }

	    for (int i = posicion; i < a.length - 1; i++) {
	        a[i] = a[i + 1];
	    }

	    a[a.length - 1] = null; 

	    System.out.println("Cuentas después de eliminar y compactar:");
	    for (Cuentas num : a) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
    }

	public static int menu(Scanner teclado) {
		 int menu;
		 System.out.println("1. Introducir cuenta/s.");
		 System.out.println("2. Muestra las cuentas introducidas");
		 System.out.println("3. Ingresar una cantidad a un titular concreto introducido por teclado (Llama al método ingresar y controla la posibilidad de que no exista el titular)");
		 System.out.println("4. Retirar de todas las cuentas introducidas, la comisión de 12€ (Llama al método retirar)");
		 System.out.println("5. Muestra la cuenta de mayor saldo.");
		 System.out.println("6. Muestras las cuentas que tengan saldo superior a uno introducido por teclado. Si no hay, mensaje indicándolo.");
		 System.out.println("7. Muestra la cuenta de un titular concreto. Controlar si no encuentra.");
		 System.out.println("8. Muestra las cuentas de los titulares que contengan un grupo de letras, introducido por teclado, en su atributo titular");
		 System.out.println("9. Ordena y muestra las cuentas según su saldo (de mayor a menor saldo).");
		 System.out.println("10. Salir");
		 menu = teclado.nextInt();
		 return menu;
	}

	public static int contar(Cuentas a[]) {
		boolean enc=false;
		for (int i = 0; i<a.length && !enc ;i++) {
			if (a[i]==null) {
				enc=true;
				return i;
			}
		}
		return -1;
	}
	
	public static void introducir(Scanner teclado, Cuentas a[]) {
		String respuesta="";
		int cant=contar(a);
		if (cant==-1) {
			System.out.println("Error. No puedes introducir más cuentas ");
		}else {
			for (int i = cant; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Cuentas c1=new Cuentas(respuesta);
				a[i]=c1;
				System.out.println("Quien es el titular de la cuenta?");
				a[i].setTitular(teclado.next());
				System.out.println("Cuanta es la cantidad de dinero en la cuenta?");
				a[i].setCantidad(teclado.nextDouble());
				
				do {
					System.out.print("Quiere añadir otra cuenta?: ");
					respuesta = teclado.next();
					
					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
	}

	public static void mostrar(Scanner teclado, Cuentas a[]) {
		int cantidad=contar(a);
		for (int i=0;i<cantidad;i++) {
			System.out.println(a[i].toString());
		}
	}

	
	

}
