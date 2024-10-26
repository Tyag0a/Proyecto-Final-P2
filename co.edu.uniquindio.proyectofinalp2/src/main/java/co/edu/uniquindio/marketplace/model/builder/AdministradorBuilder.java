package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.model.Administrador;

public class AdministradorBuilder extends PersonaBuilder<AdministradorBuilder> {

    @Override
    public Administrador build() {
        Administrador administrador = new Administrador(nombre, apellido, cedula, direccion);
        administrador.setUsuarioAsociado(usuarioAsociado);
        return administrador;
    }

    @Override
    protected AdministradorBuilder self() {
        return this;
    }
}
