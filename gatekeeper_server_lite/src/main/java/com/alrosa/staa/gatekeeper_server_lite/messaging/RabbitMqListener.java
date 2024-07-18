package com.alrosa.staa.gatekeeper_server_lite.messaging;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@EnableRabbit
@Component
public class RabbitMqListener {
    private Logger logger = Logger.getLogger(RabbitMqListener.class);
    private Gson gson = new Gson();
    private String text;
    @Autowired
    private AmqpTemplate template;
    @RabbitListener(queues = "Operator")
    private void Queue(String message) {
        logger.info(message);
    }
}
