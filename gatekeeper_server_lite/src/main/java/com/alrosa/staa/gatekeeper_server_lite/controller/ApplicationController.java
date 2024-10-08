package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.AccessLevelsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.ControllersEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.general.UsersData;
import com.alrosa.staa.gatekeeper_server_lite.service.*;
import com.google.gson.Gson;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ApplicationController {
    private final Gson gson = new Gson();
    private String textUsersData;
    @Autowired
    private AmqpTemplate template;
    @Autowired
    private UsersService usersService;
    @Autowired
    private PhotosService photosService;
    @Autowired
    private CardsService cardsService;
    @Autowired
    private ControllersService controllersService;
    @Autowired
    private AccessLevelsService accessLevelsService;
    @GetMapping("/getUsers")
    private List<UsersEntity> getUsers() {
        return usersService.readUsers();
    }
    @GetMapping("/getUser/{id}")
    private String getUser(@PathVariable String id) {
        UsersEntity usersEntity = usersService.readUser(Long.parseLong(id));
        byte[] photo = photosService.findByUsersEntity(usersEntity).getUserPhoto();
        CardsEntity cardsEntity = cardsService.findByUsersEntity(usersEntity);
        UsersData usersData = new UsersData(usersEntity.getId(), usersEntity.getFirst_name(), usersEntity.getMiddle_name(), usersEntity.getLast_name(), usersEntity.getCompany(), usersEntity.getOrganization(), photo, cardsEntity.getCardId());
        textUsersData = gson.toJson(usersData);
        return textUsersData;
    }
    @GetMapping("/getAccessLevels")
    private List<AccessLevelsEntity>  getAccessLevels() {
        return accessLevelsService.readAccessLevels();
    }
    @GetMapping("/getAccessLevel/{id}")
    private AccessLevelsEntity getAccessLevel(@PathVariable String id) {
        return accessLevelsService.readAccessLevel(Long.parseLong(id));
    }
    @GetMapping("/getControllers")
    private List<ControllersEntity> getControllers() {
        return controllersService.readControllers();
    }
    /**
     * Потом поменяю на @PostMapping
     * @return статус обработки запроса
     */
    @GetMapping("/setController")
    private String setController() {
        return "Контроллер добавлен";
    }
    /**
     * Потом поменяю на @PostMapping
     */
    @GetMapping("/setAccessLevel")
    private String setAccessLevel() {
        return "Уровень доступа добавлен";
    }
}
