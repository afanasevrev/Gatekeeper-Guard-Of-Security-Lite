package com.alrosa.staa.gatekeeper_client_lite.messaging;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
/**
 * Класс отвечает за отправку сообщений на сервер
 */
public class RabbitMqTransmitter {
    private static RabbitMqListener INSTANCE;
    private Logger logger = Logger.getLogger(RabbitMqTransmitter.class);
    private Gson gson = new Gson();
    private RabbitMqTransmitter() {}
    public synchronized static RabbitMqListener getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RabbitMqListener();
        }
        return INSTANCE;
    }
    
}
