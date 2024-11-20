package co.edu.uniquindio.marketplace.model.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements CategoriaComponent {

    private String nombre;
    private List<CategoriaComponent> componentes = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(CategoriaComponent componente) {
        componentes.add(componente);
    }

    public void removerComponente(CategoriaComponent componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría: " + nombre);
        for (CategoriaComponent componente : componentes) {
            componente.mostrarDetalles();
        }
    }

    public String getNombre() {
        return nombre;
    }
}
