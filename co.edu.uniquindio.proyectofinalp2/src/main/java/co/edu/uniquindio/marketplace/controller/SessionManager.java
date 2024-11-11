package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.model.Vendedor;

//Clase para almacenar el vendedor/usuario que ha iniciado sesion y transferir info entre ventanas

public class SessionManager {
    private static SessionManager instance;
    private Vendedor vendedor;

    private SessionManager() {}

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }


    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}
