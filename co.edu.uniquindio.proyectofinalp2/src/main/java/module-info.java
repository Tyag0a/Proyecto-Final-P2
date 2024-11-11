module co.edu.uniquindio.co {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.marketplace to javafx.fxml;
    exports co.edu.uniquindio.marketplace;
    exports co.edu.uniquindio.marketplace.controller;
    opens co.edu.uniquindio.marketplace.controller to javafx.fxml;
    opens co.edu.uniquindio.marketplace.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.marketplace.mapping.dto;
    exports co.edu.uniquindio.marketplace.model;
    exports co.edu.uniquindio.marketplace.factory;
}