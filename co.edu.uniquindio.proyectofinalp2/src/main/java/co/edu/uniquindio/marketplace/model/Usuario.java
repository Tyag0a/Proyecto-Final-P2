package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.UsuarioBuilder;

public class Usuario {
    public String getContraseña() {
        return contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Persona getPersonaAsociada() {return personaAsociada;}

    public void setPersonaAsociada(Persona personaAsociada) { this.personaAsociada = personaAsociada;}

    public String nombreUsuario;
    private String contraseña;
    Persona personaAsociada;

    public Usuario() {

    }

    public Usuario(String nombreUsuario, String contraseña,Persona personaAsociada) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.personaAsociada = personaAsociada;
    }

    public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
