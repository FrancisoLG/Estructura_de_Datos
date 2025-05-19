
package principal;

import modelo.Notas;

public class Main2 {
    public static void main(String[] args) {
        Notas notas = new Notas();
        notas.cargarNotas();
        System.out.println("Cantidad de aprobados: " + notas.contarAprobados());
        System.out.println("Cantidad de desaprobados: " + notas.contarDesaprobados());
    }
}
