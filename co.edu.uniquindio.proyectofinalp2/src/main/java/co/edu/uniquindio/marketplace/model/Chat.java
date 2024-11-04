package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Chat {

    private final int maxUsuarios = 2;
    Collection<Mensaje> listMensajes;
    Collection<Usuario> listUsuarios;

    public Chat() {
        listMensajes = new LinkedList<Mensaje>();
        listUsuarios = new LinkedList<Usuario>();
    }
}
