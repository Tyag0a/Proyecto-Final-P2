package co.edu.uniquindio.marketplace.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Publicacion {
    LocalDate fechaPublicacion;
    LocalDateTime horaPublicacion;

    public Publicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        this.horaPublicacion = horaPublicacion;
    }
}
