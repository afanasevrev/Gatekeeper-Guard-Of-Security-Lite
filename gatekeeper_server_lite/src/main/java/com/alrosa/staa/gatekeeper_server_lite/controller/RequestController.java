package com.alrosa.staa.gatekeeper_server_lite.controller;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.general.General;
import com.alrosa.staa.gatekeeper_server_lite.general.LogsData;
import com.alrosa.staa.gatekeeper_server_lite.general.MessageType;
import com.alrosa.staa.gatekeeper_server_lite.general.PhotoData;
import com.alrosa.staa.gatekeeper_server_lite.service.*;
import com.google.gson.Gson;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Контроллер, отвечает на запросы от клиентов
 */
@RestController
public class RequestController {
    @Autowired
    private AmqpTemplate template;
    private Gson gson = new Gson();
    //Получаем текущую дату
    private Date currentDate;
    //Форматируем дату по своему усмотрению
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    //Отформатированную дату отправляем клиенту
    private String formattedDate;
    private String text;
    private String textPhoto;
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
        if (general.getMessageType() == MessageType.OPERATOR) {
            currentDate = new Date();
            formattedDate = simpleDateFormat.format(currentDate);
            String user;
            UsersEntity usersEntity = cardsService.findByCard(general.getCardId()).getUsersEntity();
            PhotoData photoData = null;
            try {
                user = usersEntity.toString();
                photoData = new PhotoData(usersEntity.getPhotosEntity().getUserPhoto());
                textPhoto = gson.toJson(photoData);
            } catch (NullPointerException e) {
                user = "Неизвестный пользователь";
            }
            LogsData logsData = new LogsData(general.getCurrentDate(), general.getIpAddress(), general.getDirection(), user, general.getCardId(), general.isAccess());
            text = gson.toJson(logsData);
            template.convertAndSend("Operator", text);
            if (photoData != null) {
                template.convertAndSend("Operator", textPhoto);
            }
        }
    }
}
