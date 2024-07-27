package com.alrosa.staa.gatekeeper_client_lite.view;

import com.alrosa.staa.gatekeeper_client_lite.ClientApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class AddOperatorConsole {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("admins_page/add_operator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 225, 292);
        stage.setTitle("Добавить оператора");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
