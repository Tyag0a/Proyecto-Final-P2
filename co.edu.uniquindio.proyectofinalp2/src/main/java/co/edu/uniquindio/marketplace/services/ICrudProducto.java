package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.EstadoProducto;
import co.edu.uniquindio.marketplace.model.Producto;
import javafx.scene.image.Image;

public interface ICrudProducto {
    String crearProducto(String nombre, String imagen, String categoria, double precio, EstadoProducto estado) throws Exception;
    String eliminarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception;
    String modificarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception;
    Producto getProducto(String nombre) throws Exception;
}
