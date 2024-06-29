package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    @GetMapping("/")
    private String getInfo() {
        AdminsServiceImpl adminsService = new AdminsServiceImpl();
        adminsService.createBox(new AdminsEntity("root", "gatekeeper", "Afanasev", "Revoly", "Valerievich", "alrosa", "staa", "software engineer"));
        return "Система контроля и управления доступом. Lite версия";
    }
}
