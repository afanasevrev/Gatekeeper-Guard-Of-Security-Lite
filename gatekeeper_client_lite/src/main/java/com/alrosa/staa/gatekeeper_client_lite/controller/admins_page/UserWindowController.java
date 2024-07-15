package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class UserWindowController {
    @FXML
    private ImageView imageViewPhotoUser = new ImageView();
    @FXML
    private TextField textFieldFirstName = new TextField();
    @FXML
    private TextField textFieldMiddleName = new TextField();
    @FXML
    private TextField textFieldLastName = new TextField();
    @FXML
    private TextField textFieldOrganization = new TextField();
    @FXML
    private TextField textFieldDepartment = new TextField();
    @FXML
    private ComboBox<String> comboBoxAccessControl = new ComboBox<String>();
    @FXML
    private TextField textFieldCard = new TextField();
    @FXML
    private Button buttonLoadPhoto = new Button();
    @FXML
    private Button buttonEdit = new Button();
    @FXML
    private void setButtonLoadPhoto() {

    }
    @FXML
    private void setButtonEdit() {

    }
}
