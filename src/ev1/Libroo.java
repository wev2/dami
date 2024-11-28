package ev1;

public class Libroo {

	private String isbn;
	private String nombre;
	private String autor;
	private int ejemplares;
	private int precio;
	
	public Libroo() {
		this.isbn = "";
		this.nombre = "";
		this.autor = "";
		this.ejemplares = 0;
		this.precio = 0;
	}
	
	public Libroo(String isbn, String n, String a, int e, int p) {
		this.isbn = isbn;
		this.nombre = n;
		this.autor = a;
		this.ejemplares = e;
		this.precio = p;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getVendidos() {
		return ejemplares;
	}

	public void setVendidos(int vendidos) {
		this.ejemplares = vendidos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", nombre=" + nombre + ", autor=" + autor + ", vendidos=" + ejemplares
				+ ", precio=" + precio + "]";
	}
	
	public boolean esSuperVentas() {
		boolean esSuper=false;
		
		if(this.ejemplares>18000) {
			esSuper=true;
		}
		
		return esSuper;
	}
	
	public double obtenerBeneficioTotal() {	
				
		return (this.precio*this.ejemplares)+(((this.precio*this.ejemplares)*0.04));
	}
	
	
	
	
}
