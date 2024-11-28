package utilidades;

public class LineaListado implements Comparable <LineaListado> {
	// Atributos
	private String deporte;
	private int numCurs;
	private int numPers;
	private float precioTotal;
	
	// Constructores
	public LineaListado() {
		super();
	}
	public LineaListado(String deporte, int numCurs, int numPers, float precioTotal) {
		super();
		this.deporte = deporte;
		this.numCurs = numCurs;
		this.numPers = numPers;
		this.precioTotal = precioTotal;
	}
	
	// Getters y Setters
	public String getDeporte() {
		return deporte;
	}


	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}


	public int getNumCurs() {
		return numCurs;
	}


	public void setNumCurs(int numCurs) {
		this.numCurs = numCurs;
	}


	public int getNumPers() {
		return numPers;
	}


	public void setNumPers(int numPers) {
		this.numPers = numPers;
	}


	public float getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	// Metodos
	public void getDatos() {
		System.out.println(this.deporte + "\t\t" + this.numCurs + "\t\t" + this.numPers + "\t\t\t\t" + (this.precioTotal/this.numCurs));
	}
	
	@Override
	public int compareTo(LineaListado o) {
		return this.deporte.compareTo(o.getDeporte());
	}

}