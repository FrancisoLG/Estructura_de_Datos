
package principal;

import modelo.Carrera;

public class Main6 {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.cargarTiempos();
        carrera.mostrarGanador();
    }
}
