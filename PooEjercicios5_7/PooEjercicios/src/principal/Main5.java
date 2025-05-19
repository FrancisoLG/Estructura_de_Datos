
package principal;

import modelo.EmpresaInternet;

public class Main5 {
    public static void main(String[] args) {
        EmpresaInternet empresa = new EmpresaInternet();
        empresa.cargarClientes();
        empresa.mostrarFacturas();
    }
}
