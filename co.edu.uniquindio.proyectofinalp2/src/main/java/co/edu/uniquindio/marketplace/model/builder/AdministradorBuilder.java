package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.model.Administrador;

public class AdministradorBuilder extends PersonaBuilder<AdministradorBuilder> {

    private String idAdmin;

    @Override
    public Administrador build() {
        Administrador administrador = new Administrador(nombre, apellido, cedula, direccion,idAdmin,usuarioAsociado);
        administrador.setUsuarioAsociado(usuarioAsociado);
        return administrador;
    }

    @Override
    protected AdministradorBuilder self() {
        return this;
    }
}
