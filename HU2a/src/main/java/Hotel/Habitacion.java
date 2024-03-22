/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author JOSEPH JIMENEZ
 */
public class Habitacion {
    private String tipo;
    private int capacidad;
    private boolean disponible;
    private boolean ocupada;

    public Habitacion(String tipo, int capacidad, boolean disponible) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.ocupada = !disponible; // La habitación está ocupada si no está disponible
    }

    // Getters y setters

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        if (disponible) {
            disponible = false;
            ocupada = true;
        } else {
            System.out.println("La habitación ya está ocupada.");
        }
    }

    public void liberar() {
        if (ocupada) {
            disponible = true;
            ocupada = false;
        } else {
            System.out.println("La habitación no está ocupada.");
        }
    }

    @Override
    public String toString() {
        String dispStr = disponible ? "Disponible" : "No disponible";
        String ocupStr = ocupada ? "Ocupada" : "No ocupada";
        return "Habitacion{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                ", disponibilidad=" + dispStr +
                ", ocupación=" + ocupStr +
                '}';
    }
}
