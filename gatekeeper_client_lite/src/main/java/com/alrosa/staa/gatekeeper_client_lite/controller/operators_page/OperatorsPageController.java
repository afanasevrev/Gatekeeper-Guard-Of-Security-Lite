package com.alrosa.staa.gatekeeper_client_lite.controller.operators_page;

import com.alrosa.staa.gatekeeper_client_lite.operators_data.LogsData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
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
    private HBox hbox = new HBox();
    @FXML
    private TableView<LogsData> tableViewLogsData = new TableView<LogsData>();
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
    }
}
