package co.edu.uniquindio.marketplace.viewcontroller;


import co.edu.uniquindio.marketplace.controller.LoginController;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import co.edu.uniquindio.marketplace.controller.MuroController;
import co.edu.uniquindio.marketplace.controller.SessionManager;
import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.mapping.mappers.MarketplaceMappingImpl;
import co.edu.uniquindio.marketplace.model.Administrador;
import co.edu.uniquindio.marketplace.model.Persona;
import co.edu.uniquindio.marketplace.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import co.edu.uniquindio.marketplace.model.Usuario;

import javax.swing.*;

public class LoginViewController {
    LoginController loginController;
    private ModelFactory modelFactory;
    private SessionManager sessionManager = SessionManager.getInstance();
    MarketplaceMappingImpl mapping = new MarketplaceMappingImpl();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnLogin;

    @FXML
    private ImageView imgEmailIconRegistro;

    @FXML
    private ImageView imgPasswordIconLogin;

    @FXML
    private ImageView imgPasswordIconRegistro;

    @FXML
    private ImageView imgUserIconLogin;

    @FXML
    private ImageView imgUserIconRegistro;

    @FXML
    private ImageView imgUserIconRegistro2;

    @FXML
    private TextField txtContraseñaUser;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtNuevaCedulaVendedor;

    @FXML
    private TextField txtNuevaContraseñaUser;

    @FXML
    private TextField txtNuevaDireccionVendedor;

    @FXML
    private TextField txtNuevoApellidoVendedor;

    @FXML
    private TextField txtNuevoNombreUser;

    @FXML
    private TextField txtNuevoNombreVendedor;

    @FXML
    void onCrearNuevoUsuario(ActionEvent event) throws IOException {
        agregarVendedor();
    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        login();
    }


    @FXML
    void initialize() {
        initView();
        loginController = new LoginController();
        modelFactory = new ModelFactory();



        assert btnCrearCuenta != null : "fx:id=\"btnCrearCuenta\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgEmailIconRegistro != null : "fx:id=\"imgEmailIconRegistro\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgPasswordIconLogin != null : "fx:id=\"imgPasswordIconLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgPasswordIconRegistro != null : "fx:id=\"imgPasswordIconRegistro\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgUserIconLogin != null : "fx:id=\"imgUserIconLogin\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgUserIconRegistro != null : "fx:id=\"imgUserIconRegistro\" was not injected: check your FXML file 'login-view.fxml'.";
        assert imgUserIconRegistro2 != null : "fx:id=\"imgUserIconRegistro2\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtContraseñaUser != null : "fx:id=\"txtContraseñaUser\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNombreUsuario != null : "fx:id=\"txtNombreUsuario\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevaCedulaVendedor != null : "fx:id=\"txtNuevaCedulaVendedor\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevaContraseñaUser != null : "fx:id=\"txtNuevaContraseñaUser\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevaDireccionVendedor != null : "fx:id=\"txtNuevaDireccionVendedor\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevoApellidoVendedor != null : "fx:id=\"txtNuevoApellidoVendedor\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevoNombreUser != null : "fx:id=\"txtNuevoNombreUser\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtNuevoNombreVendedor != null : "fx:id=\"txtNuevoNombreVendedor\" was not injected: check your FXML file 'login-view.fxml'.";

    }


    private void initView() {

    }

    public ModelFactory getModelFactory() {
        return modelFactory;
    }

    public void setModelFactory(ModelFactory modelFactory) {
        this.modelFactory = modelFactory;
    }

    public static void crearUsuario() throws Exception {
        LoginController.crearUsuario();
    }

    public void login() throws IOException {

        UsuarioDto userDto = crearUserDto();
        Administrador administrador = modelFactory.getMarketplace().getAdministrador();
        boolean esAdmin = Objects.equals(txtNombreUsuario.getText(), "sAdmin") &&
                Objects.equals(txtContraseñaUser.getText(), "admin9182");

        // Si es administrador
        if (esAdmin) {
            JOptionPane.showMessageDialog(null,"Sesion iniciada como administrador. Bienvenido Admin");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/admin-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),601,469);
            Stage stage = new Stage();

            AdminViewController admin = fxmlLoader.getController();

            Stage stageCerrar = (Stage) btnLogin.getScene().getWindow();
            stageCerrar.close();

            stage.setScene(scene);
            stage.setTitle("Admin" );

            stage.show();
            return;
        }

        if (loginController.validarUsuario(userDto)) {
            openWindow2(userDto);
            return;
        }




    }

    public void openWindow2 (UsuarioDto userDto) throws IOException {

        JOptionPane.showMessageDialog(null,"Bienvenido de nuevo a marketplace, "+userDto.nombreUsuario());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/muro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),806,588);
        Stage stage = new Stage();
        //MuroController w2Controller = fxmlLoader.getController();
        MuroViewController muroController = fxmlLoader.getController();
        muroController.setUsuario(userDto);

        stage.setScene(scene);
        stage.setTitle("Sesion iniciada como " + userDto.nombreUsuario());

        Stage stageCerrar = (Stage) btnLogin.getScene().getWindow();
        stageCerrar.close();

        stage.show();





    }

    public void agregarVendedor() throws IOException {
        VendedorDto newVendedorDto = crearVendedorDto();

        if (txtNuevaCedulaVendedor.getText().isEmpty() ||
                txtNuevoNombreUser.getText().isEmpty() ||
                txtNuevoNombreVendedor.getText().isEmpty() ||
                txtNuevoApellidoVendedor.getText().isEmpty() ||
                txtNuevaContraseñaUser.getText().isEmpty() ||
                txtNuevaDireccionVendedor.getText().isEmpty()) {
            mostrarAlertaError();
            return;
        }
        if (loginController.agregarVendedor(newVendedorDto)) {
            JOptionPane.showMessageDialog(null,"Cuenta registrada con éxito. \nBienvenido a marketplace, "+newVendedorDto.usuarioAsociado().getNombreUsuario());
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/muro-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),806,588);
            Stage stage = new Stage();

            MuroViewController muroController = fxmlLoader.getController();
            muroController.setUsuario(mapping.usuarioToUsuarioDto(newVendedorDto.usuarioAsociado()));

            stage.setScene(scene);
            stage.setTitle("Sesion iniciada como " + newVendedorDto.usuarioAsociado().getNombreUsuario());

            Stage stageCerrar = (Stage) btnLogin.getScene().getWindow();
            stageCerrar.close();

            stage.show();



        }
        else {
            JOptionPane.showMessageDialog(null,"El vendedor ingresado ya existe en Marketplace, por favor verifique sus datos.");

        }

    }

    public VendedorDto crearVendedorDto(){
        Usuario usuario = crearNuevoUser();
        return new VendedorDto(txtNuevoNombreVendedor.getText(),
                txtNuevoApellidoVendedor.getText(),
                txtNuevaCedulaVendedor.getText(),
                txtNuevaDireccionVendedor.getText(),usuario);
    }

    public UsuarioDto crearUserDto(){
       // Vendedor v = loginController.obtenerVendedorPorUsuario(txtNombreUsuario.getText(),txtContraseñaUser.getText());
        return new UsuarioDto(txtNombreUsuario.getText(),
                txtContraseñaUser.getText(),null);
    }

    public Usuario crearNuevoUser(){
        return new Usuario(txtNuevoNombreUser.getText(),txtNuevaContraseñaUser.getText(),crearVendedor());

    }

    public Vendedor crearVendedor (){
        return new Vendedor(txtNuevoNombreVendedor.getText(),txtNuevoApellidoVendedor.getText(),txtNuevaCedulaVendedor.getText(),txtNuevaDireccionVendedor.getText(),null);
    }


    /*
     *  Metodo para mostrar una alerta cuando se ingresan campos vacíos
     */
    private void mostrarAlertaError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Error al completar la acción. Por favor, llena los campos indicados para continuar.");
        alert.showAndWait();
    }

    public UsuarioDto getUsuario() {
        return crearUserDto();
    }


}
