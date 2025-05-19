
package principal;

import modelo.Alumno;

public class Main1 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.cargarNotas();
        System.out.println("Nota más alta: " + alumno.obtenerNotaMaxima());
        System.out.println("Promedio: " + alumno.calcularPromedio());
    }
}
