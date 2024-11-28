package ev2;

public class Jefe extends Empleade {
    private static final double PLUS_JEFE = 250.0;
    private String departamento;

    public Jefe(String dni, String nombre, int mesEntrada, int anioEntrada, double porcentajeIncremento, String departamento) {
        super(dni, nombre, mesEntrada, anioEntrada, porcentajeIncremento);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public static double getPlusJefe() {
        return PLUS_JEFE;
    }

    public double calcularSueldoFinal(int anioActual) {
        return super.calcularSueldoFinal(anioActual) + PLUS_JEFE;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "DNI='" + getDni() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", Mes Entrada=" + getMesEntrada() +
                ", Año Entrada=" + getAnioEntrada() +
                ", Porcentaje Incremento=" + getPorcentajeIncremento() +
                ", Departamento='" + departamento + '\'' +
                ", Sueldo Final=" + calcularSueldoFinal(2024) +
                '}';
    }
}
