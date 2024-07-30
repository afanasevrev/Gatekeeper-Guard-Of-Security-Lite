package com.alrosa.staa.gatekeeper_client_lite.general;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class General {
    private String currentDate;
    private String controllerName;
    private int direction;
    private String user;
    private String cardId;
    private boolean access;
    private byte[] photo;
    public General() {}
    public General(String currentDate, String controllerName, int direction, String user, String cardId, boolean access) {
        this.currentDate = currentDate;
        this.controllerName = controllerName;
        this.direction = direction;
        this.user = user;
        this.cardId = cardId;
        this.access = access;
    }
    public General(byte[] photo) {
        this.photo = photo;
    }
}
