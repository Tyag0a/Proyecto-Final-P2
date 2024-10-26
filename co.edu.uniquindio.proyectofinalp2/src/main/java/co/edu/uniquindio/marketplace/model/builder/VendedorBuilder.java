package co.edu.uniquindio.marketplace.model.builder;
import co.edu.uniquindio.marketplace.model.*;
import java.util.Collection;
import java.util.LinkedList;

public class VendedorBuilder extends PersonaBuilder<VendedorBuilder> {
    private Collection<Producto> listProductos = new LinkedList<>();
    private Muro muro = new Muro();
    private Collection<Vendedor> listVendedorsAsociados = new LinkedList<>();
    private Collection<Vendedor> listChats = new LinkedList<>();

    public VendedorBuilder setListProductos(Collection<Producto> listProductos) {
        this.listProductos = listProductos;
        return this;
    }

    public VendedorBuilder setMuro(Muro muro) {
        this.muro = muro;
        return this;
    }

    public VendedorBuilder setListVendedorsAsociados(Collection<Vendedor> listVendedorsAsociados) {
        this.listVendedorsAsociados = listVendedorsAsociados;
        return this;
    }

    public VendedorBuilder setListChats(Collection<Vendedor> listChats) {
        this.listChats = listChats;
        return this;
    }

    @Override
    public Vendedor build() {
        Vendedor vendedor = new Vendedor(nombre, apellido, cedula, direccion);
        vendedor.setUsuarioAsociado(usuarioAsociado);
        vendedor.setListProductos(listProductos);
        vendedor.setMuro(muro);
        vendedor.setListVendedorsAsociados(listVendedorsAsociados);
        vendedor.setListChats(listChats);
        return vendedor;
    }

    @Override
    protected VendedorBuilder self() {
        return this;
    }
}
