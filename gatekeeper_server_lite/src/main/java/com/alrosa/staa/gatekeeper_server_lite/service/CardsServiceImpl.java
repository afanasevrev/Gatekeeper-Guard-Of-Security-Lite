package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class CardsServiceImpl implements CardsService {
    @Autowired
    private CardsRepository cardsRepository;
    @Override
    public String createCard(CardsEntity entity) {
        return null;
    }
    @Override
    public List<CardsEntity> readCards() {
        return null;
    }
    @Override
    public CardsEntity readCard(Long id) {
        return null;
    }
    @Override
    public String deleteCard(Long id) {
        return null;
    }
    @Override
    public String updateCard(UsersEntity entity, Long id) {
        return null;
    }
    /**
     *
     * @param card_id
     * @return
     */
    @Override
    public CardsEntity readCard(String card_id) {
        return null;
        //return cardsRepository.findCardByCards(card_id);
    }
}
