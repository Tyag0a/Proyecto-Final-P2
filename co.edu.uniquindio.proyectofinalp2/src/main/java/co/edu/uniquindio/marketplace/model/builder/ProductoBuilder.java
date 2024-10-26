package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.model.*;

public class ProductoBuilder {
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private Publicacion publicacion;
    private EstadoProducto estadoProducto;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setImagen(String imagen) {
        this.imagen = imagen;
        return this;
    }

    public ProductoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public ProductoBuilder setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
        return this;
    }

    public Producto build() {
        return new Producto(nombre, imagen, categoria, precio);
    }
}
