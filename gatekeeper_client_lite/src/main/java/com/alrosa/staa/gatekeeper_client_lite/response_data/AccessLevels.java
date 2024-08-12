package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AccessLevels {
    private String id;
    private String accessLevelName;
    public AccessLevels() {}
    public AccessLevels(String id, String accesslevelName) {
        this.id = id;
        this.accessLevelName = accessLevelName;
    }
}
