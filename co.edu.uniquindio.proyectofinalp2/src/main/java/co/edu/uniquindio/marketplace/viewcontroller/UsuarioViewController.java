package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.controller.UsuarioController;
import javafx.fxml.FXML;


public class UsuarioViewController {
    UsuarioController usuariocontroller;

    @FXML
    void initialize() {
        usuariocontroller = new UsuarioController();

        initView();
    }

    private void initView() {

    }

    public static void crearUsuario(){
        usuarioController.crearUsuario();
    }
}
