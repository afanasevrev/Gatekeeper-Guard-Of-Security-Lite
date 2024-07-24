package com.alrosa.staa.gatekeeper_client_lite.controller.admins_page;

import com.alrosa.staa.gatekeeper_client_lite.admins_data.*;
import com.alrosa.staa.gatekeeper_client_lite.view.AddUserConsole;
import com.alrosa.staa.gatekeeper_client_lite.view.DeleteUserConsole;
import com.alrosa.staa.gatekeeper_client_lite.view.PassOfficeWindowConsole;
import com.alrosa.staa.gatekeeper_client_lite.view.UserWindowConsole;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * Контроллер для формы "admins_page.fxml"
 */
public class AdminsPageController implements Initializable {
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
    //ID пользователя
    public static Long user_id;
    //Вкладка "Пользователи"
    @FXML
    private Tab tabUsers = new Tab();
    @FXML
    private TextField textFieldSearchUser = new TextField();
    @FXML
    private Button buttonSearchUser = new Button();
    @FXML
    private Button buttonUpdateListUsers = new Button();
    @FXML
    private Button buttonOpenPersonalCardUser = new Button();
    @FXML
    private void setButtonOpenPersonalCardUser() throws IOException {
        userWindowConsole.start(stage);
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
    private TableColumn<UsersData, String> tableColumnUserAccessLevel = new TableColumn<UsersData, String>("Уровень доступа");
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
    private Button buttonAddPassOffice = new Button();
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
    private Button buttonDeleteOperator = new Button();
    @FXML
    private Button buttonAddOperator = new Button();
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
    private Button buttonDeleteController = new Button();
    @FXML
    private Button buttonAddController = new Button();
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
    private Button buttonDeleteAccessLevel = new Button();
    @FXML
    private Button buttonAddAccessLevel = new Button();
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
    private Button buttonDeleteCard = new Button();
    @FXML
    private Button buttonAddCard = new Button();
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
    private Button buttonDeleteAdmin = new Button();
    @FXML
    private Button buttonAddAdmins = new Button();
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
        tableColumnUserAccessLevel.setCellValueFactory(cellData -> cellData.getValue().access_levelProperty());

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

    }
}