package com.alrosa.staa.gatekeeper_server_lite.general;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LogsData {
    private String date;
    private String controllerName;
    private int direction;
    private String user;
    private String cardId;
    private boolean access;

}
