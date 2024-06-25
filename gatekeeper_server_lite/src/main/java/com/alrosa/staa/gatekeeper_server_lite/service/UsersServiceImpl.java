package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.UsersRepository;

import java.util.List;

public class UsersServiceImpl implements BoxService<UsersEntity> {
    private UsersRepository usersRepository;
    @Override
    public String createBox(Box<UsersEntity> entity) {
        usersRepository.save(entity.getEntity());
        return "Пользователь успешно добавлен";
    }
    @Override
    public List<UsersEntity> readBox() {
        return usersRepository.findAll();
    }
}
