
package modelo;

public class Persona {
    private int dni;
    private int edad;
    private char sexo;

    public Persona(int dni, int edad, char sexo) {
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
}
