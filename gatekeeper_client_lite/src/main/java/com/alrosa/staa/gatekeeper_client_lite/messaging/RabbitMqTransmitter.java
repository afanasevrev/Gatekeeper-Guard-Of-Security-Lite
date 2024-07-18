package com.alrosa.staa.gatekeeper_client_lite.messaging;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Класс отвечает за отправку сообщений на сервер
 */
public class RabbitMqTransmitter {
    private static RabbitMqListener INSTANCE;
    private ConnectionFactory connectionFactory = new ConnectionFactory();
    private Logger logger = Logger.getLogger(RabbitMqTransmitter.class);
    private Gson gson = new Gson();
    private RabbitMqTransmitter() {}
    public synchronized static RabbitMqListener getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RabbitMqListener();
        }
        return INSTANCE;
    }

    public synchronized void sendMessage(String text) throws IOException, TimeoutException {
        connectionFactory.setHost(Variables.rabbit_server_ip);
        connectionFactory.setUsername(Variables.rabbit_server_login);
        connectionFactory.setPassword(Variables.rabbit_server_password);
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

    }
}
