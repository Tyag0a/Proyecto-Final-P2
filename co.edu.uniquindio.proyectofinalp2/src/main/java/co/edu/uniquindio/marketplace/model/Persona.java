package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.PersonaBuilder;

public class Persona {
    String nombre;
    String apellido;
    String cedula;
    String direccion;
    Usuario usuarioAsociado;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuarioAsociado() { return usuarioAsociado; }

    public void setUsuarioAsociado(Usuario usuarioAsociado) { this.usuarioAsociado = usuarioAsociado; }


    public Persona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuarioAsociado = new Usuario();
    }

    public static PersonaBuilder<?> builder() {
        return new PersonaBuilder<>();
    }
}
