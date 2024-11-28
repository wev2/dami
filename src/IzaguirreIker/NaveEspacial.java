package examen;
import java.util.Scanner;

public class NaveEspacial {

	private String nombre;
	private int añoCreacion;
	private int añoLanzamiento;
	private int capacidad;
	private int tripulantesNecesarios;
	
	
	public NaveEspacial(String n, int ac, int al, int c, int tn) {
		this.nombre = n;
		this.añoCreacion= ac;
		this.añoLanzamiento=al;
		this.capacidad=c;
		this.tripulantesNecesarios= tn;
	}


	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", añoCreacion=" + añoCreacion + ", añoLanzamiento=" + añoLanzamiento
				+ ", capacidad=" + capacidad + ", tripulantesNecesarios=" + tripulantesNecesarios + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAñoCreacion() {
		return añoCreacion;
	}


	public void setAñoCreacion(int añoCreacion) {
		this.añoCreacion = añoCreacion;
	}


	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}


	public void setAñoLanzamiento(int añoLanzamiento) {
		this.añoLanzamiento = añoLanzamiento;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getTripulantesNecesarios() {
		return tripulantesNecesarios;
	}


	public void setTripulantesNecesarios(int tripulantesNecesarios) {
		this.tripulantesNecesarios = tripulantesNecesarios;
	}
	
	public int calcularAntiguedad(int anioActual) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el año en el que nos encontramos");
		anioActual=sc.nextInt();
		System.out.println("La antiguedad de la nave es de "+ (anioActual-añoCreacion));
		return anioActual;
		
	}
	
	public boolean admitePasajeros(int capacidad) {
		if(capacidad>tripulantesNecesarios) {
			int huecosRestantes= capacidad-tripulantesNecesarios;
			System.out.println("Quedan todavia por rellenar "+huecosRestantes);
			
		}
		return false;
		
	}
}
