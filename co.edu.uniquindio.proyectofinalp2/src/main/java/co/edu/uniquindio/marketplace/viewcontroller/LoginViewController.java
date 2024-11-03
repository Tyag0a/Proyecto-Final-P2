package co.edu.uniquindio.marketplace.viewcontroller;


import co.edu.uniquindio.marketplace.controller.LoginController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
=======
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
>>>>>>> 2aa12561edee2b3a19c4040e762e4376f6431e78
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


        assert btnCrearCuenta != null : "fx:id=\"btnCrearCuenta\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtContraseñaUser != null : "fx:id=\"txtContraseñaUser\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNombreUsuario != null : "fx:id=\"txtNombreUsuario\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevaContraseñaUser != null : "fx:id=\"txtNuevaContraseñaUser\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevoNombreUser != null : "fx:id=\"txtNuevoNombreUser\" was not injected: check your FXML file 'login-view.fxml'.";

    }

    private void initView() {

    }

    public static void crearUsuario() throws Exception {
        LoginController.crearUsuario();
    }

}

<<<<<<< HEAD





=======
//CONTROLADOR DE LA LOGICA DEL FXML LOGIN (POR TERMINAR)
>>>>>>> 2aa12561edee2b3a19c4040e762e4376f6431e78

