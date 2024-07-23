package com.alrosa.staa.gatekeeper_client_lite;

import com.alrosa.staa.gatekeeper_client_lite.messaging.RabbitMqListener;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
public class ClientApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("admins_page/admins_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Войти");
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) throws IOException, TimeoutException {
        BasicConfigurator.configure();
        RabbitMqListener rabbitMqListener = RabbitMqListener.getInstance();
        rabbitMqListener.start();
        launch();
    }
}