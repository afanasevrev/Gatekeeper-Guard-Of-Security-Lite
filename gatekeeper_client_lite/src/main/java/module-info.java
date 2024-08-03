module com.alrosa.staa.gatekeeper_client_lite {
    requires javafx.controls;
    requires javafx.fxml;
    requires log4j;
    requires com.google.gson;
    requires com.rabbitmq.client;
    requires static lombok;
    requires spring.web;
    requires spring.core;
    opens com.alrosa.staa.gatekeeper_client_lite to javafx.fxml;
    exports com.alrosa.staa.gatekeeper_client_lite;
    exports com.alrosa.staa.gatekeeper_client_lite.controller;
    exports com.alrosa.staa.gatekeeper_client_lite.response_data;
    exports com.alrosa.staa.gatekeeper_client_lite.admins_data;
    opens com.alrosa.staa.gatekeeper_client_lite.controller to javafx.fxml;
    exports com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;
    opens com.alrosa.staa.gatekeeper_client_lite.controller.admins_page to javafx.fxml;
    opens com.alrosa.staa.gatekeeper_client_lite.controller.operators_page to javafx.fxml;
    opens com.alrosa.staa.gatekeeper_client_lite.general to com.google.gson;
}