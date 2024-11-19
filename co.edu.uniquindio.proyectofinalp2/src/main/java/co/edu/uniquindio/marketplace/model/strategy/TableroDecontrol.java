package co.edu.uniquindio.marketplace.model.strategy;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;

public class TableroDecontrol {
    private  StrategyEstadisticas estrategia;

    public void setEstrategia(StrategyEstadisticas estrategia) {
        this.estrategia = estrategia;
    }

    public String generarEstadistica(List<Producto> productos, List<Vendedor> vendedores){
        if (estrategia == null) {
            throw new IllegalStateException(("Debe de seleccionar antes de realizarse"));
        }
        return estrategia.calcular(productos, vendedores);
    }
}
