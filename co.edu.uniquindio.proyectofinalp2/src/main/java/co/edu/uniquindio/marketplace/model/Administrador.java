package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.AdministradorBuilder;

public class Administrador extends Persona{

    public Administrador(String nombre, String apellido, String cedula, String direccion) {
        super(nombre,apellido,cedula, direccion);

    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }


}
