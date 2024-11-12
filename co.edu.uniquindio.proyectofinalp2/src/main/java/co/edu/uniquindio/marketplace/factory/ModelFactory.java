package co.edu.uniquindio.marketplace.factory;

import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
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

//------------------------------------------------CRUDS---------------------------------------------------------------------------

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
    public boolean crearPublicacion(Publicacion publicacion) throws Exception {
        return marketplace.crearPublicacion(publicacion);
    }
    public String eliminarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        return marketplace.eliminarPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
    }
    public String modificarPublicacion(LocalDate fechaPublicacion, LocalDateTime horaPublicacion,Producto producto, String descripcion) throws Exception {
        return marketplace.modificarPublicacion(fechaPublicacion, horaPublicacion,producto,descripcion);
    }
    public String crearUsuario(String nombreUsuario, String contraseña,Persona personaAsociada) throws Exception{
        return marketplace.crearUsuario(nombreUsuario, contraseña,personaAsociada);
    }
    public String eliminarUsuaria(String nombreUsuario, String contraseña) throws Exception {
        return marketplace.eliminarUsuaria(nombreUsuario, contraseña);
    }
    public String modificarUsuario(String nombreUsuario, String contraseña) throws Exception {
        return marketplace.modificarUsuario(nombreUsuario, contraseña);
    }
    public boolean agregarVendedor(VendedorDto vendedorDto){
        if(getMarketplace().verificarVendedorExistente(vendedorDto.cedula())){
            Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

            getMarketplace().crearVendedor(newVendedor);
            return true;

        }
        return false;
    }
    public String eliminarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception{
        return marketplace.eliminarVendedor(nombre, apellido, cedula, direccion,usuarioAsociado);
    }
    public String modificarVendedor(String nombre, String apellido,String cedula, String direccion,Usuario usuarioAsociado) throws Exception{
        return marketplace.modificarVendedor(nombre, apellido, cedula, direccion,usuarioAsociado);
    }

//-------------------------------------INICIALIZACION DE DATOS----------------------------------------------------------------------------

    public Marketplace inicializarDatos () {
        Marketplace marketplace = new Marketplace();

        //Productos

        Producto p1 = new Producto("Telefono juguete",
                "/co/edu/uniquindio/co/viewmedia/telefono_jugueteP1.jpg","Aparato electronico",15.000,EstadoProducto.PUBLICADO);

        Producto p2 = new Producto("TV 70 pulgadas",
                "/co/edu/uniquindio/co/viewmedia/televisionn_P2.jpeg","Aparato electronico",600.000,EstadoProducto.PUBLICADO);

        Producto p3 = new Producto("Camisa",
                "/co/edu/uniquindio/co/viewmedia/camisa_P3.jpg","Ropa",70.000, EstadoProducto.PUBLICADO);

        //Publicaciones

        Publicacion publicacion1 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p1,"telefono visajoso 150GB RAM totalmente nuevo");
        Publicacion publicacion2 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p2,"TV de 70 pulgadas de segunda");
        Publicacion publicacion3 = new Publicacion(LocalDate.now(),LocalDateTime.now(),p3,"Camisa nueva vasilona, mas info inbox");

        //Vendedores y sus usuarios y muros

        Usuario usuario1 = new Usuario("jhonjairo777","jj123",null);
        Vendedor vendedor1 = new Vendedor("Jhon jairo","melo","1249284204","direccion1",usuario1);
        usuario1.setPersonaAsociada(vendedor1);
        Muro muro1 = new Muro("1249284204");
        vendedor1.setMuro(muro1);

        Usuario usuario2 = new Usuario("pacho_xy","genaro9865",null);
        Vendedor vendedor2 = new Vendedor("Pacho","Pablo","1398247183","direccion2",usuario2);
        usuario2.setPersonaAsociada(vendedor2);
        Muro muro2 = new Muro("1398247183");
        vendedor2.setMuro(muro2);

        Usuario usuario3 = new Usuario("gildardo","gil0990",null);
        Vendedor vendedor3 = new Vendedor("Gildardo","montoya","862368823","direccion3",usuario3);
        usuario3.setPersonaAsociada(vendedor3);
        Muro muro3 = new Muro("862368823");
        vendedor3.setMuro(muro3);

        //admin

        //        Usuario usuario4 = new Usuario("juanalpargata","8921j",null);
        //        Administrador administrador = new Administrador("juan","zuckerberg","14252324","direccionadmin","01",usuario4);
        //        usuario4.setPersonaAsociada(administrador);

        //agregar usuarios y personas

        marketplace.getUsuarios().add(usuario1);
        marketplace.getVendedores().add(vendedor1);
        marketplace.getUsuarios().add(usuario2);
        marketplace.getVendedores().add(vendedor2);
        marketplace.getUsuarios().add(usuario3);
        marketplace.getVendedores().add(vendedor3);

        //agregar productos

        vendedor1.getListProductos().add(p1);
        vendedor2.getListProductos().add(p2);
        vendedor3.getListProductos().add(p3);

        //agregar publicaciones
        vendedor1.getMuro().getListPublicaciones().add(publicacion1);
        vendedor2.getMuro().getListPublicaciones().add(publicacion2);
        vendedor3.getMuro().getListPublicaciones().add(publicacion3);

        Comentario comentario1 = new Comentario("Detalles y precio",usuario1);
        publicacion1.getListaComentarios().add(comentario1);

        Comentario comentario2 = new Comentario("lo quiero",usuario2);
        publicacion2.getListaComentarios().add(comentario2);

        Comentario comentario3 = new Comentario("Esta feota",usuario3);
        publicacion3.getListaComentarios().add(comentario3);





        return marketplace;

    }


    @Override
    public boolean validarInicioSesion(UsuarioDto usuario) {
        if(marketplace.verificarUsuario(usuario.nombreUsuario(),usuario.contraseña())){
            return true;
        }
        return false;
    }

    @Override
    public boolean agregarPublicacion(PublicacionDto publidto) {
        Publicacion publi = mapper.publicacionDtoToPublicacion(publidto);

        if (marketplace.crearPublicacion(publi)){
            return true;
        }
        return false;
    }


}



