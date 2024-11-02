package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.controller.EstadisticasController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class EstadisticasViewController {

    EstadisticasController estadisticasController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExportarEstadisticas;

    @FXML
    private DatePicker dtFecha;

    @FXML
    private ImageView imgProductoTop1;

    @FXML
    private ImageView imgProductoTop11;

    @FXML
    private ImageView imgProductoTop2;

    @FXML
    private ImageView imgProductoTop21;

    @FXML
    private ImageView imgProductoTop3;

    @FXML
    private ImageView imgProductoTop31;

    @FXML
    private ImageView imgProductoTop4;

    @FXML
    private ImageView imgProductoTop41;

    @FXML
    private ImageView imgProductoTop5;

    @FXML
    private ImageView imgProductoTop51;

    @FXML
    private Label lblFechaProductoTop1;

    @FXML
    private Label lblFechaProductoTop11;

    @FXML
    private Label lblFechaProductoTop2;

    @FXML
    private Label lblFechaProductoTop21;

    @FXML
    private Label lblFechaProductoTop3;

    @FXML
    private Label lblFechaProductoTop31;

    @FXML
    private Label lblFechaProductoTop4;

    @FXML
    private Label lblFechaProductoTop41;

    @FXML
    private Label lblFechaProductoTop5;

    @FXML
    private Label lblFechaProductoTop51;

    @FXML
    private Label lblNameProductoTop1;

    @FXML
    private Label lblNameProductoTop11;

    @FXML
    private Label lblNameProductoTop2;

    @FXML
    private Label lblNameProductoTop21;

    @FXML
    private Label lblNameProductoTop3;

    @FXML
    private Label lblNameProductoTop31;

    @FXML
    private Label lblNameProductoTop4;

    @FXML
    private Label lblNameProductoTop41;

    @FXML
    private Label lblNameProductoTop5;

    @FXML
    private Label lblNameProductoTop51;

    @FXML
    private Label lblNameUserTop1;

    @FXML
    private Label lblNameUserTop2;

    @FXML
    private Label lblNameUserTop3;

    @FXML
    private Label lblNameUserTop4;

    @FXML
    private Label lblNameUserTop5;

    @FXML
    private Label lblNumeroPublicacionesTop1;

    @FXML
    private Label lblNumeroPublicacionesTop2;

    @FXML
    private Label lblNumeroPublicacionesTop3;

    @FXML
    private Label lblNumeroPublicacionesTop4;

    @FXML
    private Label lblNumeroPublicacionesTop5;

    @FXML
    private Label lblUserProductoTop1;

    @FXML
    private Label lblUserProductoTop11;

    @FXML
    private Label lblUserProductoTop2;

    @FXML
    private Label lblUserProductoTop21;

    @FXML
    private Label lblUserProductoTop3;

    @FXML
    private Label lblUserProductoTop31;

    @FXML
    private Label lblUserProductoTop4;

    @FXML
    private Label lblUserProductoTop41;

    @FXML
    private Label lblUserProductoTop5;

    @FXML
    private Label lblUserProductoTop51;

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
        assert imgProductoTop1 != null : "fx:id=\"imgProductoTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop11 != null : "fx:id=\"imgProductoTop11\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop2 != null : "fx:id=\"imgProductoTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop21 != null : "fx:id=\"imgProductoTop21\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop3 != null : "fx:id=\"imgProductoTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop31 != null : "fx:id=\"imgProductoTop31\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop4 != null : "fx:id=\"imgProductoTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop41 != null : "fx:id=\"imgProductoTop41\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop5 != null : "fx:id=\"imgProductoTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert imgProductoTop51 != null : "fx:id=\"imgProductoTop51\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop1 != null : "fx:id=\"lblFechaProductoTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop11 != null : "fx:id=\"lblFechaProductoTop11\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop2 != null : "fx:id=\"lblFechaProductoTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop21 != null : "fx:id=\"lblFechaProductoTop21\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop3 != null : "fx:id=\"lblFechaProductoTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop31 != null : "fx:id=\"lblFechaProductoTop31\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop4 != null : "fx:id=\"lblFechaProductoTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop41 != null : "fx:id=\"lblFechaProductoTop41\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop5 != null : "fx:id=\"lblFechaProductoTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblFechaProductoTop51 != null : "fx:id=\"lblFechaProductoTop51\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop1 != null : "fx:id=\"lblNameProductoTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop11 != null : "fx:id=\"lblNameProductoTop11\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop2 != null : "fx:id=\"lblNameProductoTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop21 != null : "fx:id=\"lblNameProductoTop21\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop3 != null : "fx:id=\"lblNameProductoTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop31 != null : "fx:id=\"lblNameProductoTop31\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop4 != null : "fx:id=\"lblNameProductoTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop41 != null : "fx:id=\"lblNameProductoTop41\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop5 != null : "fx:id=\"lblNameProductoTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameProductoTop51 != null : "fx:id=\"lblNameProductoTop51\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameUserTop1 != null : "fx:id=\"lblNameUserTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameUserTop2 != null : "fx:id=\"lblNameUserTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameUserTop3 != null : "fx:id=\"lblNameUserTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameUserTop4 != null : "fx:id=\"lblNameUserTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNameUserTop5 != null : "fx:id=\"lblNameUserTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNumeroPublicacionesTop1 != null : "fx:id=\"lblNumeroPublicacionesTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNumeroPublicacionesTop2 != null : "fx:id=\"lblNumeroPublicacionesTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNumeroPublicacionesTop3 != null : "fx:id=\"lblNumeroPublicacionesTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNumeroPublicacionesTop4 != null : "fx:id=\"lblNumeroPublicacionesTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblNumeroPublicacionesTop5 != null : "fx:id=\"lblNumeroPublicacionesTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop1 != null : "fx:id=\"lblUserProductoTop1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop11 != null : "fx:id=\"lblUserProductoTop11\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop2 != null : "fx:id=\"lblUserProductoTop2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop21 != null : "fx:id=\"lblUserProductoTop21\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop3 != null : "fx:id=\"lblUserProductoTop3\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop31 != null : "fx:id=\"lblUserProductoTop31\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop4 != null : "fx:id=\"lblUserProductoTop4\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop41 != null : "fx:id=\"lblUserProductoTop41\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop5 != null : "fx:id=\"lblUserProductoTop5\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert lblUserProductoTop51 != null : "fx:id=\"lblUserProductoTop51\" was not injected: check your FXML file 'estadisticas-view.fxml'.";

    }

}


