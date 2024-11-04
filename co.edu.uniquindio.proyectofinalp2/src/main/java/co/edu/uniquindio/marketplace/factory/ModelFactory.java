package co.edu.uniquindio.marketplace.factory;

import co.edu.uniquindio.marketplace.mapping.mappers.MarketplaceMappingImpl;
import co.edu.uniquindio.marketplace.model.*;
import co.edu.uniquindio.marketplace.services.IModelFactoryService;
import javafx.scene.image.Image;

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


    public static Usuario agregarUsuario() throws Exception {
        return marketplace.getUsuario();

    }

    public String crearPersona(String nombre, String apellido, String cedula, String direccion, Usuario usuarioAsociado){
        return marketplace.crearPersona(nombre, apellido, cedula, direccion, usuarioAsociado);
    }
    public String eliminarPersona(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado){
        return marketplace.eliminarPersona(nombre, apellido, cedula, direccion, usuarioAsociado);
    }
    public String modificarPersona(String nombre, String apellido, String cedula, String direccion,Usuario usuarioAsociado){
        return marketplace.modificarPersona(nombre, apellido, cedula, direccion,usuarioAsociado);
    }
    public String crearProducto(String nombre, String imagen, String categoria, double precio,EstadoProducto estado) throws Exception {
        return marketplace.crearProducto(nombre, imagen, categoria, precio,estado);
    }
    public String eliminarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception {
        return marketplace.eliminarProducto(nombre, imagen, categoria, precio,estado);
    }
    public String modificarProducto(String nombre, Image imagen, String categoria, double precio,EstadoProducto estado) throws Exception {
        return marketplace.modificarProducto(nombre, imagen, categoria, precio,estado);
    }
    public String crearPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        return marketplace.crearPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
    }
    public String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        return marketplace.eliminarPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
    }
    public String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        return marketplace.modificarPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
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
    public String crearVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception{
        return marketplace.crearVendedor(nombre, apellido, cedula, direccion,usuarioAsociado);
    }
    public String eliminarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception{
        return marketplace.eliminarVendedor(nombre, apellido, cedula, direccion,usuarioAsociado);
    }
    public String modificarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception{
        return marketplace.modificarVendedor(nombre, apellido, cedula, direccion,usuarioAsociado);
    }

    public static Marketplace inicializarDatos () {
        Marketplace marketplace = new Marketplace();

        //Productos

        Producto p1 = new Producto("Telefono juguete",
                "/co/edu/uniquindio/co/viewmedia/telefono_jugueteP1.jpg","Aparato electronico",15.000,EstadoProducto.PUBLICADO);

        Producto p2 = new Producto("TV 13",
                "/co/edu/uniquindio/co/viewmedia/televisionn_P2.jpeg","Aparato electronico",600.000,EstadoProducto.PUBLICADO);

        Producto p3 = new Producto("Camisa",
                "/co/edu/uniquindio/co/viewmedia/camisa_P3.jpg","Ropa",70.000, EstadoProducto.PUBLICADO);

        //Publicaciones

        Publicacion publicacion1 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p1,"telefono visajoso");
        Publicacion publicacion2 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p2,"TV de 70 pulgadas");
        Publicacion publicacion3 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p3,"Camisa vasilona nueva");

        //Vendedores y sus usuarios

        Usuario usuario1 = new Usuario("jhonjairo777","jairito123");
        Vendedor vendedor1 = new Vendedor("Jhon jairo","melo","1249284204","direccion1",usuario1);

        Usuario usuario2 = new Usuario("pacho_xy","genaro9865");
        Vendedor vendedor2 = new Vendedor("Pacho","Pablo","1398247183","direccion2",usuario2);

        Usuario usuario3 = new Usuario("Gildardo","gil0990");
        Vendedor vendedor3 = new Vendedor("Gildardo","montoya","862368823","direccion3",usuario3);

        //admin

        Usuario usuario4 = new Usuario("juanalpargata","8921j");
        Administrador administrador = new Administrador("juan","zuckerberg","14252324","direccionadmin","01",usuario4);





        return marketplace;

    }




}



