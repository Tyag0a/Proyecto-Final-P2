package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Producto;

public interface ICrudProducto {
    String crearProducto(String nombre, String imagen, String categoria, double precio) throws Exception;
    String eliminarProducto(String nombre, String imagen, String categoria, double precio) throws Exception;
    String modificarProducto(String nombre, String imagen, String categoria, double precio) throws Exception;
    Producto getProducto(String nombre) throws Exception;
}
