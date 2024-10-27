package co.edu.uniquindio.marketplace.factory;

import co.edu.uniquindio.marketplace.mapping.mappers.MarketplaceMappingImpl;
import co.edu.uniquindio.marketplace.model.Marketplace;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.services.IModelFactoryService;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    static Marketplace marketplace;
    MarketplaceMappingImpl mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        mapper = new MarketplaceMappingImpl();
        marketplace = inicializarDatos();
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public static Marketplace inicializarDatos () {
        Marketplace marketplace = new Marketplace();

        //datoss

        return marketplace;

    }

    public static Usuario agregarUsuario() throws Exception {
        return marketplace.getUsuario();

    }

    public String crearPersona(String nombre, String apellido, String cedula, String direccion){
        return marketplace.crearPersona(nombre, apellido, cedula, direccion);
    }
    public String eliminarPersona(String nombre, String apellido, String cedula, String direccion){
        return marketplace.eliminarPersona(nombre, apellido, cedula, direccion);
    }
    public String modificarPersona(String nombre, String apellido, String cedula, String direccion){
        return marketplace.modificarPersona(nombre, apellido, cedula, direccion);
    }
    public String crearProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        return marketplace.crearProducto(nombre, imagen, categoria, precio);
    }
    public String eliminarProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        return marketplace.eliminarProducto(nombre, imagen, categoria, precio);
    }
    public String modificarProducto(String nombre, String imagen, String categoria, double precio) throws Exception {
        return marketplace.modificarProducto(nombre, imagen, categoria, precio);
    }
    public String crearPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        return marketplace.crearPublicacion(fechaPublicacion, horaPublicacion);
    }
    public String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        return marketplace.eliminarPublicacion(fechaPublicacion, horaPublicacion);
    }
    public String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion) throws Exception {
        return marketplace.modificarPublicacion(fechaPublicacion, horaPublicacion);
    }
    public String crearUsuario(String nombreUsuario, String contraseña) throws Exception{
        return marketplace.crearUsuario(nombreUsuario, contraseña);
    }
    public String eliminarUsuaria(String nombreUsuario, String contraseña) throws Exception {
        return marketplace.eliminarUsuaria(nombreUsuario, contraseña);
    }
    public String modificarUsuario(String nombreUsuario, String contraseña) throws Exception {
        return marketplace.modificarUsuario(nombreUsuario, contraseña);
    }
    public String crearVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception{
        return marketplace.crearVendedor(nombre, apellido, cedula, direccion);
    }
    public String eliminarVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception{
        return marketplace.eliminarVendedor(nombre, apellido, cedula, direccion);
    }
    public String modificarVendedor(String nombre, String apellido,String cedula, String direccion) throws Exception{
        return marketplace.modificarVendedor(nombre, apellido, cedula, direccion);
    }




}



