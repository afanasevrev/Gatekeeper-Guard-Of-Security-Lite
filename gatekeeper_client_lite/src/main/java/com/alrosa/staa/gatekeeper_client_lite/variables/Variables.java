package com.alrosa.staa.gatekeeper_client_lite.variables;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Здесь будем хранить статические переменные
 */
public class Variables {
    public static String server_ip;
    public static int server_port;
    public static String rabbit_server_ip;
    public static String rabbit_server_login;
    public static String rabbit_server_password;
    static {
        Properties properties = new Properties();
        String propertiesFilePath = "src/main/resources/com/alrosa/staa/gatekeeper_client_lite/settings.properties";
        try {
            InputStream inputStream = new FileInputStream(propertiesFilePath);
            properties.load(inputStream);
            server_ip = properties.getProperty("server_ip");
            server_port = Integer.parseInt(properties.getProperty("server_port"));
            rabbit_server_ip = properties.getProperty("rabbit_server_ip");
            rabbit_server_login = properties.getProperty("rabbit_server_login");
            rabbit_server_password = properties.getProperty("rabbit_server_password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
