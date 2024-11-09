package co.edu.uniquindio.marketplace.mapping.dto;

import co.edu.uniquindio.marketplace.model.Producto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PublicacionDto(LocalDate fechaPublicacion,
                             LocalDateTime horaPublicacion, String descripcion, Producto producto) {
}
