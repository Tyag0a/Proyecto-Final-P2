package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Producto;

public interface ICrudpersona {
    String crearPersona(String nombre, String apellido, String cedula, String direccion) throws Exception;
    String eliminarPersona(String nombre, String apellido, String cedula, String direccion) throws Exception;
    String modificarPersona(String nombre, String apellido, String cedula, String direccion) throws Exception;
    Persona getPersona(String nombre, String apellido, String cedula, String direccion) throws Exception;
}
