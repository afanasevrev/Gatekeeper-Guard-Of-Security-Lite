package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import java.util.List;
public interface CardsService {
    String createCard(CardsEntity entity);
    List<CardsEntity> readCards();
    CardsEntity readCard(Long id);
    String deleteCard(Long id);
    String updateCard(UsersEntity entity, Long id);
}
