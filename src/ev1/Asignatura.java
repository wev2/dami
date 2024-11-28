package ev1;

public class Asignatura {
	
    private String nombre;
    private String curso;
    private int numeroAlumnosMatriculados;
    private int numeroSuspensos;

    public Asignatura(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
        this.numeroAlumnosMatriculados = 0;
        this.numeroSuspensos = 0;
    }

    public Asignatura(String nombre, String curso, int numeroAlumnosMatriculados, int numeroSuspensos) {
        this.nombre = nombre;
        this.curso = curso;
        this.numeroAlumnosMatriculados = numeroAlumnosMatriculados;
        this.numeroSuspensos = numeroSuspensos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getNumeroAlumnosMatriculados() {
        return numeroAlumnosMatriculados;
    }

    public int getNumeroSuspensos() {
        return numeroSuspensos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNumeroAlumnosMatriculados(int numeroAlumnosMatriculados) {
        this.numeroAlumnosMatriculados = numeroAlumnosMatriculados;
    }

    public void setNumeroSuspensos(int numeroSuspensos) {
        this.numeroSuspensos = numeroSuspensos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", numeroAlumnosMatriculados=" + numeroAlumnosMatriculados +
                ", numeroSuspensos=" + numeroSuspensos +
                '}';
    }

    public double porcentajeAprobados() {
        if (numeroAlumnosMatriculados == 0) {
            return 0.0;
        }
        int numeroAprobados = obtenerNumeroAprobados();
        return (numeroAprobados * 100.0) / numeroAlumnosMatriculados;
    }

    public int obtenerNumeroAprobados() {
        return numeroAlumnosMatriculados - numeroSuspensos;
    }
}
