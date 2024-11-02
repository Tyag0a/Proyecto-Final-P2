package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.controller.MuroController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;

public class MuroViewController {

    static MuroController muroController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarSugerencia1;

    @FXML
    private Button btnAgregarSugerencia2;

    @FXML
    private Button btnAgregarSugerencia3;

    @FXML
    private Button btnAgregarSugerencia4;

    @FXML
    private Button btnAgregarSugerencia5;

    @FXML
    private Button btnBuscarUsuario;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnComentar;

    @FXML
    private Button btnComentar1;

    @FXML
    private Button btnComentarPubli1;

    @FXML
    private Button btnComentarpubli2;

    @FXML
    private Button btnComentarpubli3;

    @FXML
    private Button btnLike;

    @FXML
    private Button btnLike1;

    @FXML
    private Button btnLikePubli1;

    @FXML
    private Button btnLikePubli2;

    @FXML
    private Button btnLikePubli3;

    @FXML
    private Button btnOpenWindow3;

    @FXML
    private Button btnPublicarProducto;

    @FXML
    private HBox hboxSugerencia1;

    @FXML
    private HBox hboxSugerencia2;

    @FXML
    private HBox hboxSugerencia3;

    @FXML
    private HBox hboxSugerencia4;

    @FXML
    private HBox hboxSugerencia5;

    @FXML
    private ImageView imgPublicacion1;

    @FXML
    private ImageView imgPublicacion2;

    @FXML
    private ImageView imgPublicacion21;

    @FXML
    private ImageView imgPublicacion3;

    @FXML
    private ImageView imgPublicacion31;

    @FXML
    private Label lblFechaMyPublicacion1;

    @FXML
    private Label lblFechaMyPublicacion2;

    @FXML
    private Label lblFechaPublicacion1;

    @FXML
    private Label lblFechaPublicacion2;

    @FXML
    private Label lblFechaPublicacion3;

    @FXML
    private Label lblHoraMyPublicacion1;

    @FXML
    private Label lblHoraMyPublicacion2;

    @FXML
    private Label lblHoraPublicacion1;

    @FXML
    private Label lblHoraPublicacion2;

    @FXML
    private Label lblHoraPublicacion3;

    @FXML
    private Label lblMarketplace;

    @FXML
    private Label lblMarketplace1;

    @FXML
    private Label lblMarketplace11;

    @FXML
    private Label lblMarketplace111;

    @FXML
    private Label lblMarketplace1111;

    @FXML
    private Label lblMarketplace11111;

    @FXML
    private Label lblMarketplace111111;

    @FXML
    private Label lblMarketplace1111111;

    @FXML
    private Label lblMarketplace11111111;

    @FXML
    private Label lblMarketplace111111111;

    @FXML
    private Label lblMarketplace1111111111;

    @FXML
    private Label lblNombreMyProducto1;

    @FXML
    private Label lblNombreMyProducto2;

    @FXML
    private Label lblNombreProductoPubli1;

    @FXML
    private Label lblNombreProductoPubli2;

    @FXML
    private Label lblNombreProductoPubli3;

    @FXML
    private Label lblNombreUserMyPublicacion;

    @FXML
    private Label lblNombreUserMyPublicacion2;

    @FXML
    private Label lblNombreUserPublicacion1;

    @FXML
    private Label lblNombreUserPublicacion2;

    @FXML
    private Label lblNombreUserPublicacion3;

    @FXML
    private Label lblUsuarioSugerido1;

    @FXML
    private Label lblUsuarioSugerido2;

    @FXML
    private Label lblUsuarioSugerido3;

    @FXML
    private Label lblUsuarioSugerido4;

    @FXML
    private Label lblUsuarioSugerido5;

    @FXML
    private TextField txtCategoriaNuevoProducto;

    @FXML
    private TextField txtComentario;

    @FXML
    private TextField txtComentario1;

    @FXML
    private TextField txtComentarioPubli1;

    @FXML
    private TextField txtComentarioPubli2;

    @FXML
    private TextField txtComentarioPubli3;

    @FXML
    private TextField txtNombreNuevoProducto;

    @FXML
    private TextField txtPrecioNuevoProducto;

    @FXML
    private TextField txtUsuarioBuscado;

    @FXML
    private TextFlow txtflowDescripcionPublicacion1;

    @FXML
    private TextFlow txtflowDescripcionPublicacion2;

    @FXML
    private TextFlow txtflowDescripcionPublicacion21;

    @FXML
    private TextFlow txtflowDescripcionPublicacion3;

    @FXML
    private TextFlow txtflowDescripcionPublicacion31;

    @FXML
    private VBox vboxContainerAmigos;

    @FXML
    private VBox vboxContainerMisPublicaciones;

    @FXML
    private VBox vboxContainerprincipal;

    @FXML
    private VBox vboxMyPublicacion1;

    @FXML
    private VBox vboxMyPublicacion2;

    @FXML
    private VBox vboxPublicacion1;

    @FXML
    private VBox vboxPublicacion2;

    @FXML
    private VBox vboxPublicacion3;

    @FXML
    void onAgregarAmistad(ActionEvent event) {

    }

    @FXML
    void onAgregarComentario(ActionEvent event) {

    }

    @FXML
    void onAgregarLike(ActionEvent event) {

    }

    @FXML
    void onBuscarUsuario(ActionEvent event) {

    }

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    @FXML
    void onCrearPublicacion(ActionEvent event) {

    }

    @FXML
    void onOpenWindow3(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAgregarSugerencia1 != null : "fx:id=\"btnAgregarSugerencia1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnAgregarSugerencia2 != null : "fx:id=\"btnAgregarSugerencia2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnAgregarSugerencia3 != null : "fx:id=\"btnAgregarSugerencia3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnAgregarSugerencia4 != null : "fx:id=\"btnAgregarSugerencia4\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnAgregarSugerencia5 != null : "fx:id=\"btnAgregarSugerencia5\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnBuscarUsuario != null : "fx:id=\"btnBuscarUsuario\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnCerrarSesion != null : "fx:id=\"btnCerrarSesion\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnComentar != null : "fx:id=\"btnComentar\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnComentar1 != null : "fx:id=\"btnComentar1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnComentarPubli1 != null : "fx:id=\"btnComentarPubli1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnComentarpubli2 != null : "fx:id=\"btnComentarpubli2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnComentarpubli3 != null : "fx:id=\"btnComentarpubli3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnLike != null : "fx:id=\"btnLike\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnLike1 != null : "fx:id=\"btnLike1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnLikePubli1 != null : "fx:id=\"btnLikePubli1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnLikePubli2 != null : "fx:id=\"btnLikePubli2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnLikePubli3 != null : "fx:id=\"btnLikePubli3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnOpenWindow3 != null : "fx:id=\"btnOpenWindow3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnPublicarProducto != null : "fx:id=\"btnPublicarProducto\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert hboxSugerencia1 != null : "fx:id=\"hboxSugerencia1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert hboxSugerencia2 != null : "fx:id=\"hboxSugerencia2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert hboxSugerencia3 != null : "fx:id=\"hboxSugerencia3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert hboxSugerencia4 != null : "fx:id=\"hboxSugerencia4\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert hboxSugerencia5 != null : "fx:id=\"hboxSugerencia5\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgPublicacion1 != null : "fx:id=\"imgPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgPublicacion2 != null : "fx:id=\"imgPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgPublicacion21 != null : "fx:id=\"imgPublicacion21\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgPublicacion3 != null : "fx:id=\"imgPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgPublicacion31 != null : "fx:id=\"imgPublicacion31\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblFechaMyPublicacion1 != null : "fx:id=\"lblFechaMyPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblFechaMyPublicacion2 != null : "fx:id=\"lblFechaMyPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblFechaPublicacion1 != null : "fx:id=\"lblFechaPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblFechaPublicacion2 != null : "fx:id=\"lblFechaPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblFechaPublicacion3 != null : "fx:id=\"lblFechaPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblHoraMyPublicacion1 != null : "fx:id=\"lblHoraMyPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblHoraMyPublicacion2 != null : "fx:id=\"lblHoraMyPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblHoraPublicacion1 != null : "fx:id=\"lblHoraPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblHoraPublicacion2 != null : "fx:id=\"lblHoraPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblHoraPublicacion3 != null : "fx:id=\"lblHoraPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace != null : "fx:id=\"lblMarketplace\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace1 != null : "fx:id=\"lblMarketplace1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace11 != null : "fx:id=\"lblMarketplace11\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace111 != null : "fx:id=\"lblMarketplace111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace1111 != null : "fx:id=\"lblMarketplace1111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace11111 != null : "fx:id=\"lblMarketplace11111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace111111 != null : "fx:id=\"lblMarketplace111111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace1111111 != null : "fx:id=\"lblMarketplace1111111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace11111111 != null : "fx:id=\"lblMarketplace11111111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace111111111 != null : "fx:id=\"lblMarketplace111111111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblMarketplace1111111111 != null : "fx:id=\"lblMarketplace1111111111\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreMyProducto1 != null : "fx:id=\"lblNombreMyProducto1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreMyProducto2 != null : "fx:id=\"lblNombreMyProducto2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreProductoPubli1 != null : "fx:id=\"lblNombreProductoPubli1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreProductoPubli2 != null : "fx:id=\"lblNombreProductoPubli2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreProductoPubli3 != null : "fx:id=\"lblNombreProductoPubli3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreUserMyPublicacion != null : "fx:id=\"lblNombreUserMyPublicacion\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreUserMyPublicacion2 != null : "fx:id=\"lblNombreUserMyPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreUserPublicacion1 != null : "fx:id=\"lblNombreUserPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreUserPublicacion2 != null : "fx:id=\"lblNombreUserPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblNombreUserPublicacion3 != null : "fx:id=\"lblNombreUserPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblUsuarioSugerido1 != null : "fx:id=\"lblUsuarioSugerido1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblUsuarioSugerido2 != null : "fx:id=\"lblUsuarioSugerido2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblUsuarioSugerido3 != null : "fx:id=\"lblUsuarioSugerido3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblUsuarioSugerido4 != null : "fx:id=\"lblUsuarioSugerido4\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert lblUsuarioSugerido5 != null : "fx:id=\"lblUsuarioSugerido5\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtCategoriaNuevoProducto != null : "fx:id=\"txtCategoriaNuevoProducto\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtComentario != null : "fx:id=\"txtComentario\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtComentario1 != null : "fx:id=\"txtComentario1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtComentarioPubli1 != null : "fx:id=\"txtComentarioPubli1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtComentarioPubli2 != null : "fx:id=\"txtComentarioPubli2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtComentarioPubli3 != null : "fx:id=\"txtComentarioPubli3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtNombreNuevoProducto != null : "fx:id=\"txtNombreNuevoProducto\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtPrecioNuevoProducto != null : "fx:id=\"txtPrecioNuevoProducto\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtUsuarioBuscado != null : "fx:id=\"txtUsuarioBuscado\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtflowDescripcionPublicacion1 != null : "fx:id=\"txtflowDescripcionPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtflowDescripcionPublicacion2 != null : "fx:id=\"txtflowDescripcionPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtflowDescripcionPublicacion21 != null : "fx:id=\"txtflowDescripcionPublicacion21\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtflowDescripcionPublicacion3 != null : "fx:id=\"txtflowDescripcionPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert txtflowDescripcionPublicacion31 != null : "fx:id=\"txtflowDescripcionPublicacion31\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxContainerAmigos != null : "fx:id=\"vboxContainerAmigos\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxContainerMisPublicaciones != null : "fx:id=\"vboxContainerMisPublicaciones\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxContainerprincipal != null : "fx:id=\"vboxContainerprincipal\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxMyPublicacion1 != null : "fx:id=\"vboxMyPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxMyPublicacion2 != null : "fx:id=\"vboxMyPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxPublicacion1 != null : "fx:id=\"vboxPublicacion1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxPublicacion2 != null : "fx:id=\"vboxPublicacion2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert vboxPublicacion3 != null : "fx:id=\"vboxPublicacion3\" was not injected: check your FXML file 'muro-view.fxml'.";

    }

}
