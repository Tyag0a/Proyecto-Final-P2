package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.controller.MuroController;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import co.edu.uniquindio.marketplace.controller.SessionManager;
import co.edu.uniquindio.marketplace.factory.ModelFactory;
import co.edu.uniquindio.marketplace.mapping.dto.PublicacionDto;
import co.edu.uniquindio.marketplace.mapping.dto.UsuarioDto;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import co.edu.uniquindio.marketplace.model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;

public class MuroViewController {
    private UsuarioDto usuario;

    static MuroController muroController;
    static ModelFactory modelFactory;
    private SessionManager sessionManager = SessionManager.getInstance();

    private Image imageSeleccionada;
    private final List<Usuario> usuariosSugeridos = new LinkedList<>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPaneHome;


    @FXML
    private AnchorPane anchorPaneMisPublicaciones;

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
    private Button btnCargarImagen;

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
    private ImageView imgUserIconSugerencia1;

    @FXML
    private ImageView imgUserIconSugerencia2;

    @FXML
    private ImageView imgUserIconSugerencia3;

    @FXML
    private ImageView imgUserIconSugerencia4;

    @FXML
    private ImageView imgUserIconSugerencia5;

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
    private ScrollPane scrollPaneHome;

    @FXML
    private ScrollPane scrollPaneMisPublicaciones;

    @FXML
    private ScrollPane scrollPaneAmigos;

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
    private TextField txtDescripcionPublicacionnueva;

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
    private VBox vboxContainerUsuariosEncontrados;

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
    private Tab tabMiMuro;

    @FXML
    private TabPane tabPanePrincipal;


    @FXML
    void cargarImagenDesdePC(ActionEvent event) {
        chooserImage();

    }


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
        generarUsuariosEncontradosVbox();


    }

    @FXML
    void onCerrarSesion(ActionEvent event) throws IOException {
        cerrarSesion();

    }

    @FXML
    void onCrearPublicacion(ActionEvent event) {
        crearPublicacion();

    }

    @FXML
    void onOpenWindow3(ActionEvent event) {

    }

    @FXML
    void initialize() {

        muroController = new MuroController();
        Vendedor vendedor = sessionManager.getVendedor();

        initView();

        mostrarDataInicializada();
        inicializarSugerencias();

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
        assert imgUserIconSugerencia1 != null : "fx:id=\"imgUserIconSugerencia1\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgUserIconSugerencia2 != null : "fx:id=\"imgUserIconSugerencia2\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgUserIconSugerencia3 != null : "fx:id=\"imgUserIconSugerencia3\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgUserIconSugerencia4 != null : "fx:id=\"imgUserIconSugerencia4\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert imgUserIconSugerencia5 != null : "fx:id=\"imgUserIconSugerencia5\" was not injected: check your FXML file 'muro-view.fxml'.";
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

    public void inicializarSugerencias() {

        Marketplace marketplace = muroController.inicializarData();
        usuariosSugeridos.addAll(marketplace.getUsuarios());
        generarUsuariosSugeridosVBox();
    }

    private void initView() {

        if (usuario != null) {
            Vendedor vendedor = (Vendedor) usuario.personaAsociada();
        } else {
            System.err.println("Usuario no inicializado en MuroController");
        }

    }

    public VBox crearPublicacionVBox() {

        VBox nuevaPublicacionVBox = new VBox();
        nuevaPublicacionVBox.setStyle("-fx-background-color: #bdc3c7");
        nuevaPublicacionVBox.setPrefWidth(742);
        nuevaPublicacionVBox.setPrefHeight(149);

        AnchorPane nuevaPublicacionPane = new AnchorPane();
        nuevaPublicacionPane.setPrefWidth(742);
        nuevaPublicacionPane.setPrefHeight(149);
        nuevaPublicacionPane.setStyle("-fx-background-color: #bdc3c7");
        nuevaPublicacionVBox.getChildren().add(nuevaPublicacionPane);

        ImageView imageViewPublicacion = new ImageView();
        imageViewPublicacion.setLayoutX(14);
        imageViewPublicacion.setLayoutY(13);
        imageViewPublicacion.setFitHeight(110);
        imageViewPublicacion.setFitWidth(191);
        imageViewPublicacion.setPreserveRatio(true);

        if (imageSeleccionada != null) {
            imageViewPublicacion.setImage(imageSeleccionada);
        }

        Label labelNameUser = new Label(usuario.nombreUsuario());
        labelNameUser.setLayoutX(236);
        labelNameUser.setLayoutY(14);
        labelNameUser.setFont(Font.font("Berlin Sans FB", 18));

        Label labelFechaNuevaPublicacion = new Label(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        labelFechaNuevaPublicacion.setLayoutX(356);
        labelFechaNuevaPublicacion.setLayoutY(16);

        Label labelNuevaHoraPublicacion = new Label(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        labelNuevaHoraPublicacion.setLayoutX(466);
        labelNuevaHoraPublicacion.setLayoutY(16);

        Label labelNombreNuevoProducto = new Label(txtNombreNuevoProducto.getText());
        labelNombreNuevoProducto.setLayoutX(542);
        labelNombreNuevoProducto.setLayoutY(16);
        labelNombreNuevoProducto.setFont(Font.font("Berlin Sans FB",14));

        Label labelPrecioNuevoProducto = new Label("Precio: "+ txtPrecioNuevoProducto.getText());
        labelPrecioNuevoProducto.setLayoutX(648);
        labelPrecioNuevoProducto.setLayoutY(16);

        Button buttonLikeNuevaPubli = new Button("Like");
        buttonLikeNuevaPubli.setLayoutX(478);
        buttonLikeNuevaPubli.setLayoutY(81);
        buttonLikeNuevaPubli.setStyle("-fx-background-color: #5d6d7e");
        buttonLikeNuevaPubli.setPrefWidth(37);
        buttonLikeNuevaPubli.setPrefHeight(25);

        TextField txtComentarioNuevaPublicacion = new TextField();
        txtComentarioNuevaPublicacion.setLayoutX(522);
        txtComentarioNuevaPublicacion.setLayoutY(81);
        txtComentarioNuevaPublicacion.setPrefWidth(132);
        txtComentarioNuevaPublicacion.setPrefHeight(25);
        txtComentarioNuevaPublicacion.setPromptText("Escribe un comentario");

        Button buttonComentarNuevaPublicacion = new Button("Comentar");
        buttonComentarNuevaPublicacion.setLayoutX(659);
        buttonComentarNuevaPublicacion.setLayoutY(81);
        buttonComentarNuevaPublicacion.setPrefWidth(69);
        buttonComentarNuevaPublicacion.setPrefHeight(25);
        buttonComentarNuevaPublicacion.setStyle("-fx-background-color: #5d6d7e");

        TextFlow txtFlowDescripcionNuevaPublicacion = new TextFlow();
        txtFlowDescripcionNuevaPublicacion.setLayoutX(229);
        txtFlowDescripcionNuevaPublicacion.setLayoutY(48);
        txtFlowDescripcionNuevaPublicacion.setPrefHeight(68);
        txtFlowDescripcionNuevaPublicacion.setPrefWidth(163);
        Text textoDescripcion = new Text(txtDescripcionPublicacionnueva.getText());
        txtFlowDescripcionNuevaPublicacion.getChildren().add(textoDescripcion);

        //CODIGO DE PRUEBA------------------;

        // ListView para mostrar los comentarios
        ListView<String> listViewComentarios = new ListView<>();
        listViewComentarios.setLayoutX(236);
        listViewComentarios.setLayoutY(120);
        listViewComentarios.setPrefHeight(60);
        listViewComentarios.setPrefWidth(300);

        buttonComentarNuevaPublicacion.setOnAction(e -> {
            String comentario = txtComentarioNuevaPublicacion.getText().trim();
            if (!comentario.isEmpty()) {
                listViewComentarios.getItems().add(usuario.nombreUsuario() + ": " + comentario);
                txtComentarioNuevaPublicacion.clear();
            }
        });

        nuevaPublicacionPane.getChildren().addAll(labelNameUser, labelFechaNuevaPublicacion,
                labelNuevaHoraPublicacion, labelNombreNuevoProducto,
                buttonLikeNuevaPubli, txtComentarioNuevaPublicacion,
                buttonComentarNuevaPublicacion, txtFlowDescripcionNuevaPublicacion,
                labelPrecioNuevoProducto,listViewComentarios);
        nuevaPublicacionPane.getChildren().add(imageViewPublicacion);




        return nuevaPublicacionVBox;
    }


    public void crearPublicacion() {

        if (imageSeleccionada == null) {
            mostrarAlertaInfo("Información", "Imagen requerida", "Por favor, selecciona una imagen del producto para la publicación.");
            return;
        }

        if (txtCategoriaNuevoProducto.getText().isEmpty() ||
                txtNombreNuevoProducto.getText().isEmpty() ||
                txtDescripcionPublicacionnueva.getText().isEmpty() ||
                txtPrecioNuevoProducto.getText().isEmpty()) {
            mostrarAlertaError();
            return;

        }

        if (!esNumeroValido(txtPrecioNuevoProducto.getText())) {
            mostrarAlertaDouble("Advertencia", "Entrada inválida", "Por favor, ingresa un precio válido.");
        }
        muroController.agregarPublicacion(crearPubliDto());

        VBox nuevaPublicacionVBox1 = crearPublicacionVBox();
        VBox nuevaPublicacionVBox2 = crearPublicacionVBox();

        vboxContainerprincipal.getChildren().add(nuevaPublicacionVBox1);
        double alturaActualPrincipal = vboxContainerprincipal.getPrefHeight();
        vboxContainerprincipal.setPrefHeight(alturaActualPrincipal + 210);
        anchorPaneHome.setPrefHeight(vboxContainerprincipal.getPrefHeight());
        scrollPaneHome.setVvalue(1.0);
        vboxContainerprincipal.setSpacing(11);

        vboxContainerMisPublicaciones.getChildren().add(nuevaPublicacionVBox2);
        double alturaActualMisPublicaciones = vboxContainerMisPublicaciones.getPrefHeight();
        vboxContainerMisPublicaciones.setPrefHeight(alturaActualMisPublicaciones + 190);
        anchorPaneMisPublicaciones.setPrefHeight(vboxContainerMisPublicaciones.getPrefHeight());
        scrollPaneMisPublicaciones.setVvalue(1.0);
        vboxContainerMisPublicaciones.setSpacing(11);

        limpiarCampos();
    }


    public void mostrarDataInicializada(){

        Marketplace marketplace = muroController.inicializarData();

        for (Vendedor vendedor : marketplace.getVendedores()){
            Collection<Publicacion> publicaciones = vendedor.getMuro().getListPublicaciones();

            for (Publicacion publicacion : publicaciones){

                VBox nuevaPublicacioninitVBox = new VBox();
                nuevaPublicacioninitVBox.setStyle("-fx-background-color: #bdc3c7");
                nuevaPublicacioninitVBox.setPrefWidth(742);
                nuevaPublicacioninitVBox.setPrefHeight(148);

                AnchorPane nuevaPublicacioninitPane = new AnchorPane();
                nuevaPublicacioninitPane.setPrefWidth(742);
                nuevaPublicacioninitPane.setPrefHeight(148);
                nuevaPublicacioninitPane.setStyle("-fx-background-color: #bdc3c7");
                nuevaPublicacioninitVBox.getChildren().add(nuevaPublicacioninitPane);

                Image imagenProducto = new Image(Objects.
                        requireNonNull(getClass().
                                getResourceAsStream(publicacion.getProductoPublicado().getRutaImagen())));
                ImageView imageinitProducto = new ImageView();
                imageinitProducto.setImage(imagenProducto);
                imageinitProducto.setLayoutX(14);
                imageinitProducto.setLayoutY(13);
                imageinitProducto.setFitHeight(110);
                imageinitProducto.setFitWidth(191);
                imageinitProducto.setPreserveRatio(true);

                Label labelNameUser = new Label();
                labelNameUser.setText(vendedor.getNombre());
                labelNameUser.setLayoutX(236);
                labelNameUser.setLayoutY(14);
                labelNameUser.setFont(Font.font("Berlin Sans FB", 18));

                Label labelFechainitPublicacion = new Label(publicacion.getFechaPublicacion().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                labelFechainitPublicacion.setLayoutX(356);
                labelFechainitPublicacion.setLayoutY(16);

                Label labelinitHoraPublicacion = new Label(publicacion.getHoraPublicacion().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                labelinitHoraPublicacion.setLayoutX(466);
                labelinitHoraPublicacion.setLayoutY(16);

                Label labelNombreinitProducto = new Label(publicacion.getProductoPublicado().getNombre());
                labelNombreinitProducto.setLayoutX(542);
                labelNombreinitProducto.setLayoutY(16);
                labelNombreinitProducto.setFont(Font.font("Berlin Sans FB",14));

                double precio = publicacion.getProductoPublicado().getPrecio();
                String precioString = String.format("%.2f", precio);
                Label labelPrecioinitProducto = new Label("Precio: "+ precioString );
                labelPrecioinitProducto.setLayoutX(648);
                labelPrecioinitProducto.setLayoutY(16);

                Button buttonLikeinitPubli = new Button("Like");
                buttonLikeinitPubli.setLayoutX(478);
                buttonLikeinitPubli.setLayoutY(81);
                buttonLikeinitPubli.setStyle("-fx-background-color: #5d6d7e");
                buttonLikeinitPubli.setPrefWidth(37);
                buttonLikeinitPubli.setPrefHeight(25);

                TextField txtComentarioinitPublicacion = new TextField();
                txtComentarioinitPublicacion.setLayoutX(522);
                txtComentarioinitPublicacion.setLayoutY(81);
                txtComentarioinitPublicacion.setPrefWidth(132);
                txtComentarioinitPublicacion.setPrefHeight(25);
                txtComentarioinitPublicacion.setPromptText("Escribe un comentario");

                Button buttonComentarinitPublicacion = new Button("Comentar");
                buttonComentarinitPublicacion.setLayoutX(659);
                buttonComentarinitPublicacion.setLayoutY(81);
                buttonComentarinitPublicacion.setPrefWidth(69);
                buttonComentarinitPublicacion.setPrefHeight(25);
                buttonComentarinitPublicacion.setStyle("-fx-background-color: #5d6d7e");

                TextFlow txtFlowDescripcioninitPublicacion = new TextFlow();
                txtFlowDescripcioninitPublicacion.setLayoutX(229);
                txtFlowDescripcioninitPublicacion.setLayoutY(48);
                txtFlowDescripcioninitPublicacion.setPrefHeight(68);
                txtFlowDescripcioninitPublicacion.setPrefWidth(163);
                String descripcion = publicacion.getDescripcionPublicacion();
                Text textoDescripcion = new Text(descripcion);
                txtFlowDescripcioninitPublicacion.getChildren().clear();
                txtFlowDescripcioninitPublicacion.getChildren().add(textoDescripcion);

                // ListView para mostrar comentarios iniciales
                ListView<String> listViewComentarios = new ListView<>();
                listViewComentarios.setLayoutX(236);
                listViewComentarios.setLayoutY(120);
                listViewComentarios.setPrefHeight(60);
                listViewComentarios.setPrefWidth(300);
                listViewComentarios.setStyle("-fx-background-color: #ecf0f1; -fx-border-color: #bdc3c7; -fx-padding: 5;");

                // Agregar comentarios iniciales a ListView
                for (Comentario comentario : publicacion.getListaComentarios()) {
                    String comentarioTexto = comentario.getUsuario().getNombreUsuario() + ": " + comentario.getContenido();
                    listViewComentarios.getItems().add(comentarioTexto);
                }

                // Agregar nuevo comentario al ListView al presionar "Comentar"
                buttonComentarinitPublicacion.setOnAction(e -> {
                    String comentario = txtComentarioinitPublicacion.getText().trim();
                    if (!comentario.isEmpty()) {
                        listViewComentarios.getItems().add(vendedor.getUsuarioAsociado().getNombreUsuario() + ": " + comentario);
                        txtComentarioinitPublicacion.clear();
                    }
                });

                nuevaPublicacioninitPane.getChildren().addAll(imageinitProducto,labelNameUser,labelFechainitPublicacion,labelinitHoraPublicacion,labelNombreinitProducto,buttonLikeinitPubli,txtComentarioinitPublicacion,buttonComentarinitPublicacion,txtFlowDescripcioninitPublicacion,labelPrecioinitProducto,listViewComentarios);
                vboxContainerprincipal.getChildren().add(nuevaPublicacioninitVBox);

                double alturaActualPrincipal = vboxContainerprincipal.getPrefHeight();
                vboxContainerprincipal.setPrefHeight(alturaActualPrincipal + 210);
                anchorPaneHome.setPrefHeight(vboxContainerprincipal.getPrefHeight());
                scrollPaneHome.setVvalue(1.0);
                vboxContainerprincipal.setSpacing(11);

            }

        }

    }

    public PublicacionDto crearPubliDto (){
        Producto producto = crearProducto();
        return new PublicacionDto(LocalDate.now(), LocalDateTime.now(),txtDescripcionPublicacionnueva.getText(),producto);
    }

    public VendedorDto crearVendedorDto(){
        return new VendedorDto(usuario.personaAsociada().getNombre(),usuario.personaAsociada().getApellido(),usuario.personaAsociada().getCedula(),usuario.personaAsociada().getCedula(),usuario.personaAsociada().getUsuarioAsociado());
    }

    private Producto crearProducto() {
        String textoPrecio = txtPrecioNuevoProducto.getText();
        double precio;
        precio = Double.parseDouble(textoPrecio);

        return new Producto(txtNombreNuevoProducto.getText(),
                "",txtCategoriaNuevoProducto.getText(),precio, EstadoProducto.PUBLICADO);
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
        initView();
    }

    private void mostrarAlertaError() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info crear publicacion");
        alert.setHeaderText(null);
        alert.setContentText("Por favor completa la informacion solicitada para crear la publicacion.");
        alert.showAndWait();
    }

    private static boolean esNumeroValido(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }


    }

    private static void mostrarAlertaDouble(String titulo, String encabezado, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle(titulo);
        alerta.setHeaderText(encabezado);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }

    private void mostrarAlertaInfo(String titulo, String encabezado, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(encabezado);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public void chooserImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar Imagen para la Publicación");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Archivos de Imagen", "*.png", "*.jpg", "*.jpeg"));

        File archivoSeleccionado = fileChooser.showOpenDialog(null);

        if (archivoSeleccionado != null) {
            imageSeleccionada = new Image(archivoSeleccionado.toURI().toString());
        }
    }

    public void limpiarCampos() {
        txtNombreNuevoProducto.clear();
        txtPrecioNuevoProducto.clear();
        txtDescripcionPublicacionnueva.clear();
        txtCategoriaNuevoProducto.clear();
        imageSeleccionada = null;
    }

    public void cerrarSesion() throws IOException {
        JOptionPane.showMessageDialog(null,"Cerrando sesión.... \nVuelve pronto :(.");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/co/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),601,469);
        Stage stage = new Stage();

        LoginViewController loginViewController = fxmlLoader.getController();

        stage.setScene(scene);
        stage.setTitle("Ingresar a Marketplace" );

        Stage stageCerrar = (Stage) btnCerrarSesion.getScene().getWindow();
        stageCerrar.close();

        stage.show();
    }

    public void generarUsuariosSugeridosVBox(){

        vboxContainerAmigos.getChildren().clear();
        Image iconoUsuario = new Image(getClass().getResource("/co/edu/uniquindio/co/viewmedia/user_icon.png").toString());
        for (Usuario usuario : usuariosSugeridos) {

            HBox hboxUsuario = new HBox();
            hboxUsuario.setSpacing(10);
            hboxUsuario.setStyle("-fx-background-color: #bdc3c7");
            hboxUsuario.setPrefWidth(733);
            hboxUsuario.setPrefHeight(72);

            AnchorPane anchorPaneSugerencia = new AnchorPane();
            anchorPaneSugerencia.setPrefWidth(733);
            anchorPaneSugerencia.setPrefHeight(72);
            anchorPaneSugerencia.setStyle("-fx-background-color: #bdc3c7");

            ImageView imageView = new ImageView(iconoUsuario);
            imageView.setFitWidth(24);
            imageView.setFitHeight(25);
            imageView.setPreserveRatio(true);
            imageView.setLayoutX(38);
            imageView.setLayoutY(24);

            Label labelUsuario = new Label(usuario.getNombreUsuario().toUpperCase());
            labelUsuario.setFont(Font.font("Berlin Sans FB", 13));
            labelUsuario.setLayoutX(84);
            labelUsuario.setLayoutY(27);

            Button botonAgregar = new Button("AGREGAR");
            botonAgregar.setOnAction(e -> agregarVendedorAliado(usuario));
            botonAgregar.setPrefWidth(69);
            botonAgregar.setPrefHeight(25);
            botonAgregar.setLayoutX(283);
            botonAgregar.setLayoutY(24);
            botonAgregar.setStyle("-fx-background-color: #5d6d7e");

            anchorPaneSugerencia.getChildren().addAll(imageView, labelUsuario, botonAgregar);
            hboxUsuario.getChildren().add(anchorPaneSugerencia);
            vboxContainerAmigos.getChildren().add(hboxUsuario);

            double alturaActualPrincipal = vboxContainerAmigos.getPrefHeight();
            vboxContainerAmigos.setPrefHeight(alturaActualPrincipal + 210);
            scrollPaneAmigos.setVvalue(1.0);
            vboxContainerAmigos.setSpacing(11);
        }


    }


    public void agregarVendedorAliado (Usuario usuario){
        JOptionPane.showMessageDialog(null,"AMIGAZO AGREGADO");

    }

    public void generarUsuariosEncontradosVbox () {

        vboxContainerUsuariosEncontrados.getChildren().clear();

        String textoBuscado = txtUsuarioBuscado.getText().trim().toLowerCase();

        txtUsuarioBuscado.clear();

        if (textoBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Por Favor ingresa un nombre de usuario para buscar.");
            return;
        }

        List<Usuario> usuariosEncontrados = usuariosSugeridos.stream()
                .filter(usuario -> usuario.getNombreUsuario().toLowerCase().contains(textoBuscado))
                .toList();

        if (usuariosEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No se encontraron usuarios con ese nombre.");
            return;
        }

        Image iconoUsuario = new Image(getClass().getResource("/co/edu/uniquindio/co/viewmedia/user_icon.png").toString());

        for (Usuario usuario : usuariosEncontrados) {

            HBox hboxUsuario = new HBox();
            hboxUsuario.setSpacing(10);
            hboxUsuario.setStyle("-fx-background-color: #bdc3c7");
            hboxUsuario.setPrefWidth(733);
            hboxUsuario.setPrefHeight(72);

            AnchorPane anchorPaneResultado = new AnchorPane();
            anchorPaneResultado.setPrefWidth(733);
            anchorPaneResultado.setPrefHeight(72);
            anchorPaneResultado.setStyle("-fx-background-color: #bdc3c7");

            ImageView imageView = new ImageView(iconoUsuario);
            imageView.setFitWidth(24);
            imageView.setFitHeight(25);
            imageView.setPreserveRatio(true);
            imageView.setLayoutX(38);
            imageView.setLayoutY(24);

            Label labelUsuario = new Label(usuario.getNombreUsuario().toUpperCase());
            labelUsuario.setFont(Font.font("Berlin Sans FB", 13));
            labelUsuario.setLayoutX(84);
            labelUsuario.setLayoutY(27);

            Button botonAgregar = new Button("AGREGAR");
            botonAgregar.setOnAction(e -> agregarVendedorAliado(usuario));
            botonAgregar.setPrefWidth(69);
            botonAgregar.setPrefHeight(25);
            botonAgregar.setLayoutX(283);
            botonAgregar.setLayoutY(24);
            botonAgregar.setStyle("-fx-background-color: #5d6d7e");

            anchorPaneResultado.getChildren().addAll(imageView, labelUsuario, botonAgregar);
            hboxUsuario.getChildren().add(anchorPaneResultado);
            vboxContainerUsuariosEncontrados.getChildren().add(hboxUsuario);
        }

        double alturaActual = vboxContainerUsuariosEncontrados.getPrefHeight();
        vboxContainerUsuariosEncontrados.setPrefHeight(alturaActual + (usuariosEncontrados.size() * 72) + (usuariosEncontrados.size() - 1) * 11);
        scrollPaneAmigos.setVvalue(1.0);
        vboxContainerUsuariosEncontrados.setSpacing(11);

    }


  }