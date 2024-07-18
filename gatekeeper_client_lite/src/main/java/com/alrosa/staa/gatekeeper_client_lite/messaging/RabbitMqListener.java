package com.alrosa.staa.gatekeeper_client_lite.messaging;

import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import com.google.gson.Gson;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.log4j.Logger;
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
}
