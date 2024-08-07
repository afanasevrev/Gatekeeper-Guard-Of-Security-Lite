package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
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
    private String accessLevelName;
    public AccessLevelsEntity(){}
    public AccessLevelsEntity(String accessLevelName) {
        this.accessLevelName = accessLevelName;
    }
}
