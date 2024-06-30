package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsService;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    private AdminsService adminsService;
    private UsersService usersService;
    public RequestController() {}
    @Autowired
    public RequestController(AdminsService adminsService, UsersService usersService) {
        this.adminsService = adminsService;
        this.usersService = usersService;
    }
    @GetMapping("/")
    private String getInfo() {
        return "Система контроля и управления доступом. Lite версия";
    }
}
