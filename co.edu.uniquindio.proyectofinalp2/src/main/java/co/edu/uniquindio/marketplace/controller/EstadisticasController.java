package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.model.Vendedor;
import co.edu.uniquindio.marketplace.model.strategy.CantidadContacto;
import co.edu.uniquindio.marketplace.model.strategy.ProductosMasGustados;
import co.edu.uniquindio.marketplace.model.strategy.ProductosPorFecha;
import co.edu.uniquindio.marketplace.model.strategy.TableroDecontrol;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.List;

public class EstadisticasController {

    static ModelFactory modelFactory;
    private TableroDecontrol tableroDeControl;

    private List<Producto> productos;
    private List<Vendedor> vendedores;

    public EstadisticasController(List<Producto> productos, List<Vendedor> vendedores) {
        this.tableroDeControl = new TableroDecontrol();
        this.productos = productos;
        this.vendedores = vendedores;
    }

    public ObservableList<String> obtenerEstrategiasDisponibles() {
        return FXCollections.observableArrayList(
                "Productos por Fecha",
                "Productos Más Gustados",
                "Cantidad de Contactos"
        );
    }

    public void establecerEstrategia(String estrategia, LocalDate fechaInicio, LocalDate fechaFin) {
        switch (estrategia) {
            case "Productos por Fecha" -> tableroDeControl.setEstrategia(new ProductosPorFecha(fechaInicio, fechaFin));
            case "Productos Más Gustados" -> tableroDeControl.setEstrategia(new ProductosMasGustados());
            case "Cantidad de Contactos" -> tableroDeControl.setEstrategia(new CantidadContacto());
            default -> throw new IllegalArgumentException("Estrategia no reconocida");
        }
    }

    public String generarEstadistica(LocalDate fechaInicio, LocalDate fechaFin, String estrategiaSeleccionada) {
        establecerEstrategia(estrategiaSeleccionada, fechaInicio, fechaFin);
        return tableroDeControl.generarEstadistica(productos, vendedores);
    }
}
