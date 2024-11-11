package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.model.Vendedor;
import co.edu.uniquindio.marketplace.services.IUsuarioControllerService;

public class LoginController implements IUsuarioControllerService {

    private SessionManager sessionManager = SessionManager.getInstance();

    ModelFactory modelFactory;
    public LoginController(){
        modelFactory = ModelFactory.getInstance();
    }
    public static Usuario crearUsuario() throws Exception {
        return ModelFactory.agregarUsuario();
    }

    @Override
    public boolean validarUsuario(UsuarioDto usuario) {
        if(modelFactory.validarInicioSesion(usuario)){
            return true;
        }
        return false;
    }

    @Override
    public UsuarioDto getUsuario(UsuarioDto usuario) {
        return null;
    }

    @Override
    public Usuario getUsuarioNormal(Usuario usuario) {
        return null;
    }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        return modelFactory.agregarVendedor(vendedorDto);
    }

    public Vendedor obtenerVendedorPorUsuario(String nombreUsuario, String contraseña) {
        for (Vendedor vendedor : modelFactory.inicializarDatos().getVendedores()) {
            if (vendedor.getUsuarioAsociado().getContraseña().equals(contraseña)) {
                return vendedor;
                }
            }
        return null;

    }

}





