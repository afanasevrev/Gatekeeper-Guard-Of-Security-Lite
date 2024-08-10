package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AccessLevels {
    private String id;
    private String access_level_name;
    public AccessLevels() {}
    public AccessLevels(String id, String access_level_name) {
        this.id = id;
        this.access_level_name = access_level_name;
    }
}
