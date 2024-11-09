package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Publicacion;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ICrudPublicacion {
    boolean crearPublicacion(Publicacion publicacion, Vendedor vendedor) throws Exception;
    String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception;
    String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception;
    Publicacion getPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception;
}
