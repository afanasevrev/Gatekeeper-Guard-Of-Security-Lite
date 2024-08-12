package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.response_data.AccessLevels;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.apache.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ResourceBundle;
public class AccessControlWindowController implements Initializable {
    //Создаем экземпляр класса RestTemplate
    private RestTemplate restTemplate = new RestTemplate();
    //Создаем url для соединения с сервером
    private String url_GetAccessLevel = "http://" + Variables.server_ip + ":" + Variables.server_port + "/getAccessLevel/" + AdminsPageController.valueOfAccessLevel;
    private Logger logger = Logger.getLogger(AccessControlWindowController.class);
    //Создаем экземпляр класса AccessLevels
    private AccessLevels accessLevel;
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
        ResponseEntity<AccessLevels> response = null;
        try {
            response = restTemplate.exchange(url_GetAccessLevel, HttpMethod.GET, null, AccessLevels.class);
            
        } catch (RuntimeException e) {
            logger.error(e);
        }
    }
    /**
     * Метод позволяет чистить все поля перед открытием формы уровня доступа
     */
    private void clearFields() {
        textFieldAccessControl.setText("");
        textAreaControllers.setText("");
    }
}
