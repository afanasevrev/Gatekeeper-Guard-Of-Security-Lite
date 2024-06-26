package com.alrosa.staa.gatekeeper_server_lite.service;

import java.util.List;
public interface BoxService<T> {
    String createBox(T entity);
    List<T> readBox();
    T readT(Long id);
}
