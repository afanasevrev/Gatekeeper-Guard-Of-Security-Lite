package com.alrosa.staa.gatekeeper_client_lite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class ClientApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("admins_page/admins_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 200);
        stage.setTitle("Войти");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}