package com.alrosa.staa.gatekeeper_client_lite.messaging;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * Класс отвечает за отправку сообщений на сервер
 */
public class RabbitMqTransmitter {
    private static RabbitMqTransmitter INSTANCE;
    private ConnectionFactory connectionFactory = new ConnectionFactory();
    private Logger logger = Logger.getLogger(RabbitMqTransmitter.class);
    private RabbitMqTransmitter() {
        connectionFactory.setHost(Variables.rabbit_server_ip);
        connectionFactory.setUsername(Variables.rabbit_server_login);
        connectionFactory.setPassword(Variables.rabbit_server_password);
    }
    public synchronized static RabbitMqTransmitter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RabbitMqTransmitter();
        }
        return INSTANCE;
    }
    /**
     * Метод отправляет на сервер сообщение
     * @param text
     * @throws IOException
     * @throws TimeoutException
     */
    public synchronized void sendMessage(String text) throws IOException, TimeoutException {
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.basicPublish("", Variables.queue_send_server, null, text.getBytes(StandardCharsets.UTF_8));
    }
}
