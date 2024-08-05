package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface CardsService {
    String createCard(CardsEntity entity);
    List<CardsEntity> readCards();
    CardsEntity readCard(Long id);
    String deleteCard(Long id);
    String updateCard(CardsEntity entity, Long id);
    CardsEntity findByCard(String card_id);
    CardsEntity findByUsersEntity(UsersEntity usersEntity);
}
