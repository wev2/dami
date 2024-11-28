package ev2;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String email;
    private String nombre;
    private String nombreDepartamento;
    private List<Publicacion> publicaciones;

    public Profesor(String email, String nombre, String nombreDepartamento) {
        this.email = email;
        this.nombre = nombre;
        this.nombreDepartamento = nombreDepartamento;
        this.publicaciones = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }
}