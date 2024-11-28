package ev1;

public class Tren {
	private String tipo;
	private String referencia;
	private int asientosocupados;
	private double kilometrosrecorridos;
	private int duracion;
	
	static final int CAPACIDAD_MAXIMA = 400;

	public Tren(String tipo) {
		if (esTipoValido(tipo)) {
			this.tipo = tipo;
		} else {
			this.tipo = "Indefinido";
		}
	}

	public Tren(String tipo, String otroAtributo) {
		if (esTipoValido(tipo)) {
			this.tipo = tipo;
		} else {
			this.tipo = "Indefinido";
		}
	}

	public Tren(String referencia, int asientosocupados) {
		this.referencia = referencia;
		this.asientosocupados = asientosocupados;
	}

	public Tren(double kilometrosrecorridos, int duracion) {
		this.kilometrosrecorridos = kilometrosrecorridos;
		this.duracion = duracion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAsientosocupados() {
		return asientosocupados;
	}

	public void setAsientosocupados(int asientosocupados) {
		this.asientosocupados = asientosocupados;
	}

	public double getKilometrosrecorridos() {
		return kilometrosrecorridos;
	}

	public void setKilometrosrecorridos(double kilometrosrecorridos) {
		this.kilometrosrecorridos = kilometrosrecorridos;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private boolean esTipoValido(String tipo) {
		return tipo.equals("Cercanias") || tipo.equals("Ave") || tipo.equals("Mercancias");
	}

	public boolean trenLLeno() {
		return asientosocupados >= CAPACIDAD_MAXIMA;
	}

	public double obtenerVelocidadTotal() {
		if (duracion > 0) {
			double duracionEnHoras = duracion / 60.0;
			return kilometrosrecorridos / duracionEnHoras;
		} else {
			return 0;
		}
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosocupados=" + asientosocupados
				+ ", kilometrosrecorridos=" + kilometrosrecorridos + ", duracion=" + duracion + "]";
	}
}