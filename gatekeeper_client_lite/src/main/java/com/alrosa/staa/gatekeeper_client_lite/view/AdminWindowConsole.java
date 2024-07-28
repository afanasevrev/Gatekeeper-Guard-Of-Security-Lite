package com.alrosa.staa.gatekeeper_client_lite.view;

import com.alrosa.staa.gatekeeper_client_lite.ClientApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class AdminWindowConsole {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("admins_page/admin_window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 225, 325);
        stage.setTitle("Карточка администратора");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
