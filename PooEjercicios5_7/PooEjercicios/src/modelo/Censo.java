
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Censo {
    private ArrayList<Persona> personas = new ArrayList<>();

    public void cargarDatos() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese DNI (0 para finalizar): ");
            int dni = sc.nextInt();
            if (dni == 0) break;
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            personas.add(new Persona(dni, edad, sexo));
        }
    }

    public void procesarDatos() {
        int total = personas.size();
        int hombres = 0;
        int mujeres = 0;
        int varonesEdadActiva = 0;
        Persona mayor = personas.get(0);

        for (Persona p : personas) {
            if (p.getSexo() == 'M') {
                hombres++;
                if (p.getEdad() >= 16 && p.getEdad() <= 65) varonesEdadActiva++;
            } else if (p.getSexo() == 'F') {
                mujeres++;
            }
            if (p.getEdad() > mayor.getEdad()) {
                mayor = p;
            }
        }

        System.out.println("Total censados: " + total);
        System.out.println("Cantidad de varones: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
        if (hombres > 0) {
            double porcentaje = (varonesEdadActiva * 100.0) / hombres;
            System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentaje + "%");
        }
        System.out.println("Persona de mayor edad - DNI: " + mayor.getDni() + ", Edad: " + mayor.getEdad() + ", Sexo: " + mayor.getSexo());
    }
}
