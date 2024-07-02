package com.alrosa.staa.gatekeeper_client_lite.controller;

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

}