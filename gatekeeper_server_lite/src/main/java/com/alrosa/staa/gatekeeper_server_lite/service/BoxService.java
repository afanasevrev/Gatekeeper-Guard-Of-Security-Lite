package com.alrosa.staa.gatekeeper_server_lite.service;

import java.util.List;

public interface BoxService<T> {
    String createBox(Box<T> entity);
    List<T> readBox();
}
