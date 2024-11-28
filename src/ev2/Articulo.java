package ev2;

public class Articulo extends Publicacion {
    private String medio;

    public Articulo(String fechaPublicacion, String titulo, String medio) {
        super(fechaPublicacion, titulo);
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Artículo: " + getTitulo());
        System.out.println("Fecha de Publicación: " + getFechaPublicacion());
        System.out.println("Medio: " + medio);
    }
}
