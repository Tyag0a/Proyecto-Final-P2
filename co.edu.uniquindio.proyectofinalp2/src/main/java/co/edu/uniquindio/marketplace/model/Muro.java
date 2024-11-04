package co.edu.uniquindio.marketplace.model;

import java.util.ArrayList;
import java.util.Collection;

public class Muro {
    Collection<Publicacion> listPublicaciones;
    Collection<Chat> listChats;
    String idvendedor;

    public Muro() {
        listPublicaciones = new ArrayList<Publicacion>();
        listChats = new ArrayList<>();
    }

    public Muro(String idvendedor) {
        listPublicaciones = new ArrayList<Publicacion>();
        listChats = new ArrayList<>();
        this.idvendedor = idvendedor;
    }

    public void setListChats(Collection<Chat> listChats) {
        this.listChats = listChats;
    }

    public void setListPublicaciones(Collection<Publicacion> listPublicaciones) {
        this.listPublicaciones = listPublicaciones;
    }

    public Collection<Chat> getListChats() {
        return listChats;
    }

    public Collection<Publicacion> getListPublicaciones() {
        return listPublicaciones;
    }
}
