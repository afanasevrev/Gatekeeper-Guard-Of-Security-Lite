package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Cards {
    private Long id;
    private String cardId;
    private Users users;
    public Cards() {}
    public Cards(Long id, String cardId, Users users) {
        this.id = id;
        this.cardId = cardId;
        this.users = users;
    }
}
