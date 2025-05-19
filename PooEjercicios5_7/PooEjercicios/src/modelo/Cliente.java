
package modelo;

public class Cliente {
    private String dni;
    private int tipoServicio;

    public Cliente(String dni, int tipoServicio) {
        this.dni = dni;
        this.tipoServicio = tipoServicio;
    }

    public double calcularMonto() {
        switch (tipoServicio) {
            case 1:
                return 750;
            case 2:
                return 1100;
            case 3:
                return 1500 * 0.95;
            default:
                return 0;
        }
    }

    public void mostrarFactura() {
        System.out.println("DNI: " + dni + " | Tipo de servicio: " + tipoServicio + " | Monto a pagar: $" + calcularMonto());
    }
}
