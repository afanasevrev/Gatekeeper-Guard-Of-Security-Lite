package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
public class AccessControlWindowController implements Initializable {
    //Создаем url для соединения с сервером
    private String getAccessLevel = "http://" + Variables.server_ip + ":" + Variables.server_port + "/getAccessLevel/" + AdminsPageController.valueOfAccessLevel;
    @FXML
    private TextField textFieldAccessControl = new TextField();
    @FXML
    private TextArea textAreaControllers = new TextArea();
    @FXML
    private Button buttonAddDelete = new Button();
    @FXML
    private Button buttonEdit = new Button();
    @FXML
    private void setButtonAddDelete() {}
    @FXML
    private void setButtonEdit() {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Чистим все поля перед открытием формы
        clearFields();

    }
    /**
     * Метод позволяет чистить все поля перед открытием формы уровня доступа
     */
    private void clearFields() {
        textFieldAccessControl.setText("");
        textAreaControllers.setText("");
    }
}
