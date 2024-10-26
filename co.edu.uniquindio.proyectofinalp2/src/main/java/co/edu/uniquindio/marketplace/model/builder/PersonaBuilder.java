package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Usuario;

public class PersonaBuilder<T extends PersonaBuilder<T>> {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Usuario usuarioAsociado;

    public T setNombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T setApellido(String apellido) {
        this.apellido = apellido;
        return self();
    }

    public T setCedula(String cedula) {
        this.cedula = cedula;
        return self();
    }

    public T setDireccion(String direccion) {
        this.direccion = direccion;
        return self();
    }

    public T setUsuarioAsociado(Usuario usuarioAsociado) {
        this.usuarioAsociado = usuarioAsociado;
        return self();
    }

    public Persona build() {
        return new Persona(nombre, apellido, cedula, direccion);
    }

    protected T self() {
        return (T) this;
    }
}
