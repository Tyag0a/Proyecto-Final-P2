package co.edu.uniquindio.marketplace.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.marketplace.controller.EstadisticasController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class EstadisticasViewController {
    static EstadisticasController estadisticasController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExportarEstadisticas;

    @FXML
    private DatePicker dtFecha;

    @FXML
    void onExportarStats(ActionEvent event) {

    }

    @FXML
    void onMostrarFecha(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnExportarEstadisticas != null : "fx:id=\"btnExportarEstadisticas\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert dtFecha != null : "fx:id=\"dtFecha\" was not injected: check your FXML file 'estadisticas-view.fxml'.";

    }

}

