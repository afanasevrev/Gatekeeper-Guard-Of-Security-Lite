module com.alrosa.staa.gatekeeper_client_lite {
    requires javafx.controls;
    requires javafx.fxml;
    requires log4j;
    requires spring.amqp;
    requires spring.rabbit;
    requires spring.context;
    requires spring.beans;
    requires com.google.gson;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    opens com.alrosa.staa.gatekeeper_client_lite to javafx.fxml;
    exports com.alrosa.staa.gatekeeper_client_lite;
    exports com.alrosa.staa.gatekeeper_client_lite.controller;
    opens com.alrosa.staa.gatekeeper_client_lite.controller to javafx.fxml;
    exports com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;
    opens com.alrosa.staa.gatekeeper_client_lite.controller.admins_page to javafx.fxml;
    opens com.alrosa.staa.gatekeeper_client_lite.controller.operators_page to javafx.fxml;
}