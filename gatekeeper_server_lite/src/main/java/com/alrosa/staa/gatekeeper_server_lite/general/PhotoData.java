package com.alrosa.staa.gatekeeper_server_lite.general;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PhotoData {
    private byte[] photo;
    public PhotoData() {}
    public PhotoData(byte[] photo) {
        this.photo = photo;
    }
}
