package co.edu.uniquindio.marketplace.controller;

import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.services.IUsuarioControllerService;

public class UsuarioController implements IUsuarioControllerService {

    ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }
    public static Usuario crearUsuario(){
        return modelFactory.agregarUsuario();
    }
}

//implementacion de los metodos de IusuarioControllerService, los cuales retornan
//usando la instancia de modelfactory
