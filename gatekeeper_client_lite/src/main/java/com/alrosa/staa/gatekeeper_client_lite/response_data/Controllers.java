package com.alrosa.staa.gatekeeper_client_lite.response_data;

public class Controllers {
    private String id;
    private String controllerName;
    private String ipAddress;
    public Controllers() {}
    public Controllers(String id, String controllerName, String ipAddress) {
        this.id = id;
        this.controllerName = controllerName;
        this.ipAddress = ipAddress;
    }
}
