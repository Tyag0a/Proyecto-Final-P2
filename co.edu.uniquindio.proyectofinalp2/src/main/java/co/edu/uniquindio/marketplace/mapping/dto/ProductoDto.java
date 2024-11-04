package co.edu.uniquindio.marketplace.mapping.dto;

import co.edu.uniquindio.marketplace.model.EstadoProducto;
import javafx.scene.image.Image;

public record ProductoDto(
        String nombre,
        String rutaImagen,
        String categoria,
        double precio,
        EstadoProducto estadoProducto) {
}
