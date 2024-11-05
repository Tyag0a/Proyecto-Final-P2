package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.model.Vendedor;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor) throws Exception;
    String eliminarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception;
    String modificarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception;
    Vendedor getVendedor() throws Exception;
}
