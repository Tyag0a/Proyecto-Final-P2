package co.edu.uniquindio.marketplace.viewcontroller;


import co.edu.uniquindio.marketplace.controller.LoginController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginViewController {
    LoginController loginController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnLogin;

    @FXML
    private ImageView imgPasswordIconLogin;

    @FXML
    private ImageView imgPasswordIconRegistro;

    @FXML
    private ImageView imgUserIconLogin;

    @FXML
    private ImageView imgUserIconRegistro;

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
        assert imgPasswordIconLogin != null : "fx:id=\"imgPasswordIconLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgPasswordIconRegistro != null : "fx:id=\"imgPasswordIconRegistro\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgUserIconLogin != null : "fx:id=\"imgUserIconLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgUserIconRegistro != null : "fx:id=\"imgUserIconRegistro\" was not injected: check your FXML file 'login-view.fxml'.";
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
