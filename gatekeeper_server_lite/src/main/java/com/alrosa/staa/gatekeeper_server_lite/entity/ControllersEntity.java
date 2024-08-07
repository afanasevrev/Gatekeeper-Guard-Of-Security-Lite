package com.alrosa.staa.gatekeeper_server_lite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "controllers")
public class ControllersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "controller_name")
    private String controllerName;
    @Column(name = "ip_address")
    private String ipAddress;
    public ControllersEntity() {}
    public ControllersEntity(String controllerName, String ipAddress) {
        this.controllerName = controllerName;
        this.ipAddress = ipAddress;
    }
}
