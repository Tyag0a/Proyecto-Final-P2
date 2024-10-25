package co.edu.uniquindio.marketplace.services;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Publicacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ICrudPublicacion {
    String crearPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception;
    String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception;
    String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception;
    Publicacion getPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception;
}
