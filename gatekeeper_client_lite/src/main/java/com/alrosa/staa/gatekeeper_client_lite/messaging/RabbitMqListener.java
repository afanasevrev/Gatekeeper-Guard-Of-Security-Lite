package com.alrosa.staa.gatekeeper_client_lite.messaging;

import com.alrosa.staa.gatekeeper_client_lite.general.General;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.apache.log4j.Logger;
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
                logger.info(general.getCard_identifier());
            } catch (JsonSyntaxException e) {
                logger.error("Получен неизвестный тип от сервера");
                general = new General();
            }
        };
        channel.basicConsume(Variables.queue_receive_server, true, deliverCallback, consumerTag -> {});
    }
}
