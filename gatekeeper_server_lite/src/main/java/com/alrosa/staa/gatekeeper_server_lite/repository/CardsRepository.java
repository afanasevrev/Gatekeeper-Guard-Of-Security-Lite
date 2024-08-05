package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CardsRepository extends JpaRepository<CardsEntity, Long> {
   CardsEntity findByCardId(String cardId);
   CardsEntity findByUsersEntity(UsersEntity usersEntity);
}
