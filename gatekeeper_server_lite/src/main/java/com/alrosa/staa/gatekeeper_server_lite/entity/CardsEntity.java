package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 * Класс сущность для карт доступа
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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersEntity usersEntity;
    public CardsEntity() {}
    public CardsEntity(String card_id, UsersEntity usersEntity) {
        this.card_id = card_id;
        this.usersEntity = usersEntity;
    }
}
