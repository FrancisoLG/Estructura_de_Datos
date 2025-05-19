
package modelo;

import java.util.Scanner;

public class EmpresaCamiones {
    private Camion[] camiones = new Camion[30];

    public void cargarCamiones() {
        Scanner sc = new Scanner(System.in);
        int contadorTe = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Camión " + (i + 1));
            System.out.print("Patente: ");
            String patente = sc.nextLine();
            System.out.print("Chofer (Nombre y Apellido): ");
            String chofer = sc.nextLine();
            System.out.print("Tipo de carga (madera, yerba, té): ");
            String carga = sc.nextLine();
            System.out.print("Hora de egreso: ");
            String hora = sc.nextLine();

            camiones[i] = new Camion(patente, chofer, carga, hora);

            if (carga.equalsIgnoreCase("té")) {
                contadorTe++;
            }
        }

        System.out.println("\nCantidad de camiones con carga de té: " + contadorTe);
        for (Camion c : camiones) {
            c.mostrarDatos();
        }
    }
}
