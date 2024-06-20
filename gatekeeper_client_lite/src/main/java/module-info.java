module com.alrosa.staa.gatekeeper_client_lite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alrosa.staa.gatekeeper_client_lite to javafx.fxml;
    exports com.alrosa.staa.gatekeeper_client_lite;
}