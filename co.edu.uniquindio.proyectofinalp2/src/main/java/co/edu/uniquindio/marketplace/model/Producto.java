package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.model.builder.ProductoBuilder;
import co.edu.uniquindio.marketplace.model.composite.CategoriaComponent;
import co.edu.uniquindio.marketplace.services.IImage;
import javafx.scene.image.Image;

import java.time.temporal.TemporalAccessor;

public class Producto implements CategoriaComponent {
    String nombre;
    Image image;
    String categoria;
    double precio;
    Publicacion publicacion;
    EstadoProducto estadoProducto;
    String rutaImagen;
    String idVendedor;
    IImage imagen;

    public Producto(String nombre, IImage imagen, String categoria, double precio, EstadoProducto estadoProducto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.publicacion = publicacion;
        this.estadoProducto = estadoProducto;
        this.rutaImagen = rutaImagen;
        this.imagen = imagen;
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

    public Image getImage() {
        return image;
    }

    public  String getRutaImage() {
        return rutaImagen;
    }

    public void setImagen(Image imagen) {
        this.image = image;
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

    public boolean getLikes() {return false;}

    public IImage getImagen() {return imagen;}

    public void setImagen(IImage imagen) { this.imagen = imagen; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Precio: " + precio);
    }
}
