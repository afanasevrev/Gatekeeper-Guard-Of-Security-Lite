package com.alrosa.staa.gatekeeper_client_lite.response_data;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Users {
    private Long id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String company;
    private String organization;
    private byte[] photo;
    private String cardId;
    public Users() {}
    public Users(Long id, String first_name, String middle_name, String last_name, String company, String organization, byte[] photo, String cardId) {
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.company = company;
        this.organization = organization;
        this.photo = photo;
        this.cardId = cardId;
    }
}
