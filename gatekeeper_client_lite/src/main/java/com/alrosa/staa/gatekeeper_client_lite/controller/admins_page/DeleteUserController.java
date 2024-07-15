package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * Контроллер для формы "delete_user.fxml"
 */
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
