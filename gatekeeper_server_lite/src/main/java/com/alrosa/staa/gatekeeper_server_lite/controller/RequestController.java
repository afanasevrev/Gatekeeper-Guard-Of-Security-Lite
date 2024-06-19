package com.alrosa.staa.gatekeeper_server_lite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    @GetMapping("/")
    private String getInfo() {
        return "Система контроля и управления доступом. Lite версия";
    }
}
