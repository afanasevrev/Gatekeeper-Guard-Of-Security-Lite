package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.general.General;
import com.alrosa.staa.gatekeeper_server_lite.service.*;
import com.google.gson.Gson;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    @Autowired
    private AmqpTemplate template;
    private Gson gson = new Gson();
    private String text;
    private Logger logger = Logger.getLogger(RequestController.class);
    private AdminsService adminsService;
    private UsersService usersService;
    private InspectorsService inspectorsService;
    private OperatorsService operatorsService;
    private AccessLevelsService accessLevelsService;
    private CardsService cardsService;
    private PhotosService photosService;
    public RequestController() {}
    @Autowired
    public RequestController(AdminsService adminsService, UsersService usersService, InspectorsService inspectorsService, OperatorsService operatorsService, AccessLevelsService accessLevelsService, CardsService cardsService, PhotosService photosService) {
        this.adminsService = adminsService;
        this.usersService = usersService;
        this.inspectorsService = inspectorsService;
        this.operatorsService = operatorsService;
        this.accessLevelsService = accessLevelsService;
        this.cardsService = cardsService;
        this.photosService = photosService;
    }
    @GetMapping("/")
    private String getInfo() {
        return "Система контроля и управления доступом. Lite - версия";
    }
    @PostMapping("/fromController")
    private void messageFromController(@RequestBody General general) {
        text = gson.toJson(general);
        logger.info(cardsService.findByCard(general.getCard_identifier()).getUsersEntity().getFirst_name());
        template.convertAndSend("Operator", text);
    }
}
