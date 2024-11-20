package co.edu.uniquindio.marketplace.model.builder;

import co.edu.uniquindio.marketplace.mapping.proxy.ImageProxy;
import co.edu.uniquindio.marketplace.model.*;
import javafx.scene.image.Image;

public class ProductoBuilder {
    private String nombre;
    private String rutaImagen;
    private String categoria;
    private double precio;
    private Publicacion publicacion;
    private EstadoProducto estadoProducto;

    public ProductoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder setImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
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
        ImageProxy image = new ImageProxy(rutaImagen);
        return new Producto(nombre, image, categoria, precio,estadoProducto);
    }
}
