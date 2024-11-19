package co.edu.uniquindio.marketplace.model.strategy;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class CantidadContacto implements StrategyEstadisticas{


    @Override
    public String calcular(List<Producto> productos, List<Vendedor> vendedores) {
        return vendedores.stream().map(v -> v.getNombre() + "tiene" + v.getListVendedorsAsociados().size() + " Vendedores asociados").collect(Collectors.joining("\n"));
    }
}
