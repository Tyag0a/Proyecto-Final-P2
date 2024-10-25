package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.services.ICrudUsuario;

public class Marketplace implements ICrudUsuario {

    public String nombre;

    public Usuario getUsuario() {

        return null;
    }

    public Marketplace() { }

    public Marketplace (String nombre) {
        this.nombre = nombre;

    }
}
