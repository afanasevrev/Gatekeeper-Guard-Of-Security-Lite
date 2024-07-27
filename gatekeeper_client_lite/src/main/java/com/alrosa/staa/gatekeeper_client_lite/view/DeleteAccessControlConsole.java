package com.alrosa.staa.gatekeeper_client_lite.view;

import com.alrosa.staa.gatekeeper_client_lite.ClientApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class DeleteAccessControlConsole {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("admins_page/delete_access_control.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 319, 152);
        stage.setTitle("Удалить уровень доступа");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
