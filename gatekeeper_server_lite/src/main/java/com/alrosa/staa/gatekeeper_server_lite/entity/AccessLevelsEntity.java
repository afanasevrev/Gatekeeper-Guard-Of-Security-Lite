package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "access_levels")
public class AccessLevelsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "access_level_name")
    private String access_level_name;
    public AccessLevelsEntity(){}
    public AccessLevelsEntity(String access_level_name) {
        this.access_level_name = access_level_name;
    }
}
