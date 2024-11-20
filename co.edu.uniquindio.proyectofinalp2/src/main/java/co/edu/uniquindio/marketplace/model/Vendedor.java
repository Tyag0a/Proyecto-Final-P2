package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.VendedorBuilder;
import co.edu.uniquindio.marketplace.model.mediator.Mediador;
import co.edu.uniquindio.marketplace.model.observer.Observer;
import co.edu.uniquindio.marketplace.model.observer.Subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Persona {
    private Subject subject;
    private final int maxAsociados = 10;
    List<Producto> listProductos;
    Muro muro;
    Collection<Vendedor> listVendedorsAsociados;
    Collection<Vendedor> listChats;
    private Mediador mediador;


    public Vendedor (String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) {
        super(nombre, apellido, cedula, direccion,usuarioAsociado);
        this.listProductos = new LinkedList<>();
        this.muro = new Muro();
        this.listVendedorsAsociados = new LinkedList<>();
        this.listChats = new LinkedList<>();
        this.subject = new Subject();
        this.mediador = mediador;


    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    public List<Producto> getListProductos() {
        return listProductos;
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

    public void agregarContacto(Observer contacto) {
        subject.agregarObserver(contacto);
    }

    public void eliminarContacto(Observer contacto) {
        subject.eliminarObserver(contacto);
    }


    public void publicarProducto(Producto producto) {
        listProductos.add(producto);
        String notification = "Nuevo producto publicado por " + nombre + ": " + producto.getNombre();
        subject.notificarObservers(notification);
    }

    public void comentarProducto(Producto producto, String comentario) {
        String notification = nombre + " ha comentado en el producto: " + producto.getNombre();
        subject.notificarObservers(notification);
    }

    public void meGustaProducto(Producto producto) {
        String notification = nombre + " dio 'Me gusta' al producto: " + producto.getNombre();
        subject.notificarObservers(notification);
    }

    public void enviarMensaje(String mensaje){
        System.out.println(this.nombre + " está enviando el mensaje: " + mensaje);
        mediador.enviarMensaje(mensaje, this); // El vendor envía el mensaje
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(this.nombre + " ha recibido el mensaje: " + mensaje);
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }
}
