package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.UsersRepository;
import java.util.List;
/**
 * Класс для взаимодействия с пользователями в БД
 */
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
        UsersEntity user = usersRepository.findById(id).get();
        usersRepository.delete(user);
        return "Пользователь с ID = " + id + " удален из базы";
    }
    @Override
    public String updateT(UsersEntity entity, Long id) {
        UsersEntity user = usersRepository.findById(id).get();
        user.setFirst_name(entity.getFirst_name());
        user.setMiddle_name(entity.getMiddle_name());
        user.setLast_name(entity.getLast_name());
        user.setCompany(entity.getCompany());
        user.setOrganization(entity.getOrganization());
        usersRepository.save(user);
        return "Обновление пользователя успешно обновлено";
    }
}
