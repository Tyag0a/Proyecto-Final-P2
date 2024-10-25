package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Vendedor;

public interface ICrudVendedor {
    String crearVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception;
    String eliminarVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception;
    String modificarVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception;
    Vendedor getVendedor() throws Exception;
}
