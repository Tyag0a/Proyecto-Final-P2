package co.edu.uniquindio.marketplace.model.strategy;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ProductosPorFecha implements StrategyEstadisticas {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ProductosPorFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String calcular(List<Producto> productos, List<Vendedor> vendedores) {
        long count = productos.stream()
                .filter(p -> {
                    LocalDateTime fechaPublicacion = LocalDateTime.from(p.getPublicacion().getFechaPublicacion());
                    return !fechaPublicacion.toLocalDate().isBefore(fechaInicio) && !fechaPublicacion.toLocalDate().isAfter(fechaFin);
                })
                .count();

        return "Productos publicados entre " + fechaInicio + " y " + fechaFin + ": " + count;
    }
}
