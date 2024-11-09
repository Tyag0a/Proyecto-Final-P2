package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Vendedor extends Persona {
    private final int maxAsociados = 10;
    Collection<Producto> listProductos;
    Muro muro;
    Collection<Vendedor> listVendedorsAsociados;
    Collection<Vendedor> listChats;


    public Vendedor (String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) {
        super(nombre, apellido, cedula, direccion,usuarioAsociado);
        this.listProductos = new LinkedList<>();
        this.muro = new Muro();
        this.listVendedorsAsociados = new LinkedList<>();
        this.listChats = new LinkedList<>();

    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    public Collection<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(Collection<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public Collection<Vendedor> getListVendedorsAsociados() {
        return listVendedorsAsociados;
    }

    public void setListVendedorsAsociados(Collection<Vendedor> listVendedorsAsociados) {
        this.listVendedorsAsociados = listVendedorsAsociados;
    }

    public Collection<Vendedor> getListChats() {
        return listChats;
    }

    public void setListChats(Collection<Vendedor> listChats) {
        this.listChats = listChats;
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }
}
