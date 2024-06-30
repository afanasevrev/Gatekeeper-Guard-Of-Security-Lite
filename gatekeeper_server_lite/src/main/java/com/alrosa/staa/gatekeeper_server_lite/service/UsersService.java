package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;

import java.util.List;

public interface UsersService {
    String createUser(UsersEntity entity);
    List<UsersEntity> readUsers();
    UsersEntity readUser(Long id);
    String deleteUser(Long id);
    String updateUser(UsersEntity entity, Long id);
}
