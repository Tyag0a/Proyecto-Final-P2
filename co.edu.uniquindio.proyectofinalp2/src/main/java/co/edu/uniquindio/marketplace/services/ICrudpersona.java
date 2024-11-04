package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Usuario;

public interface ICrudpersona {
    String crearPersona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioaAsociado) throws Exception;
    String eliminarPersona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado) throws Exception;
    String modificarPersona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado) throws Exception;
    Persona getPersona(String nombre, String apellido, String cedula, String direccion) throws Exception;
}
