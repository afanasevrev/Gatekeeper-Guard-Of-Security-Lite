package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "inspectors")
public class InspectorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "middle_name")
    private String middle_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "company")
    private String company;
    @Column(name = "organization")
    private String organization;
    @Column(name = "position")
    private String position;
    public InspectorsEntity() {}
    public InspectorsEntity(String first_name, String middle_name, String last_name, String login, String password, String company, String organization, String position) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.login = login;
        this.password = password;
        this.company = company;
        this.organization = organization;
        this.position = position;
    }
}
