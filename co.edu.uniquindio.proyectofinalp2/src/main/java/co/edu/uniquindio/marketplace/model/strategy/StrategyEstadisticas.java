package co.edu.uniquindio.marketplace.model.strategy;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;

public interface StrategyEstadisticas {
    String calcular(List<Producto> productos, List<Vendedor> vendedores);
}
