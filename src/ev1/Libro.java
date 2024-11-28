package ev1;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int ejemplaresVendidos;
    private double precio;
    
    static final int CAPACIDAD_MAXIMA = 250;

    public Libro(String i, String t, String a, int e, double p) {
        this.ISBN = i;
        this.titulo = t;
        this.autor = a;
        this.ejemplaresVendidos = e;
        this.precio = p;
    }

    public Libro(String i, String t, String a) {
        this.ISBN = i;
        this.titulo = t;
        this.autor = a;
        this.ejemplaresVendidos = 0;
        this.precio = 0.0;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresVendidos() {
        return ejemplaresVendidos;
    }

    public void setEjemplaresVendidos(int ejemplaresVendidos) {
        this.ejemplaresVendidos = ejemplaresVendidos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El libro con el título \"" + titulo + "\" e ISBN \"" + ISBN + "\", creado por el autor \"" + autor +
                "\" ha vendido " + ejemplaresVendidos + " ejemplares a un precio de " + precio + " €.";
    }

    public boolean esSuperVentas() {
        return ejemplaresVendidos > 18000;
    }

    public double obtenerBeneficioTotal() {
        double beneficio = precio * ejemplaresVendidos;
        return beneficio * 1.04;
    }
}
