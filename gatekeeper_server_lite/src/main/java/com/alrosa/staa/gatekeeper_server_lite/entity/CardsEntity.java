package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 * Карты доступа для связи с БД
 */
@Getter
@Setter
@Entity
@Table(name = "cards")
public class CardsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "card_id")
    private String card_id;
    public CardsEntity() {}
    public CardsEntity(String card_id) {
        this.card_id = card_id;
    }
}
