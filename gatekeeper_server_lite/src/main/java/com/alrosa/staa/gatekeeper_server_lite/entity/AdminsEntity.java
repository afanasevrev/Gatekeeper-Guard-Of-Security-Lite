package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
 * Класс для администраторов для связи с БД
 */
@Getter
@Setter
@Entity
@Table(name = "admins")
public class AdminsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
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
    @Column(name = "position")
    private String position;
    public AdminsEntity(){}
    public AdminsEntity(String login, String password, String first_name, String middle_name, String last_name, String company, String organization, String position) {
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.company = company;
        this.organization = organization;
        this.position = position;
    }
}
