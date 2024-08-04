package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.response_data.Users;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер для формы "user_window.fxml"
 */
public class UserWindowController implements Initializable {
    //Создаем экземпляр класса RestTemplate
    private RestTemplate restTemplate = new RestTemplate();
    //Создаем URL
    private String url_getUser = "http://" + Variables.server_ip + ":" + Variables.server_port + "/getUser/" + AdminsPageController.valueOfUser;
    //Создаем logger
    private Logger logger = Logger.getLogger(UserWindowController.class);
    @FXML
    private ImageView imageViewPhotoUser = new ImageView();
    @FXML
    private TextField textFieldFirstName = new TextField();
    @FXML
    private TextField textFieldMiddleName = new TextField();
    @FXML
    private TextField textFieldLastName = new TextField();
    @FXML
    private TextField textFieldCompany = new TextField();
    @FXML
    private TextField textFieldOrganization = new TextField();
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ResponseEntity<Users> response = null;
        try {
            response = restTemplate.exchange(url_getUser, HttpMethod.GET, null, Users.class);
            logger.info(response.getBody().getMiddle_name());
        } catch (RuntimeException e) {

        }
    }
}
