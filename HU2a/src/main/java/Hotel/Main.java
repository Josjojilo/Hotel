
package Hotel;

/**
 *
 * @author JOSEPH JIMENEZ
 */
import java.util.List;

// Clase principal Main
public class Main {
    public static void main(String[] args) {
        Lectura lectura = new Lectura();
        List<Habitacion> habitaciones = lectura.agregarHabitaciones();
        
        // Imprimir información de las habitaciones
        System.out.println("Información de las habitaciones:");
        for (int i = 0; i < habitaciones.size(); i++) {
            System.out.println("Habitación " + (i + 1) + ":");
            System.out.println(habitaciones.get(i));
            System.out.println(); // Línea en blanco para separar las habitaciones
        }
    }
}
