package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 * Класс сущность для пользователей
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "middle_name")
    private String middle_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "company")
    private String company;
    @Column(name = "organization")
    private String organization;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "photo_id")
    private PhotosEntity photosEntity;
    public UsersEntity() {}
    public UsersEntity(String first_name, String middle_name, String last_name, String company, String organization, PhotosEntity photosEntity) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.company = company;
        this.organization = organization;
        this.photosEntity = photosEntity;
    }
    @Override
    public String toString() {
        return this.middle_name + " " + this.first_name + " " + this.last_name;
    }
}
