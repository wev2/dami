package ev2;

public class Coche extends Vehiculo {

	public Coche(String matricula, String marca, String modelo, int añosantigüedad, int precio, boolean descapotable) {
		super(matricula, marca, modelo, añosantigüedad, precio);
		//descapotable=false;
	}

	private boolean descapotable;

	public boolean getDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Coche [descapotable=" + descapotable + "]";
	}

}
