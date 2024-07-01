package com.alrosa.staa.gatekeeper_client_lite.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
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
}