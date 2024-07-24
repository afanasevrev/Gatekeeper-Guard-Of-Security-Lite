package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.CardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CardsRepository extends JpaRepository<CardsEntity, Long> {
    //@Query("WHERE u FROM cards u WHERE u.card_id = :card_id")
    //CardsEntity findCardByCards(@Param("card_id") String card_id);
}
