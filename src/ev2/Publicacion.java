package ev2;

import java.time.LocalDate;

public abstract class Publicacion {
    private String fechaPublicacion;
    private String titulo;

    public Publicacion(String fechaPublicacion, String titulo) {
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void mostrarDetalles();
}
