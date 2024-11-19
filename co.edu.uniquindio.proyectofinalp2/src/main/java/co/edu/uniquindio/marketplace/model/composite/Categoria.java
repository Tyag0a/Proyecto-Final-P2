package co.edu.uniquindio.marketplace.model.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements CategoriaComponent {
    private String nombre;
    private List<CategoriaComponent> productos = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(CategoriaComponent producto) {
        productos.add(producto);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + nombre);
        for (CategoriaComponent producto : productos) {
            producto.mostrarDetalles();
        }
    }

}
