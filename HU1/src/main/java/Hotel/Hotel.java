/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH JIMENEZ
 */
import java.util.ArrayList;
import java.util.List;

// Clase Hotel
public class Hotel {
    private final List<Cliente> clientesRegistrados;

    public Hotel() {
        this.clientesRegistrados = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }
}
