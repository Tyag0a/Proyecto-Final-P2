package co.edu.uniquindio.marketplace.mapping.dto;

import co.edu.uniquindio.marketplace.model.Persona;

public record UsuarioDto(String nombreUsuario, String contraseña, Persona personaAsociada) {

    public String contraseña() {
        return contraseña;
    }

    @Override
    public String nombreUsuario() {
        return nombreUsuario;
    }

}
