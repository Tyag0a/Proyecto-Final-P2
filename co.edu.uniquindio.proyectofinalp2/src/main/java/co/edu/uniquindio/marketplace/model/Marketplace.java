package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.services.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Marketplace implements ICrudUsuario, ICrudProducto, ICrudVendedor, ICrudpersona, ICrudPublicacion {

    private List<Producto> productos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Persona> personas = new ArrayList<>();
    private List<Publicacion> publicaciones = new ArrayList<>();
    Administrador administrador;

    public String nombre;

    public Marketplace() {}

    public Marketplace(String nombre, Administrador administrador) {
        this.nombre = nombre;
    }

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
    @Override
    public String crearPersona(String nombre, String apellido, String cedula, String direccion) {
        personas.add(new Persona(nombre, apellido, cedula, direccion));
        return "Persona creada: " + nombre + " " + apellido;
    }

    @Override
    public String eliminarPersona(String nombre, String apellido, String cedula, String direccion) {
        Persona persona = getPersona(nombre, apellido, cedula, direccion);
        if (persona != null) {
            personas.remove(persona);
            return "Persona eliminada: " + nombre + " " + apellido;
        }
        return "Persona no encontrada.";
    }

    @Override
    public String modificarPersona(String nombre, String apellido, String cedula, String direccion) {
        Persona persona = getPersona(nombre, apellido, cedula, direccion);
        if (persona != null) {
            persona.setDireccion(direccion);
            persona.setCedula(cedula);
            persona.setApellido(apellido);
            persona.setNombre(nombre);
            return "Persona modificada: " + nombre + " " + apellido;
        }
        return "Persona no encontrada.";
    }

    @Override
    public Persona getPersona(String nombre, String apellido, String cedula, String direccion) {
        return personas.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre) &&
                        p.getApellido().equalsIgnoreCase(apellido) &&
                        p.getCedula().equalsIgnoreCase(cedula) &&
                        p.getDireccion().equalsIgnoreCase(direccion))
                .findFirst()
                .orElse(null);
    }
    @Override
    public String crearPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        Publicacion publicacion = new Publicacion(fechaPublicacion, horaPublicacion);
        publicaciones.add(publicacion);
        return "Publicación creada: " + fechaPublicacion + " " + horaPublicacion;
    }

    @Override
    public String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        Publicacion publicacion = getPublicacion(fechaPublicacion, horaPublicacion);
        if (publicacion != null) {
            publicaciones.remove(publicacion);
            return "Publicación eliminada: " + fechaPublicacion + " " + horaPublicacion;
        }
        return "Publicación no encontrada.";
    }

    @Override
    public String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        Publicacion publicacion = getPublicacion(fechaPublicacion, horaPublicacion);
        if (publicacion != null) {
            publicacion.setFechaPublicacion(fechaPublicacion);
            publicacion.setHoraPublicacion(horaPublicacion);
            return "Publicación modificada: " + fechaPublicacion + " " + horaPublicacion;
        }
        return "Publicación no encontrada.";
    }

    @Override
    public Publicacion getPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getFechaPublicacion().equals(fechaPublicacion) &&
                    publicacion.getHoraPublicacion().equals(horaPublicacion)) {
                return publicacion;
            }
        }
        return null;
    }
}
