
package modelo;

import java.util.Scanner;

public class EmpresaInternet {
    private Cliente[] clientes = new Cliente[5];

    public void cargarClientes() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese DNI del cliente " + (i + 1) + ": ");
            String dni = sc.nextLine();
            System.out.println("Tipo de servicio: 1) 30 megas ($750), 2) 50 megas ($1100), 3) 100 megas ($1500 con 5% desc): ");
            int tipo = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            clientes[i] = new Cliente(dni, tipo);
        }
    }

    public void mostrarFacturas() {
        for (Cliente c : clientes) {
            c.mostrarFactura();
        }
    }
}
