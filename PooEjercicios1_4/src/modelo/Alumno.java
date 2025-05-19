
package modelo;

import java.util.Scanner;

public class Alumno {
    private double[] notas;

    public void cargarNotas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();
        notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }

    public double obtenerNotaMaxima() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) max = nota;
        }
        return max;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) suma += nota;
        return suma / notas.length;
    }
}
