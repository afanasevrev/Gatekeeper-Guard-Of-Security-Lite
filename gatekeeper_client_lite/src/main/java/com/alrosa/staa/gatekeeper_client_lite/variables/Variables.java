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
    static {
        Properties properties = new Properties();
        String propertiesFilePath = "settings.properties";
        try {
            InputStream inputStream = new FileInputStream(propertiesFilePath);
            properties.load(inputStream);
            server_ip = properties.getProperty("server_ip");
            server_port = Integer.parseInt(properties.getProperty("server_port"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
