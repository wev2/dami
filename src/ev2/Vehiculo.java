package ev2;

public class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color="negro";    
	protected int añosantigüedad;
	protected int precio;
	protected static int contador=0;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public int getAñosantigüedad() {
		return añosantigüedad;
	}
	public void setAñosantigüedad(int añosantigüedad) {
		this.añosantigüedad = añosantigüedad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Vehiculo.contador = contador;
	}

	public Vehiculo(String matricula, String marca, String modelo, int añosantigüedad, int precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.añosantigüedad = añosantigüedad;
		this.precio = precio;
		contador++;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", añosantigüedad=" + añosantigüedad + ", precio=" + precio + "]";
	}


}
