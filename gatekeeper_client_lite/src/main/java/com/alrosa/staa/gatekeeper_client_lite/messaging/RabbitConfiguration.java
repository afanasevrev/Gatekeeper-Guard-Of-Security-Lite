package com.alrosa.staa.gatekeeper_client_lite.messaging;
import com.alrosa.staa.gatekeeper_client_lite.variables.Variables;
import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;

public class RabbitConfiguration {
    private Logger logger = Logger.getLogger(RabbitConfiguration.class);
    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(Variables.rabbit_server_ip);
        cachingConnectionFactory.setUsername(Variables.rabbit_server_login);
        cachingConnectionFactory.setPassword(Variables.rabbit_server_password);
        return cachingConnectionFactory;
    }
    @Bean
    public AmqpAdmin amqpAdmin() {
        AmqpAdmin amqpAdmin = new RabbitAdmin(connectionFactory());
        return amqpAdmin;
    }
    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setReplyTimeout(60 * 1000);
        return rabbitTemplate;
    }
    @Bean
    public Queue queueForOperator() {
        return new Queue("Operator");
    }
    @Bean
    public Queue queueForPassOffice() {
        return new Queue("PassOffice");
    }
    @Bean
    public Queue queueForServer() {
        return new Queue("Server");
    }
}
