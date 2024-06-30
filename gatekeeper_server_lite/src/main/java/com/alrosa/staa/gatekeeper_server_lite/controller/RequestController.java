package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsService;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    private Logger logger = Logger.getLogger(RequestController.class);
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
        return "Система контроля и управления доступом. Lite - версия";
    }
}
