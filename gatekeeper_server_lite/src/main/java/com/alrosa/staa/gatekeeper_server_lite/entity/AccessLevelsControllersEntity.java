package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "access_levels_controllers")
public class AccessLevelsControllersEntity {
    @ManyToMany()
    @JoinColumn(name = "access_level_id")
    private AccessLevelsEntity accessLevelsEntity;
    @ManyToMany()
    @JoinColumn(name = "controller_id")
    private ControllersEntity controllersEntity;

    public AccessLevelsControllersEntity() {}
    
    public AccessLevelsControllersEntity(AccessLevelsEntity accessLevelsEntity, ControllersEntity controllersEntity) {
        this.accessLevelsEntity = accessLevelsEntity;
        this.controllersEntity = controllersEntity;
    }
}
