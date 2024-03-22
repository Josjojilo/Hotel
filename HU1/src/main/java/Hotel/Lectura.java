/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author JOSEPH JIMENEZ
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lectura {
    private final Scanner scanner;
    private final Set<String> identificaciones;

    public Lectura() {
        this.scanner = new Scanner(System.in);
        this.identificaciones = new HashSet<>();
    }

    public String leerNombreCliente(int numCliente) {
        String nombre;
        do {
            System.out.println("Ingrese el nombre del cliente " + numCliente + ":");
            nombre = scanner.nextLine().trim();
        } while (nombre.isEmpty());
        return nombre;
    }

    public String leerIdentificacionCliente(int numCliente) {
        String identificacion;
        do {
            System.out.println("Ingrese la identificación del cliente   " + numCliente + "(tenga en cuenta que solo se admite los numeros positivos"
                    + " enteros y que ademas,2 o mas clientes no pueden tener el mismo id):");
            identificacion = scanner.nextLine().trim();
        } while (!esNumero(identificacion) || identificacion.isEmpty() || identificaciones.contains(identificacion));
        
        identificaciones.add(identificacion);
        return identificacion;
    }

    private boolean esNumero(String str) {
        return str.matches("\\d+");
    }
}

