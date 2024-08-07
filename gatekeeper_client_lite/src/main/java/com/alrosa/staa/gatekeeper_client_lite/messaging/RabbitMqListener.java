package com.alrosa.staa.gatekeeper_client_lite.messaging;

import com.alrosa.staa.gatekeeper_client_lite.controller.operators_page.OperatorsPageController;
import com.alrosa.staa.gatekeeper_client_lite.general.General;
import com.alrosa.staa.gatekeeper_client_lite.general.MessageType;
import com.alrosa.staa.gatekeeper_client_lite.operators_data.LogsData;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;
/**
 * Класс для приёма сообщений
 */
public class RabbitMqListener {
    private Logger logger = Logger.getLogger(RabbitMqListener.class);
    private static RabbitMqListener INSTANCE;
    private Gson gson = new Gson();
    private Image image;
    private ImageView imageView = new ImageView();
    private ConnectionFactory connectionFactory = new ConnectionFactory();
    private RabbitMqListener(){
        connectionFactory.setHost(Variables.rabbit_server_ip);
        connectionFactory.setUsername(Variables.rabbit_server_login);
        connectionFactory.setPassword(Variables.rabbit_server_password);
    }
    public synchronized static RabbitMqListener getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RabbitMqListener();
        }
        return INSTANCE;
    }
    public synchronized void start() throws IOException, TimeoutException {
            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(Variables.queue_receive_server, true, false, false, null);
            logger.info("1. RabbitMQ receiver is started");
            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
                logger.info("Получено сообщение от сервера: " + message);
                General general = null;
                try {
                    general = gson.fromJson(message, General.class);
                    if (general.getMessageType() == MessageType.OPERATOR && general.getPhoto() == null) {
                        OperatorsPageController.observableListLogsData.add(new LogsData(general.getCurrentDate(), general.getControllerName(), String.valueOf(general.getDirection()), general.getUser(), general.getCardId(), String.valueOf(general.isAccess())));
                    } else {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(general.getPhoto());
                        image = new Image(byteArrayInputStream);
                        OperatorsPageController.imageView.setImage(image);
                        OperatorsPageController.imageView.setFitHeight(200);
                        OperatorsPageController.imageView.setFitWidth(200);
                        OperatorsPageController.imageView.setPreserveRatio(true);
                        byteArrayInputStream.close();
                        //OperatorsPageController.hbox.getChildren().add(imageView);
                    }
                    } catch (JsonSyntaxException e) {
                    logger.error("Получен неизвестный тип от сервера");
                }
            };
            channel.basicConsume(Variables.queue_receive_server, true, deliverCallback, consumerTag -> {
            });
    }
}
