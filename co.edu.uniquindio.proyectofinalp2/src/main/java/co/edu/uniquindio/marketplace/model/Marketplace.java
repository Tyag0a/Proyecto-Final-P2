package co.edu.uniquindio.marketplace.model;

import co.edu.uniquindio.marketplace.mapping.proxy.ImageProxy;
import co.edu.uniquindio.marketplace.services.*;
import javafx.scene.image.Image;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Marketplace implements ICrudUsuario, ICrudProducto, ICrudVendedor, ICrudpersona, ICrudPublicacion, ICrudAliado {

    private List<Producto> productos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Persona> personas = new ArrayList<>();
    private List<Publicacion> publicaciones = new ArrayList<>();
    Administrador administrador;

    public String nombre;

    public Marketplace() {

    }

    public Marketplace(String nombre, Administrador administrador) {

        this.nombre = nombre;
        this.administrador = administrador;
        this.productos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

//-----------------------------------IMPLEMENTACION DE CRUDS----------------------------------------------------

    @Override
    public String crearProducto(String nombre, String imagen, String categoria, double precio, EstadoProducto estado) throws Exception {
        ImageProxy proxyimage = new ImageProxy(imagen);
        Producto producto = new Producto(nombre, proxyimage, categoria, precio,estado);
        productos.add(producto);
        return "Producto creado: " + nombre;
    }

    @Override
    public String eliminarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception {
        Producto producto = getProducto(nombre);
        if (producto != null) {
            productos.remove(producto);
            return "Producto eliminado: " + nombre;
        }
        return "Producto no encontrado.";
    }

    @Override
    public String modificarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception {
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
    public String crearUsuario(String nombreUsuario, String contraseña, Persona personaAsociada) {
        Usuario usuario = new Usuario(nombreUsuario, contraseña,personaAsociada);
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
    public boolean crearVendedor(Vendedor newVendedor) {

        if (newVendedor != null) {
            vendedores.add(newVendedor);
            crearUsuario(newVendedor.usuarioAsociado.getNombreUsuario(),newVendedor.usuarioAsociado.getContraseña(),newVendedor);
            return true;

        }
        return false ;
    }

    @Override
    public String eliminarVendedor(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado) throws Exception {
        Vendedor vendedor = getVendedor(nombre, apellido);
        if (vendedor != null) {
            vendedores.remove(vendedor);
            return "Vendedor eliminado: " + nombre + " " + apellido;
        }
        return "Vendedor no encontrado.";
    }

    @Override
    public String modificarVendedor(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado) throws Exception {
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
    public String crearPersona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado) {
        personas.add(new Persona(nombre, apellido, cedula, direccion, usuarioAsociado));
        return "Persona creada: " + nombre + " " + apellido;
    }

    @Override
    public String eliminarPersona(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado) {
        Persona persona = getPersona(nombre, apellido, cedula, direccion);
        if (persona != null) {
            personas.remove(persona);
            return "Persona eliminada: " + nombre + " " + apellido;
        }
        return "Persona no encontrada.";
    }

    @Override
    public String modificarPersona(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado) {
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
    public boolean crearPublicacion(Publicacion publicacion)  {
        if(publicacionExiste(publicacion)){
            publicaciones.add(publicacion);
            return true;

        }
        return false;

    }

    @Override
    public String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        Publicacion publicacion = getPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
        if (publicacion != null) {
            publicaciones.remove(publicacion);
            return "Publicación eliminada: " + fechaPublicacion + " " + horaPublicacion;
        }
        return "Publicación no encontrada.";
    }

    @Override
    public String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        Publicacion publicacion = getPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
        if (publicacion != null) {
            publicacion.setFechaPublicacion(fechaPublicacion);
            publicacion.setHoraPublicacion(horaPublicacion);
            return "Publicación modificada: " + fechaPublicacion + " " + horaPublicacion;
        }
        return "Publicación no encontrada.";
    }

    @Override
    public Publicacion getPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getFechaPublicacion().equals(fechaPublicacion) &&
                    publicacion.getHoraPublicacion().equals(horaPublicacion)) {
                return publicacion;
            }
        }
        return null;
    }

//------------------------------------METODOS BACKEND---------------------------------------------------------

    /**
     * Metodo para verificar la existencia de un usuario
     */
    public boolean verificarUsuario (String nombreUsuario, String contraseña){
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña) && usuario.getNombreUsuario() != "sAdmin"){
                return true;
            }

        }
        return false;
    }

    public Vendedor obtenerVendedorPorUsuario(String nombreUsuario, String contraseña) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getUsuarioAsociado().getNombreUsuario().equals(nombreUsuario) && vendedor.getUsuarioAsociado().getContraseña().equals(contraseña)) {
                return vendedor;
            }
        }
        return null;
    }

    /**
     * Metodo para verificar la existencia de un vendedor
     */
    public boolean verificarVendedorExistente(String cedula) {
        Vendedor vendedorExistente = null;
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                vendedorExistente = vendedor;
                break;
            }
        }

        if (vendedorExistente == null) {
            return true;
        }
        return false;
    }

    /**
     * Metodo para verificar la existencia de una publicacion
     */

    public boolean publicacionExiste(Publicacion publicacion) {
        for (Vendedor vendedor : vendedores) {
            for (Publicacion publi : vendedor.getMuro().listPublicaciones) {
                if (publi.getProductoPublicado() == publicacion.getProductoPublicado()) {
                    return true;
                }

            }
        }
        return false;
    }

//----------------------------------------GETTERS Y SETTERS------------------------------------------------------------------

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public boolean agregarAliado( Usuario usuario) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getListVendedorsAsociados().contains(usuario.getPersonaAsociada())) {
                return false;
            }
            vendedor.getListVendedorsAsociados().add((Vendedor) usuario.getPersonaAsociada());
            return true;

        }
        return false;
    }

    public Administrador getAdministrador() {
        return administrador;
    }
}
