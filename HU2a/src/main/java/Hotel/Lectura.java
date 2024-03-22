/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author JOSEPH JIMENEZ
 */
import Hotel.Habitacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lectura {
    private Scanner scanner;

    public Lectura() {
        this.scanner = new Scanner(System.in);
    }

    public int leerEntero(String mensaje) {
        int valor;
        while (true) {
            try {
                System.out.println(mensaje);
                valor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
            }
        }
        return valor;
    }

    public String leerTipoHabitacion(int numHabitacion) {
        while (true) {
            System.out.println("Ingrese el tipo de la habitación " + numHabitacion + " ('sencilla', 'doble', 'matrimonial'):");
            String tipo = scanner.nextLine().trim().toLowerCase();
            if (tipo.equals("sencilla") || tipo.equals("doble") || tipo.equals("matrimonial")) {
                return tipo;
            } else {
                System.out.println("Error: El tipo de habitación debe ser 'sencilla', 'doble' o 'matrimonial'.");
            }
        }
    }

    public boolean leerDisponibilidad(int numHabitacion) {
        while (true) {
            System.out.println("¿La habitación " + numHabitacion + " está disponible? (si/no):");
            String disponibilidad = scanner.nextLine().trim().toLowerCase();
            if (disponibilidad.equals("si")) {
                return true;
            } else if (disponibilidad.equals("no")) {
                return false;
            } else {
                System.out.println("Error: Debes ingresar 'si' o 'no'.");
            }
        }
    }

    public Habitacion agregarHabitacion(int numHabitacion) {
        String tipo = leerTipoHabitacion(numHabitacion);
        int capacidad = leerEntero("Ingrese la capacidad de la habitación " + numHabitacion + ":");
        boolean disponible = leerDisponibilidad(numHabitacion);
        return new Habitacion(tipo, capacidad, disponible);
    }

    public List<Habitacion> agregarHabitaciones() {
        List<Habitacion> habitaciones = new ArrayList<>();
        int numHabitaciones = leerEntero("Ingrese el número de habitaciones:");
        for (int i = 0; i < numHabitaciones; i++) {
            habitaciones.add(agregarHabitacion(i + 1));
        }
        return habitaciones;
    }
}
