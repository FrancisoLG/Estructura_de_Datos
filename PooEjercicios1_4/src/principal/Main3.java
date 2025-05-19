
package principal;

import modelo.Producto;

public class Main3 {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.cargarDatos();
        System.out.println("Precio total: $" + p.calcularPrecioTotal());
        p.mostrarProductosMayoresA1000();
    }
}
