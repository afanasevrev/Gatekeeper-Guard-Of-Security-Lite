package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.admins_data.*;
import com.alrosa.staa.gatekeeper_client_lite.response_data.Users;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.alrosa.staa.gatekeeper_client_lite.view.*;
import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
/**
 * Контроллер для формы "admins_page.fxml"
 */
public class AdminsPageController implements Initializable {
    //Адрес сервера
    private String server_ip = Variables.server_ip;
    //Порт сервера
    private int server_port = Variables.server_port;
    //Печатаем лог событий
    private Logger logger = Logger.getLogger(AdminsPageController.class);
    //Создаем экземпляр класса RestTemplate
    private RestTemplate restTemplate = new RestTemplate();
    //Создаем экземпляр класса Stage
    private Stage stage = new Stage();
    //Создаем экземпляр класса для изменения пользователя
    private UserWindowConsole userWindowConsole = new UserWindowConsole();
    //Создаем экземпляр класса для удаления пользователя
    private DeleteUserConsole deleteUserConsole = new DeleteUserConsole();
    //Создаем экземпляр класса для добавления пользователя
    private AddUserConsole addUserConsole = new AddUserConsole();
    //Создаем экземпляр класса для карточки инспектора бюро пропусков
    private PassOfficeWindowConsole passOfficeWindowConsole = new PassOfficeWindowConsole();
    //Создаем экземпляр класса для добавления инспектора бюро пропусков
    private AddPassOfficeConsole addPassOfficeConsole = new AddPassOfficeConsole();
    //Создаем экземпляр класса для удаления инспектора бюро пропусков
    private DeletePassOfficeConsole deletePassOfficeConsole = new DeletePassOfficeConsole();
    //Создаем экземпляр класса для карточки оператора
    private OperatorWindowConsole operatorWindowConsole = new OperatorWindowConsole();
    //Создаем экземпляр класса для удаления оператора
    private DeleteOperatorConsole deleteOperatorConsole = new DeleteOperatorConsole();
    //Создаем экземпляр класса для добавления оператора
    private AddOperatorConsole addOperatorConsole = new AddOperatorConsole();
    //Создаем экземпляр класса для карточки контроллера
    private ControllerWindowConsole controllerWindowConsole = new ControllerWindowConsole();
    //Создаем экземпляр класса для удаления контроллера
    private DeleteControllerConsole deleteControllerConsole = new DeleteControllerConsole();
    //Создаем экземпляр класса для добавления контроллера
    private AddControllerConsole addControllerConsole = new AddControllerConsole();
    //Создаем экземпляр класса для добавления уровня доступа
    private AddAccessControlConsole addAccessControlConsole = new AddAccessControlConsole();
    //Создаем экземпляр класса для карточки уровня доступа
    private AccessControlWindowConsole accessControlWindowConsole = new AccessControlWindowConsole();
    //Создаем экземпляр класса для удаления уровня доступа
    private DeleteAccessControlConsole deleteAccessControlConsole = new DeleteAccessControlConsole();
    //Создаем экземпляр класса для добавления карты доступа
    private AddCardConsole addCardConsole = new AddCardConsole();
    //Создаем экземпляр класса для удаления карты доступа
    private DeleteCardConsole deleteCardConsole = new DeleteCardConsole();
    //Создаем экземпляр класса для карты доступа
    private CardWindowConsole cardWindowConsole = new CardWindowConsole();
    //Создаем экземпляр класса для карточки администратора
    private AdminWindowConsole adminWindowConsole = new AdminWindowConsole();
    //Создаем экземпляр класса для удаления администратора
    private DeleteAdminConsole deleteAdminConsole = new DeleteAdminConsole();
    //Создаем экземпляр класса для добавления администратора
    private AddAdminConsole addAdminConsole = new AddAdminConsole();
    //Вкладка "Пользователи"
    //ID пользователя при нажатии на таблице
    public static String valueOfUser;
    @FXML
    private Tab tabUsers = new Tab();
    @FXML
    private TextField textFieldSearchUser = new TextField();
    @FXML
    private Button buttonSearchUser = new Button();
    @FXML
    private Button buttonUpdateListUsers = new Button();
    @FXML
    private void setButtonUpdateListUsers() {
        String url_getListUsers = "http://" + server_ip + ":" + server_port + "/getUsers";
        ResponseEntity<List<Users>> response = null;
        try {
            observableListUsers.clear();
            response = restTemplate.exchange(url_getListUsers, HttpMethod.GET, null, new ParameterizedTypeReference<List<Users>>(){});
            List<Users> users = response.getBody();
            for (Users user: users) {
                observableListUsers.add(new UsersData(String.valueOf(user.getId()), user.getFirst_name(), user.getMiddle_name(), user.getLast_name(), user.getCompany(), user.getOrganization()));
            }
        } catch (RuntimeException e) {
                logger.error(e);
        }
    }
    @FXML
    private Button buttonOpenPersonalCardUser = new Button();
    @FXML
    private void setButtonOpenPersonalCardUser() throws IOException {
        if (valueOfUser != null) {
            userWindowConsole.start(stage);
        }
    }
    @FXML
    private Button buttonDeleteUser = new Button();
    @FXML
    private void setButtonDeleteUser() throws IOException {
        deleteUserConsole.start(stage);
    }
    @FXML
    private Button buttonAddUser = new Button();
    @FXML
    private void setButtonAddUser() throws IOException {
        addUserConsole.start(stage);
    }
    @FXML
    private TableView<UsersData> tableViewUsers = new TableView<UsersData>();
    private ObservableList<UsersData> observableListUsers = FXCollections.<UsersData>observableArrayList();
    @FXML
    private TableColumn<UsersData, String> tableColumnUserId = new TableColumn<UsersData, String>("ID");
    @FXML
    private TableColumn<UsersData, String> tableColumnUserFirstName = new TableColumn<UsersData, String>("Фамилия");
    @FXML
    private TableColumn<UsersData, String> tableColumnUserMiddleName = new TableColumn<UsersData, String>("Имя");
    @FXML
    private TableColumn<UsersData, String> tableColumnUserLastName = new TableColumn<UsersData, String>("Отчество");
    @FXML
    private TableColumn<UsersData, String> tableColumnUserCompany = new TableColumn<UsersData, String>("Компания");
    @FXML
    private TableColumn<UsersData, String> tableColumnUserOrganization = new TableColumn<UsersData, String>("Организация");
    //Вкладка "Бюро пропусков"
    @FXML
    private Tab tabPassOffice = new Tab();
    @FXML
    private TextField textFieldSearchPassOffice = new TextField();
    @FXML
    private Button buttonSearchPassOffice = new Button();
    @FXML
    private Button buttonUpdateListPassOffice = new Button();
    @FXML
    private Button buttonOpenPersonalCardPassOffice = new Button();
    @FXML
    private void setButtonOpenPersonalCardPassOffice() throws IOException {
        passOfficeWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeletePassOffice = new Button();
    @FXML
    private void setButtonDeletePassOffice() throws IOException {
        deletePassOfficeConsole.start(stage);
    }
    @FXML
    private Button buttonAddPassOffice = new Button();
    @FXML
    private void setButtonAddPassOffice() throws IOException {
        addPassOfficeConsole.start(stage);
    }
    @FXML
    private TableView<PassOfficeData> tableViewPassOffice = new TableView<PassOfficeData>();
    private ObservableList<PassOfficeData> observableListPassOffice = FXCollections.<PassOfficeData>observableArrayList();
    @FXML
    private TableColumn<PassOfficeData, String> tableColumnPassOfficeId = new TableColumn<PassOfficeData, String>("ID");
    @FXML
    private TableColumn<PassOfficeData, String> tableColumnPassOfficeFirstName = new TableColumn<PassOfficeData, String>("Фамилия");
    @FXML
    private TableColumn<PassOfficeData, String> tableColumnPassOfficeMiddleName = new TableColumn<PassOfficeData, String>("Имя");
    @FXML
    private TableColumn<PassOfficeData, String> tableColumnPassOfficeLastName = new TableColumn<PassOfficeData, String>("Отчество");
    @FXML
    private TableColumn<PassOfficeData, String> tableColumnPassOfficeLogin = new TableColumn<PassOfficeData, String>("Логин");
    //Вкладка "Операторы"
    @FXML
    private Tab tabOperators = new Tab();
    @FXML
    private TextField textFieldSearchOperator = new TextField();
    @FXML
    private Button buttonSearchOperator = new Button();
    @FXML
    private Button buttonUpdateListOperators = new Button();
    @FXML
    private Button buttonOpenPersonalCardOperator = new Button();
    @FXML
    private void setButtonOpenPersonalCardOperator() throws IOException {
        operatorWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeleteOperator = new Button();
    @FXML
    private void setButtonDeleteOperator() throws IOException {
        deleteOperatorConsole.start(stage);
    }
    @FXML
    private Button buttonAddOperator = new Button();
    @FXML
    private void setButtonAddOperator() throws IOException {
        addOperatorConsole.start(stage);
    }
    @FXML
    private TableView<OperatorsData> tableViewOperators = new TableView<OperatorsData>();
    private ObservableList<OperatorsData> observableListOperators = FXCollections.<OperatorsData>observableArrayList();
    @FXML
    private TableColumn<OperatorsData, String> tableColumnOperatorId = new TableColumn<OperatorsData, String>("ID");
    @FXML
    private TableColumn<OperatorsData, String> tableColumnOperatorFirstName = new TableColumn<OperatorsData, String>("Фамилия");
    @FXML
    private TableColumn<OperatorsData, String> tableColumnOperatorMiddleName = new TableColumn<OperatorsData, String>("Имя");
    @FXML
    private TableColumn<OperatorsData, String> tableColumnOperatorLastName = new TableColumn<OperatorsData, String>("Отчество");
    @FXML
    private TableColumn<OperatorsData, String> tableColumnOperatorLogin = new TableColumn<OperatorsData, String>("Логин");
    //Вкладка "Контроллеры"
    @FXML
    private Tab tabControllers = new Tab();
    @FXML
    private Button buttonUpdateListControllers = new Button();
    @FXML
    private Button buttonOpenPersonalCardController = new Button();
    @FXML
    private void setButtonOpenPersonalCardController() throws IOException {
        controllerWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeleteController = new Button();
    @FXML
    private void setButtonDeleteController() throws IOException {
        deleteControllerConsole.start(stage);
    }
    @FXML
    private Button buttonAddController = new Button();
    @FXML
    private void setButtonAddController() throws IOException {
        addControllerConsole.start(stage);
    }
    @FXML
    private TableView<ControllersData> tableViewControllers = new TableView<ControllersData>();
    private ObservableList<ControllersData> observableListControllers = FXCollections.<ControllersData>observableArrayList();
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllerId = new TableColumn<ControllersData, String>("ID");
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllerName = new TableColumn<ControllersData, String>("Наименование");
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllerIpAddress = new TableColumn<ControllersData, String>("IP - адрес");
    @FXML
    private TableColumn<ControllersData, String> tableColumnControllerStatus = new TableColumn<ControllersData, String>("Online");
    //Вкладка "Уровни доступа"
    @FXML
    private Tab tabAccessLevels = new Tab();
    @FXML
    private Button buttonUpdateListAccessLevels = new Button();
    @FXML
    private Button buttonOpenPersonalCardAccessLevel = new Button();
    @FXML
    private void setButtonOpenPersonalCardAccessLevel() throws IOException {
        accessControlWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeleteAccessLevel = new Button();
    @FXML
    private void setButtonDeleteAccessLevel() throws IOException {
        deleteAccessControlConsole.start(stage);
    }
    @FXML
    private Button buttonAddAccessLevel = new Button();
    @FXML
    private void setButtonAddAccessControl() throws IOException {
        addAccessControlConsole.start(stage);
    }
    @FXML
    private TableView<AccessLevelsData> tableViewAccessLevels = new TableView<AccessLevelsData>();
    private ObservableList<AccessLevelsData> observableListAccessLevels = FXCollections.<AccessLevelsData>observableArrayList();
    @FXML
    private TableColumn<AccessLevelsData, String> tableColumnAccessLevelId = new TableColumn<AccessLevelsData, String>("ID");
    @FXML
    private TableColumn<AccessLevelsData, String> tableColumnAccessLevelName = new TableColumn<AccessLevelsData, String>("Уровень доступа");
    @FXML
    private TableColumn<AccessLevelsData, String> tableColumnAccessLevelControllers = new TableColumn<AccessLevelsData, String>("Контроллеры");
    //Вкладка "Карты"
    @FXML
    private Tab tabCards = new Tab();
    @FXML
    private TextField textFieldSearchCard = new TextField();
    @FXML
    private Button buttonSearchCard = new Button();
    @FXML
    private Button buttonUpdateListCards = new Button();
    @FXML
    private Button buttonOpenPersonalCardCard = new Button();
    @FXML
    private void setButtonOpenPersonalCardCard() throws IOException {
        cardWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeleteCard = new Button();
    @FXML
    private void setButtonDeleteCard() throws IOException {
        deleteCardConsole.start(stage);
    }
    @FXML
    private Button buttonAddCard = new Button();
    @FXML
    private void setButtonAddCard() throws IOException {
        addCardConsole.start(stage);
    }
    @FXML
    private TableView<CardsData> tableViewCards = new TableView<CardsData>();
    private ObservableList<CardsData> observableListCards = FXCollections.<CardsData>observableArrayList();
    @FXML
    private TableColumn<CardsData, String> tableColumnCardId = new TableColumn<CardsData, String>("ID");
    @FXML
    private TableColumn<CardsData, String> tableColumnCardIdentifier = new TableColumn<CardsData, String>("Идентификатор");
    @FXML
    private TableColumn<CardsData, String> tableColumnCardUser = new TableColumn<CardsData, String>("Пользователь");
    @FXML
    private TableColumn<CardsData, String> tableColumnCardAccessLevel = new TableColumn<CardsData, String>("Уровень доступа");
    //Вкладка "Администраторы"
    @FXML
    private Tab tabAdmins = new Tab();
    @FXML
    private TextField textFieldSearchAdmin = new TextField();
    @FXML
    private Button buttonSearchAdmin = new Button();
    @FXML
    private Button buttonUpdateListAdmins = new Button();
    @FXML
    private Button buttonOpenPersonalCardAdmin = new Button();
    @FXML
    private void setButtonOpenPersonalCardAdmin() throws IOException {
        adminWindowConsole.start(stage);
    }
    @FXML
    private Button buttonDeleteAdmin = new Button();
    @FXML
    private void setButtonDeleteAdmin() throws IOException {
       deleteAdminConsole.start(stage);
    }
    @FXML
    private Button buttonAddAdmin = new Button();
    @FXML
    private void setButtonAddAdmin() throws IOException {
        addAdminConsole.start(stage);
    }
    @FXML
    private TableView<AdminsData> tableViewAdmins = new TableView<AdminsData>();
    private ObservableList<AdminsData> observableListAdmins = FXCollections.<AdminsData>observableArrayList();
    @FXML
    private TableColumn<AdminsData, String> tableColumnAdminId = new TableColumn<AdminsData, String>("ID");
    @FXML
    private TableColumn<AdminsData, String> tableColumnAdminFirstName = new TableColumn<AdminsData, String>("Фамилия");
    @FXML
    private TableColumn<AdminsData, String> tableColumnAdminMiddleName = new TableColumn<AdminsData, String>("Имя");
    @FXML
    private TableColumn<AdminsData, String> tableColumnAdminLogin = new TableColumn<AdminsData,String>("Логин");
    @FXML
    private TableColumn<AdminsData, String> tableColumnAdminSuperAdmin = new TableColumn<AdminsData, String>("Суперадмин");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Обновляем таблицу для пользователей
        tableViewUsers.setItems(observableListUsers);
        tableColumnUserId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnUserFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        tableColumnUserMiddleName.setCellValueFactory(cellData -> cellData.getValue().middle_nameProperty());
        tableColumnUserLastName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        tableColumnUserCompany.setCellValueFactory(cellData -> cellData.getValue().companyProperty());
        tableColumnUserOrganization.setCellValueFactory(cellData -> cellData.getValue().organizationProperty());

        //Обновляем таблицу для бюро пропусков
        tableViewPassOffice.setItems(observableListPassOffice);
        tableColumnPassOfficeId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnPassOfficeFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        tableColumnPassOfficeMiddleName.setCellValueFactory(cellData -> cellData.getValue().middle_nameProperty());
        tableColumnPassOfficeLastName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        tableColumnPassOfficeLogin.setCellValueFactory(cellData -> cellData.getValue().loginProperty());

        //Обновляем таблицу для операторов
        tableViewOperators.setItems(observableListOperators);
        tableColumnOperatorId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnOperatorFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        tableColumnOperatorMiddleName.setCellValueFactory(cellData -> cellData.getValue().middle_nameProperty());
        tableColumnOperatorLastName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        tableColumnOperatorLogin.setCellValueFactory(cellData -> cellData.getValue().loginProperty());

        //Обновляем таблицу для контроллеров
        tableViewControllers.setItems(observableListControllers);
        tableColumnControllerId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnControllerIpAddress.setCellValueFactory(cellData -> cellData.getValue().ip_addressProperty());
        tableColumnControllerName.setCellValueFactory(cellData -> cellData.getValue().controller_nameProperty());
        tableColumnControllerStatus.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        //Обновляем таблицу для уровней доступа
        tableViewAccessLevels.setItems(observableListAccessLevels);
        tableColumnAccessLevelId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnAccessLevelName.setCellValueFactory(cellData -> cellData.getValue().access_levelProperty());
        tableColumnAccessLevelControllers.setCellValueFactory(cellData -> cellData.getValue().controllersProperty());

        //Обновляем таблицу для карт доступа
        tableViewCards.setItems(observableListCards);
        tableColumnCardId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnCardIdentifier.setCellValueFactory(cellData -> cellData.getValue().identifierProperty());
        tableColumnCardAccessLevel.setCellValueFactory(cellData -> cellData.getValue().access_levelProperty());
        tableColumnCardUser.setCellValueFactory(cellData -> cellData.getValue().userProperty());

        //Обновляем таблицу для администраторов
        tableViewAdmins.setItems(observableListAdmins);
        tableColumnAdminId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        tableColumnAdminFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        tableColumnAdminMiddleName.setCellValueFactory(cellData-> cellData.getValue().middle_nameProperty());
        tableColumnAdminLogin.setCellValueFactory(cellData -> cellData.getValue().loginProperty());
        tableColumnAdminSuperAdmin.setCellValueFactory(cellData -> cellData.getValue().super_adminProperty());

        //Фиксируем строку в таблице для пользователей
        tableViewUsers.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            try {
                valueOfUser = newSelection.getId();
            } catch (NullPointerException e) {
                valueOfUser = null;
            }
        });
    }
}