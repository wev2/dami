package ev2;

public class Libro extends Publicacion {
    private String isbn;
    private String premiado;

    public Libro(String fechaPublicacion, String titulo, String isbn, String premiado) {
        super(fechaPublicacion, titulo);
        this.isbn = isbn;
        this.premiado = premiado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPremiado() {
        return premiado;
    }

    public void setPremiado(String premiado) {
        this.premiado = premiado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getTitulo());
        System.out.println("Fecha de Publicación: " + getFechaPublicacion());
        System.out.println("ISBN: " + isbn);
        System.out.println("Premiado: " + premiado);
    }
}
