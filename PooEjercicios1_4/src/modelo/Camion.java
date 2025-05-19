
package modelo;

public class Camion {
    private String patente;
    private String chofer;
    private String carga;
    private String hora;

    public Camion(String patente, String chofer, String carga, String hora) {
        this.patente = patente;
        this.chofer = chofer;
        this.carga = carga;
        this.hora = hora;
    }

    public String getCarga() {
        return carga;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + chofer);
        System.out.println("Carga: " + carga);
        System.out.println("Hora de egreso: " + hora);
        System.out.println("---------------------------");
    }
}
