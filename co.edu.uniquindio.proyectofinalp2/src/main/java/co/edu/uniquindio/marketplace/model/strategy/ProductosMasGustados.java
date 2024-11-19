package co.edu.uniquindio.marketplace.model.strategy;

import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class ProductosMasGustados  implements  StrategyEstadisticas{

    private Boolean Intenger;

    @Override
    public String calcular(List<Producto> productos, List<Vendedor> vendedores) {
        return productos.stream().sorted((p1, p2) -> Intenger.compare(p2.getLikes(), p1.getLikes())).limit(10).map(p -> p.getNombre() + "(" + p.getLikes() + " likes)").collect(Collectors.joining("\n"));
    }
}
