package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.AdministradorBuilder;

public class Administrador extends Persona{

    String idAmin;

    public Administrador(String nombre, String apellido, String cedula, String direccion, String idAmin, Usuario usuarioAsociado) {
        super(nombre,apellido,cedula, direccion,usuarioAsociado);
        this.idAmin = idAmin;

    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }


}
