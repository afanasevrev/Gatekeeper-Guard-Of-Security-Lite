package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.UsersRepository;
import java.util.List;
public class UsersServiceImpl implements BoxService<UsersEntity> {
    private UsersRepository usersRepository;
    @Override
    public String createBox(UsersEntity entity) {
        usersRepository.save(entity);
        return "Пользователь успешно добавлен";
    }
    @Override
    public List<UsersEntity> readBox() {
        return usersRepository.findAll();
    }
    @Override
    public UsersEntity readT(Long id) {
        UsersEntity user = usersRepository.findById(id).get();
        return user;
    }
    @Override
    public String deleteT(Long id) {

        return null;
    }
}
