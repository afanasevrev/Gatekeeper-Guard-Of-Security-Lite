package com.alrosa.staa.gatekeeper_server_lite.general;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PhotoData {
    private MessageType messageType;
    private byte[] photo;
    public PhotoData() {}
    public PhotoData(byte[] photo, MessageType messageType) {
        this.photo = photo;
        this.messageType = messageType;
    }
}
