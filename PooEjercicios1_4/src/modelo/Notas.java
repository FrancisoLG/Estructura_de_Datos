
package modelo;

import java.util.Scanner;

public class Notas {
    private double[] notas;

    public void cargarNotas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de notas: ");
        int n = sc.nextInt();
        notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }

    public int contarAprobados() {
        int contador = 0;
        for (double nota : notas) {
            if (nota >= 6) contador++;
        }
        return contador;
    }

    public int contarDesaprobados() {
        int contador = 0;
        for (double nota : notas) {
            if (nota < 6) contador++;
        }
        return contador;
    }
}
