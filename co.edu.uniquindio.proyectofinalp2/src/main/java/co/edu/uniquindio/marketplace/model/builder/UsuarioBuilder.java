package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Usuario;

public class UsuarioBuilder {
    private String nombreUsuario;
    private String contraseña;
    private Persona personaAsociada;

    public UsuarioBuilder setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public UsuarioBuilder setContraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    public UsuarioBuilder setPersonaAsociada(Persona personaAsociada) {
        this.personaAsociada = personaAsociada;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombreUsuario, contraseña, personaAsociada);
    }
}
