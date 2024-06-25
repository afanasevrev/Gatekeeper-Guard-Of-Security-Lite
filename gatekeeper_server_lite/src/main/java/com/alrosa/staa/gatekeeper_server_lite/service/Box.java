package com.alrosa.staa.gatekeeper_server_lite.service;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Box<T> {
    private T entity;
    public Box(T entity) {
        this.entity = entity;
    }
}
