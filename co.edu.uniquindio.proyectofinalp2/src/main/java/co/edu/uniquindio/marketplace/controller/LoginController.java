package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.services.IUsuarioControllerService;

public class LoginController implements IUsuarioControllerService {

    static ModelFactory modelFactory;
    public LoginController(){
        modelFactory = ModelFactory.getInstance();
    }
    public static Usuario crearUsuario() throws Exception {
        return ModelFactory.agregarUsuario();
    }
}


