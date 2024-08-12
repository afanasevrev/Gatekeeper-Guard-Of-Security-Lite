package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AccessLevels {
    private String id;
    private String accessLevelName;
    private Set<Controllers> controllers;
    public AccessLevels() {}
    public AccessLevels(String id, String accessLevelName) {
        this.id = id;
        this.accessLevelName = accessLevelName;
    }
}
