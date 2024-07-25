package com.alrosa.staa.gatekeeper_server_lite.general;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LogsData {
    private String currentDate;
    private String controllerName;
    private int direction;
    private String user;
    private String cardId;
    private boolean access;
    public LogsData() {}
    public LogsData(String currentDate, String controllerName, int direction, String user, String cardId, boolean access) {
        this.currentDate = currentDate;
        this.controllerName = controllerName;
        this.direction = direction;
        this.user = user;
        this.cardId = cardId;
        this.access = access;
    }
}
