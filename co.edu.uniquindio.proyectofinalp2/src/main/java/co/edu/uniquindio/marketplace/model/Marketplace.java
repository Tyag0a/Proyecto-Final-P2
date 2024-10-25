package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.services.ICrudProducto;
import co.edu.uniquindio.marketplace.services.ICrudUsuario;
import co.edu.uniquindio.marketplace.services.ICrudVendedor;

import java.util.ArrayList;
import java.util.List;

public class Marketplace implements ICrudUsuario, ICrudProducto, ICrudVendedor {

    private List<Producto> productos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();

    public String nombre;

    public Marketplace() {}

    public Marketplace(String nombre) {
        this.nombre = nombre;
    }

    // CRUD Producto
    @Override
    public String crearProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        Producto producto = new Producto(nombre, imagen, categoria, precio);
        productos.add(producto);
        return "Producto creado: " + nombre;
    }

    @Override
    public String eliminarProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        Producto producto = getProducto(nombre);
        if (producto != null) {
            productos.remove(producto);
            return "Producto eliminado: " + nombre;
        }
        return "Producto no encontrado.";
    }

    @Override
    public String modificarProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        Producto producto = getProducto(nombre);
        if (producto != null) {
            producto.setImagen(imagen);
            producto.setCategoria(categoria);
            producto.setPrecio(precio);
            return "Producto modificado: " + nombre;
        }
        return "Producto no encontrado.";
    }

    @Override
    public Producto getProducto(String nombre) throws Exception {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // CRUD Usuario (sin cambios)
    @Override
    public String crearUsuario(String nombreUsuario, String contraseña) throws Exception {
        Usuario usuario = new Usuario(nombreUsuario, contraseña);
        usuarios.add(usuario);
        return "Usuario creado: " + nombreUsuario;
    }

    @Override
    public String eliminarUsuaria(String nombreUsuario, String contraseña) throws Exception {
        Usuario usuario = getUsuario(nombreUsuario);
        if (usuario != null && usuario.getContraseña().equals(contraseña)) {
            usuarios.remove(usuario);
            return "Usuario eliminado: " + nombreUsuario;
        }
        return "Usuario no encontrado o contraseña incorrecta.";
    }

    @Override
    public String modificarUsuario(String nombreUsuario, String contraseña) throws Exception {
        Usuario usuario = getUsuario(nombreUsuario);
        if (usuario != null) {
            usuario.setContraseña(contraseña);
            return "Usuario modificado: " + nombreUsuario;
        }
        return "Usuario no encontrado.";
    }

    @Override
    public Usuario getUsuario() throws Exception {
        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        }
        return null;
    }

    public Usuario getUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    // CRUD Vendedor (sin cambios)
    @Override
    public String crearVendedor(String nombre, String apellido, String cedula, String direccion) throws Exception {
        Vendedor vendedor = new Vendedor(nombre, apellido, cedula, direccion);
        vendedores.add(vendedor);
        return "Vendedor creado: " + nombre + " " + apellido;
    }

    @Override
    public String eliminarVendedor(String nombre, String apellido, String cedula, String direccion) throws Exception {
        Vendedor vendedor = getVendedor(nombre, apellido);
        if (vendedor != null) {
            vendedores.remove(vendedor);
            return "Vendedor eliminado: " + nombre + " " + apellido;
        }
        return "Vendedor no encontrado.";
    }

    @Override
    public String modificarVendedor(String nombre, String apellido, String cedula, String direccion) throws Exception {
        Vendedor vendedor = getVendedor(nombre, apellido);
        if (vendedor != null) {
            vendedor.setCedula(cedula);
            vendedor.setDireccion(direccion);
            return "Vendedor modificado: " + nombre + " " + apellido;
        }
        return "Vendedor no encontrado.";
    }

    @Override
    public Vendedor getVendedor() throws Exception {
        if (!vendedores.isEmpty()) {
            return vendedores.get(0);
        }
        return null;
    }

    public Vendedor getVendedor(String nombre, String apellido) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNombre().equalsIgnoreCase(nombre) &&
                    vendedor.getApellido().equalsIgnoreCase(apellido)) {
                return vendedor;
            }
        }
        return null;
    }
}
