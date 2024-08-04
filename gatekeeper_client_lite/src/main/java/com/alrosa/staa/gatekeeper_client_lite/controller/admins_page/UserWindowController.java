package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.response_data.Users;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import org.apache.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
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
    //Создаем экземпляр класса Users
    private Users user;
    //Создаем logger
    private Logger logger = Logger.getLogger(UserWindowController.class);
    @FXML
    private ImageView imageViewPhotoUser = new ImageView();
    private Image image;
    private ByteArrayInputStream byteArrayInputStream;
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
        //Чистим все поля перед открытием формы
        clearFields();
        ResponseEntity<Users> response = null;
        try {
            //Получаем от сервера ответ про пользователя
            response = restTemplate.exchange(url_getUser, HttpMethod.GET, null, Users.class);
            //Записываем полученный ответ в класс User
            user = response.getBody();
            textFieldFirstName.setText(user.getFirst_name());
            textFieldMiddleName.setText(user.getMiddle_name());
            textFieldLastName.setText(user.getLast_name());
            textFieldCompany.setText(user.getCompany());
            textFieldOrganization.setText(user.getOrganization());
            byteArrayInputStream = new ByteArrayInputStream(user.getPhoto());
            image = new Image(byteArrayInputStream);
            imageViewPhotoUser.setPreserveRatio(true);
            imageViewPhotoUser.setFitWidth(135);
            imageViewPhotoUser.setFitHeight(180);
            imageViewPhotoUser.setImage(image);
        } catch (RuntimeException e) {
            logger.error(e);
        }
    }
    private void clearFields() {
        textFieldFirstName.setText("");
        textFieldMiddleName.setText("");
        textFieldLastName.setText("");
        textFieldCompany.setText("");
        textFieldOrganization.setText("");
        imageViewPhotoUser.setImage(new WritableImage(135,180));
        comboBoxAccessControl.getItems().clear();
        textFieldCard.setText("");
    }
}
