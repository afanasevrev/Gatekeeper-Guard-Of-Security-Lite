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
    private Button buttonSearch = new Button();
    @FXML
    private Button buttonUpdateList = new Button();
    @FXML
    private Button buttonOpenPersonalCard = new Button();
    @FXML
    private Button buttonDeleteUser = new Button();
}