package ev2;

import java.time.LocalDateTime;

public class Empleade {
    private static final String NOMBRE_EMPRESA = "Electrica S.A.";
    private static final double SUELDO_BASE = 1000.0;

    private String dni;
    private String nombre;
    private int mesEntrada;
    private int anioEntrada;
    private double porcentajeIncremento;

    public Empleade(String dni, String nombre, int mesEntrada, int anioEntrada, double porcentajeIncremento) {
        this.dni = dni;
        this.nombre = nombre;
        this.mesEntrada = mesEntrada;
        this.anioEntrada = anioEntrada;
        this.porcentajeIncremento = porcentajeIncremento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMesEntrada() {
        return mesEntrada;
    }

    public int getAnioEntrada() {
        return anioEntrada;
    }

    public double getPorcentajeIncremento() {
        return porcentajeIncremento;
    }

    public static String getNombreEmpresa() {
        return NOMBRE_EMPRESA;
    }

    public static double getSueldoBase() {
        return SUELDO_BASE;
    }

    public double calcularSueldoFinal() {
    	LocalDateTime hoy = LocalDateTime.now();
    	int anioActual = hoy.getYear();
        double sueldoFinal = SUELDO_BASE + (SUELDO_BASE * (porcentajeIncremento / 100));
        int antiguedad = anioActual - anioEntrada;
        if (antiguedad >= 6) {
            sueldoFinal += 100;
        }
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Mes Entrada=" + mesEntrada +
                ", Año Entrada=" + anioEntrada +
                ", Porcentaje Incremento=" + porcentajeIncremento +
                ", Sueldo Final=" + calcularSueldoFinal() +
                '}';
    }
}
