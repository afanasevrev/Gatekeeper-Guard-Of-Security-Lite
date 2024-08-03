package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Photos {
    private Long id;
    private byte[] userPhoto;
    private Users user;
    public Photos() {}
    public Photos(Long id, byte[] photo, Users user) {
        this.id = id;
        this.userPhoto = userPhoto;
        this.user = user;
    }
}
