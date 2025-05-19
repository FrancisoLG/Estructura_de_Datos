
package modelo;

import java.util.Scanner;

public class Carrera {
    private Competidor[] competidores = new Competidor[12];

    public void cargarTiempos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.print("Número de vehículo del competidor " + (i + 1) + ": ");
            int numero = sc.nextInt();
            System.out.print("Tiempo (en segundos): ");
            double tiempo = sc.nextDouble();
            competidores[i] = new Competidor(numero, tiempo);
        }
    }

    public void mostrarGanador() {
        Competidor ganador = competidores[0];
        for (Competidor c : competidores) {
            if (c.getTiempo() < ganador.getTiempo()) {
                ganador = c;
            }
        }
        System.out.println("Ganador - Vehículo: " + ganador.getNumeroVehiculo() + " | Tiempo: " + ganador.getTiempo() + " seg.");
    }
}
