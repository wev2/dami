package ev1;
public class Cuentas {
    private String titular;
    private double cantidad;

    // Constructor que recibe solo el titular, cantidad por defecto en 0.0
    public Cuentas(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor que recibe el titular y la cantidad inicial
    public Cuentas(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos getter y setter para titular y cantidad
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString para mostrar información de la cuenta
    @Override
    public String toString() {
        return "Cuenta{" +
               "titular='" + titular + '\'' +
               ", cantidad=" + cantidad +
               '}';
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }
}
