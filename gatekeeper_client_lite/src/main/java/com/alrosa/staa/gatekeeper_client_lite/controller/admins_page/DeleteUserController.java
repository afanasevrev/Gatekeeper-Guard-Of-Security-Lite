package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class DeleteUserController {
    @FXML
    private Button buttonDeleteUser;
    @FXML
    private Button buttonCancel;
    @FXML
    private void setButtonDeleteUser() {

    }
    @FXML
    private void setButtonCancel() {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }
}
