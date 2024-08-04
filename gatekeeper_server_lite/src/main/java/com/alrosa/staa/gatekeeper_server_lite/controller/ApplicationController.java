package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.PhotosService;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ApplicationController {
    @Autowired
    private AmqpTemplate template;
    @Autowired
    private UsersService usersService;
    @Autowired
    private PhotosService photosService;
    @GetMapping("/getUsers")
    private List<UsersEntity> getUsers() {
        return usersService.readUsers();
    }
    @GetMapping("/getUser/{id}")
    private UsersEntity getUser(@PathVariable String id) {
        return usersService.readUser(Long.parseLong(id));
    }
}