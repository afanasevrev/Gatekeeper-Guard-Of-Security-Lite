package com.alrosa.staa.gatekeeper_client_lite.controller.operators_page;

import com.alrosa.staa.gatekeeper_client_lite.operators_data.LogsData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;
public class OperatorsPageController implements Initializable {
    //Вертикальный сплиттер
    @FXML
    private SplitPane splitPaneVertical = new SplitPane();
    @FXML
    public static HBox hbox = new HBox();
    @FXML
    private TableView<LogsData> tableViewLogsData = new TableView<LogsData>();
    public static ObservableList<LogsData> observableListLogsData = FXCollections.<LogsData>observableArrayList();
    @FXML
    private TableColumn<LogsData, String> tableColumnDate = new TableColumn<LogsData, String>("Дата");
    @FXML
    private TableColumn<LogsData, String> tableColumnController = new TableColumn<LogsData, String>("Контроллер");
    @FXML
    private TableColumn<LogsData, String> tableColumnDirection = new TableColumn<LogsData, String>("Направление");
    @FXML
    private TableColumn<LogsData, String> tableColumnUser = new TableColumn<LogsData, String>("Пользователь");
    @FXML
    private TableColumn<LogsData, String> tableColumnIdentifier = new TableColumn<LogsData, String>("Идентификатор карты");
    @FXML
    private TableColumn<LogsData, String> tableColumnAccess = new TableColumn<LogsData, String>("Доступ");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Выравниваем вертикальный сплиттер при изменении размера окна оператора
        AnchorPane.setBottomAnchor(splitPaneVertical, 0.0);
        AnchorPane.setTopAnchor(splitPaneVertical, 0.0);
        AnchorPane.setRightAnchor(splitPaneVertical, 0.0);
        AnchorPane.setLeftAnchor(splitPaneVertical, 0.0);
        //Выравниваем Hbox при изменении окна оператора
        AnchorPane.setBottomAnchor(hbox, 0.0);
        AnchorPane.setTopAnchor(hbox, 0.0);
        AnchorPane.setRightAnchor(hbox, 0.0);
        AnchorPane.setLeftAnchor(hbox, 0.0);
        //Выравниваем TableView при изменении окна оператора
        AnchorPane.setBottomAnchor(tableViewLogsData, 0.0);
        AnchorPane.setTopAnchor(tableViewLogsData, 0.0);
        AnchorPane.setRightAnchor(tableViewLogsData, 0.0);
        AnchorPane.setLeftAnchor(tableViewLogsData, 0.0);
        //Позиционируем таблицу
        tableViewLogsData.setItems(observableListLogsData);
        tableColumnDate.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        tableColumnController.setCellValueFactory(cellData -> cellData.getValue().controllerNameProperty());
        tableColumnDirection.setCellValueFactory(cellData -> cellData.getValue().directionProperty());
        tableColumnUser.setCellValueFactory(cellData -> cellData.getValue().userProperty());
        tableColumnIdentifier.setCellValueFactory(cellData -> cellData.getValue().identifierProperty());
        tableColumnAccess.setCellValueFactory(cellData -> cellData.getValue().accessProperty());
        //Привязываем столбец по правому краю таблицы
        tableColumnAccess.prefWidthProperty().bind(tableViewLogsData.widthProperty().subtract(619));
        tableViewLogsData.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

    }
}
