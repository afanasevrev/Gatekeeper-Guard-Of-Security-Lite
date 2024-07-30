package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardsServiceImpl implements CardsService {
    @Autowired
    private CardsRepository cardsRepository;
    @Override
    public String createCard(CardsEntity entity) {
        cardsRepository.save(entity);
        return "Карта доступа успешно сохранена в БД";
    }
    @Override
    public List<CardsEntity> readCards() {
        return cardsRepository.findAll();
    }
    @Override
    public CardsEntity readCard(Long id) {
        return cardsRepository.findById(id).get();
    }
    @Override
    public String deleteCard(Long id) {
        return "Карта доступа с ID = " + id + " успешно удалён из БД";
    }
    @Override
    public String updateCard(CardsEntity entity, Long id) {
        CardsEntity card = cardsRepository.findById(id).get();
        card.setUsersEntity(entity.getUsersEntity());
        card.setCardId(entity.getCardId());
        cardsRepository.save(card);
        return "Карта доступа с ID = " + id + " успешно обновлена";
    }
    @Override
    public CardsEntity findByCard(String cardId) {
        return cardsRepository.findByCardId(cardId);
    }
}
