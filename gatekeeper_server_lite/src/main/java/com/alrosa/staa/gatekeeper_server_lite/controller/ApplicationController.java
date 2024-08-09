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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class ApplicationController {
    private Gson gson = new Gson();
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
    /**
     * Потом поменяю на @PostMapping
     * @return
     */
    @GetMapping("/setController")
    private String setController() {
        ControllersEntity controllersEntity = new ControllersEntity();
        controllersEntity.setId(2L);
        controllersEntity.setControllerName("Пожарный выход №2");
        controllersEntity.setIpAddress("10.2.221.25");
        controllersService.createController(controllersEntity);
        return "Контроллер добавлен";
    }
    /**
     * Потом поменяю на @PostMapping
     * @return
     */
    @GetMapping("/setAccessLevel")
    private String setAccessLevel() {
        //AccessLevelsEntity accessLevelsEntity = new AccessLevelsEntity();
        //accessLevelsEntity.setId(1L);
        //accessLevelsEntity.setAccessLevelName("Вездеход");
        //accessLevelsService.createAccessLevel(accessLevelsEntity);

        //Set<ControllersEntity> controllersEntitySet = new HashSet<>();
        //controllersEntitySet.add(controllersService.readController(1L));
        //controllersEntitySet.add(controllersService.readController(2L));
        //AccessLevelsEntity newAccess = accessLevelsService.readAccessLevel(1L);
        //newAccess.setControllers(controllersEntitySet);
        //accessLevelsService.updateAccessLevel(newAccess, 1L);
        return "Уровень доступа добавлен";
    }
}
