package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.ProductoBuilder;
import javafx.scene.image.Image;

import java.time.temporal.TemporalAccessor;

public class Producto {
    String nombre;
    Image imagen;
    String categoria;
    double precio;
    Publicacion publicacion;
    EstadoProducto estadoProducto;
    String rutaImagen;
    String idVendedor;

    public Producto(String nombre, String rutaImagen, String categoria, double precio, EstadoProducto estadoProducto) {
        this.nombre = nombre;
        this.imagen = new Image(getClass().getResource(rutaImagen).toString());
        this.categoria = categoria;
        this.precio = precio;
        this.publicacion = publicacion;
        this.estadoProducto = estadoProducto;
        this.rutaImagen = rutaImagen;
    }

    public static ProductoBuilder builder() {
        return new ProductoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image getImagen() {
        return imagen;
    }

    public  String getRutaImagen() {
        return rutaImagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

}
