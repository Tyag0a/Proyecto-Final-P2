package co.edu.uniquindio.marketplace.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;

public class AdminViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCerrarAdmin;

    @FXML
    private Button btnOpenW1;

    @FXML
    private Button btnOpenW2;

    @FXML
    void onOpenW2(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null,"Abriendo ventana 2....");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/estadisticas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),601,469);
        Stage stage = new Stage();

        LoginViewController loginViewController = fxmlLoader.getController();

        stage.setScene(scene);
        stage.setTitle("Ingresar a Marketplace" );

        Stage stageCerrar = (Stage) btnCerrarAdmin.getScene().getWindow();
        stageCerrar.close();

        stage.show();

    }

    @FXML
    void onOpenw1(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null,"Abriendo la ventana 1...");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/muro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),615,428);
        Stage stage = new Stage();

        LoginViewController loginViewController = fxmlLoader.getController();

        stage.setScene(scene);
        stage.setTitle("Ingresar a Marketplace" );

        Stage stageCerrar = (Stage) btnCerrarAdmin.getScene().getWindow();
        stageCerrar.close();

        stage.show();

    }

    @FXML
    void openLogin(ActionEvent event) throws IOException {

        JOptionPane.showMessageDialog(null,"Cerrando sesión Como Admin.... \nVuelve pronto, admin :(.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),601,469);
        Stage stage = new Stage();

        LoginViewController loginViewController = fxmlLoader.getController();

        stage.setScene(scene);
        stage.setTitle("Ingresar a Marketplace" );

        Stage stageCerrar = (Stage) btnCerrarAdmin.getScene().getWindow();
        stageCerrar.close();

        stage.show();

    }

    @FXML
    void initialize() {
        assert btnCerrarAdmin != null : "fx:id=\"btnCerrarAdmin\" was not injected: check your FXML file 'admin-view.fxml'.";
        assert btnOpenW1 != null : "fx:id=\"btnOpenW1\" was not injected: check your FXML file 'admin-view.fxml'.";
        assert btnOpenW2 != null : "fx:id=\"btnOpenW2\" was not injected: check your FXML file 'admin-view.fxml'.";

    }

}
