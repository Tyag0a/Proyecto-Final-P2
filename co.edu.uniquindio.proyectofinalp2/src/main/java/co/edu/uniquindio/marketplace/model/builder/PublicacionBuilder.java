package co.edu.uniquindio.marketplace.model.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import co.edu.uniquindio.marketplace.model.*;

public class PublicacionBuilder {
    private LocalDate fechaPublicacion;
    private LocalDateTime horaPublicacion;
    private Collection<Comentario> listaComentarios = new ArrayList<>();
    private Producto productoPublicado;
    String descripcionPublicacion;

    public PublicacionBuilder setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        return this;
    }

    public PublicacionBuilder setHoraPublicacion(LocalDateTime horaPublicacion) {
        this.horaPublicacion = horaPublicacion;
        return this;
    }

    public PublicacionBuilder setListaComentarios(Collection<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
        return this;
    }

    public PublicacionBuilder setProductoPublicado(Producto productoPublicado) {
        this.productoPublicado = productoPublicado;
        return this;
    }

    public Publicacion build() {
        return new Publicacion(fechaPublicacion, horaPublicacion,productoPublicado,descripcionPublicacion);
    }
}
