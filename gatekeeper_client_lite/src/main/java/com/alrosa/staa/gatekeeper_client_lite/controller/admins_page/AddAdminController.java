package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AddAdminController {
    @FXML
    private TextField textFieldFirstName = new TextField();
    @FXML
    private TextField textFieldMiddleName = new TextField();
    @FXML
    private TextField textFieldLastName = new TextField();
    @FXML
    private TextField textFieldLogin = new TextField();
    @FXML
    private PasswordField passwordFieldPassword = new PasswordField();
    @FXML
    private ComboBox<String> comboBoxSuperAdmin = new ComboBox<String>();
    @FXML
    private Button buttonAdd = new Button();
    @FXML
    private void setButtonAdd() {

    }
}
