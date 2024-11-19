package co.edu.uniquindio.marketplace.model.facade;

import co.edu.uniquindio.marketplace.controller.LoginController;
import co.edu.uniquindio.marketplace.controller.MuroController;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;

public class MarketPlaceFacade {

    private  MuroController muroController;
    private  LoginController loginController;

    public void MarketplaceFacade() {
        loginController = new LoginController();
        muroController = new MuroController();
    }

    // Autentica al usuario y devuelve el vendedor si es válido
    public boolean autenticarVendedor(String nombreUsuario, String contraseña) {
        Persona personaAsociada = null;
        UsuarioDto usuarioDto = new UsuarioDto(nombreUsuario, contraseña, personaAsociada);
        return loginController.validarUsuario(usuarioDto);
    }

    // Obtiene un vendedor según el nombre de usuario y contraseña
    public Vendedor obtenerVendedor(String nombreUsuario, String contraseña) {
        return loginController.obtenerVendedorPorUsuario(nombreUsuario, contraseña);
    }

    //    // Publica un producto en el muro de un vendedor
    //    public void publicarProducto(String nombreUsuario, String contraseña, Producto producto) {
    //        Vendedor vendedor = obtenerVendedor(nombreUsuario, contraseña);
    //        if (vendedor != null) {
    //            muroController.publicarProducto(vendedor, producto);
    //        } else {
    //            System.out.println("Usuario no autenticado o no encontrado.");
    //        }
    //    }

    //    public void comentarProducto(String nombreUsuario, String contraseña, Producto producto, String comentario) {
    //        Vendedor vendedor = obtenerVendedor(nombreUsuario, contraseña);
    //        if (vendedor != null) {
    //            muroController.comentarProducto(vendedor, producto, comentario);
    //        } else {
    //            System.out.println("Usuario no autenticado o no encontrado.");
    //        }
    //    }



}
