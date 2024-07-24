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
    private String cardId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UsersEntity usersEntity;
    public CardsEntity() {}
    public CardsEntity(String cardId, UsersEntity usersEntity) {
        this.cardId = cardId;
        this.usersEntity = usersEntity;
    }
}
