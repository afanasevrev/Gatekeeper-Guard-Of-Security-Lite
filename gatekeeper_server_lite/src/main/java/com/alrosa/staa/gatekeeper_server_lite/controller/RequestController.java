package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsServiceImpl;
import com.alrosa.staa.gatekeeper_server_lite.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    private BoxService boxService;
    public RequestController() {}
    @Autowired
    public RequestController(BoxService boxService) {
        this.boxService = boxService;
    }
    @GetMapping("/")
    private String getInfo() {
        return "Система контроля и управления доступом. Lite версия";
    }
}
