package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "access_levels_controllers")
public class AccessLevelsControllersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "controller_id")
    private String controller_id;
    @Column(name = "access_level_id")
    private String access_level;
    public AccessLevelsControllersEntity() {}

}
