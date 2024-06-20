package com.alrosa.staa.gatekeeper_client_lite.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdminsPageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}