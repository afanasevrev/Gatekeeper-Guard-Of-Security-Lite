package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.admins_data.ControllersData;
import com.alrosa.staa.gatekeeper_client_lite.response_data.AccessLevels;
import com.alrosa.staa.gatekeeper_client_lite.response_data.Controllers;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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
    //Объекты для формы добавления и удаления уровней доступа
    @FXML
    private TableView<ControllersData> TableViewControllersLeft = new TableView<ControllersData>();
    private ObservableList<ControllersData> observableListControllersLeft = FXCollections.<ControllersData>observableArrayList();
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllersLeftId = new TableColumn<ControllersData, String>("ID");
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllersLeftName = new TableColumn<ControllersData, String>("Наименование");
    @FXML
    private TableView<ControllersData> TableViewControllersRight = new TableView<ControllersData>();
    private ObservableList<ControllersData> observableListControllersRight = FXCollections.<ControllersData>observableArrayList();
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllersRightId = new TableColumn<ControllersData, String>("ID");
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllersRightName = new TableColumn<ControllersData, String>("Наименование");
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Чистим все поля перед открытием формы
        clearFields();
        ResponseEntity<AccessLevels> response = null;
        try {
            response = restTemplate.exchange(url_GetAccessLevel, HttpMethod.GET, null, AccessLevels.class);
            accessLevel = response.getBody();
            textFieldAccessControl.setText(accessLevel.getAccessLevelName());
            for (Controllers controller: accessLevel.getControllers()) {
                textAreaControllers.appendText(controller.getControllerName() + "\n");
            }
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
