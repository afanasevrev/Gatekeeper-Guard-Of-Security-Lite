package com.alrosa.staa.gatekeeper_client_lite.controller;

import com.alrosa.staa.gatekeeper_client_lite.users.OperatorsData;
import com.alrosa.staa.gatekeeper_client_lite.users.PassOfficeData;
import com.alrosa.staa.gatekeeper_client_lite.users.UsersData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
/**
 * Контроллер для формы администратора
 */
public class AdminsPageController {
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
    private Button buttonDeleteUser = new Button();
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
    private TableColumn<UsersData, String> tableColumnAccessLevel = new TableColumn<UsersData, String>("Уровень доступа");
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
    private Button buttonDeletePassOffice = new Button();
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
}