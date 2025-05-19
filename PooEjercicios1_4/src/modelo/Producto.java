
package modelo;

import java.util.Scanner;

public class Producto {
    private int[] cantidades;
    private double[] costos;

    public void cargarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();
        cantidades = new int[n];
        costos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
            System.out.print("Costo unitario del producto " + (i + 1) + ": ");
            costos[i] = sc.nextDouble();
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (int i = 0; i < cantidades.length; i++) {
            total += cantidades[i] * costos[i];
        }
        return total;
    }

    public void mostrarProductosMayoresA1000() {
        System.out.println("Productos cuyo valor total supera los $1000:");
        for (int i = 0; i < cantidades.length; i++) {
            double subtotal = cantidades[i] * costos[i];
            if (subtotal > 1000) {
                System.out.println("Producto " + (i + 1) + " - Total: $" + subtotal);
            }
        }
    }
}
