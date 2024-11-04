package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.PublicacionBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class Publicacion {
    LocalDate fechaPublicacion;
    LocalDateTime horaPublicacion;
    Collection<Comentario> listaComentarios;
    Collection<Vendedor> listaLikesVendedor;
    Producto productoPublicado;
    String descripcionPublicacion;

    public Publicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion, Producto productoPublicado, String descripcionPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
        this.listaComentarios = new ArrayList<Comentario>();
        this.listaLikesVendedor = new ArrayList<Vendedor>();
        this.descripcionPublicacion = descripcionPublicacion;
        this.productoPublicado = productoPublicado;

    }

    public static PublicacionBuilder builder() {
        return new PublicacionBuilder();
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getHoraPublicacion() {
        return horaPublicacion;
    }

    public void setHoraPublicacion(LocalDateTime horaPublicacion) {
        this.horaPublicacion = horaPublicacion;
    }

    public Collection<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(Collection<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public Producto getProductoPublicado() {
        return productoPublicado;
    }

    public void setProductoPublicado(Producto productoPublicado) {
        this.productoPublicado = productoPublicado;
    }

    public String getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(String descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }



}
