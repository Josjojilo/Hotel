/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author JOSEPH JIMENEZ
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lectura lectura = new Lectura();
        Hotel hotel = new Hotel();

        System.out.println("Ingrese el número de clientes a registrar:");
        int numClientes = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        for (int i = 0; i < numClientes; i++) {
            String nombre = lectura.leerNombreCliente(i + 1);
            String identificacion = lectura.leerIdentificacionCliente(i + 1);

            Cliente cliente = new Cliente(nombre, identificacion);
            hotel.registrarCliente(cliente);
        }

        System.out.println("\nClientes registrados en el hotel:");
        for (Cliente cliente : hotel.getClientesRegistrados()) {
            System.out.println(cliente);
        }
    }
}
