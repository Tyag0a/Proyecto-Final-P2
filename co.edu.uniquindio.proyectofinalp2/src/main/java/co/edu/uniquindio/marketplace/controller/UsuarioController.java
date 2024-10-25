package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.model.Usuario;
import co.edu.uniquindio.marketplace.services.IUsuarioControllerService;

public class UsuarioController implements IUsuarioControllerService {

    static ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }
    public static Usuario crearUsuario(){
        return modelFactory.agregarUsuario();
    }
}


