package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Chat {
    Collection<Mensaje> listMensajes;

    public Chat() {
        listMensajes = new LinkedList<Mensaje>();
    }
}
