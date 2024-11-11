package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Usuario;

public interface ICrudUsuario {
    String crearUsuario(String nombreUsuario, String contraseña, Persona personaAsociada) throws Exception;
    String eliminarUsuaria(String nombreUsuario, String contraseña) throws Exception;
    String modificarUsuario(String nombreUsuario, String contraseña) throws Exception;
    Usuario getUsuario() throws Exception;
}
