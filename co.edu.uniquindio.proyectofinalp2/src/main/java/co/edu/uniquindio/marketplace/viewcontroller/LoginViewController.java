package co.edu.uniquindio.marketplace.viewcontroller;


import co.edu.uniquindio.marketplace.controller.LoginController;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginViewController {
    static LoginController loginController;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtContraseñaUser;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtNuevaContraseñaUser;

    @FXML
    private TextField txtNuevoNombreUser;

    @FXML
    void onCrearNuevoUsuario(ActionEvent event) {

  }

  @FXML
   void onLogin(ActionEvent event) {

    }



    @FXML
    void initialize() {
        loginController = new LoginController();

        initView();
    }

    private void initView() {

    }

    public static void crearUsuario() throws Exception {
        loginController.crearUsuario();
    }
}

//CONTROLADOR DE LA LOGICA DEL FXML LOGIN (POR TERMINAR)

