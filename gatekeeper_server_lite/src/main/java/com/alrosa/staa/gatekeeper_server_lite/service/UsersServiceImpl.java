package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * Класс для взаимодействия с пользователями в БД
 */
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    /**
     * Метод добавляет нового пользователя в БД
     * @param entity
     * @return Статус выполнения операции
     */
    @Override
    public String createUser(UsersEntity entity) {
        usersRepository.save(entity);
        return "Новый пользователь успешно добавлен";
    }
    /**
     * Метод возвращает список пользователей из БД
     * @return List
     */
    @Override
    public List<UsersEntity> readUsers() {
        return usersRepository.findAll();
    }
    /**
     * Метод возвращает пользователя из БД по id
     * @param id
     * @return UsersEntity
     */
    @Override
    public UsersEntity readUser(Long id) {
        UsersEntity user = usersRepository.findById(id).get();
        return user;
    }
    /**
     * Метод удаляет из БД пользователя по id
     * @param id
     * @return Статус выполнения операции
     */
    @Override
    public String deleteUser(Long id) {
        UsersEntity user = usersRepository.findById(id).get();
        usersRepository.delete(user);
        return "Пользователь с ID = " + id + " удален из базы";
    }
    /**
     * Метод обновляет данные пользователя по id
     * @param entity UsersEntity
     * @param id int
     * @return Статус выполнения операции
     */
    @Override
    public String updateUser(UsersEntity entity, Long id) {
        UsersEntity user = usersRepository.findById(id).get();
        user.setFirst_name(entity.getFirst_name());
        user.setMiddle_name(entity.getMiddle_name());
        user.setLast_name(entity.getLast_name());
        user.setCompany(entity.getCompany());
        user.setOrganization(entity.getOrganization());
        usersRepository.save(user);
        return "Пользователь с ID = " + id + " успешно обновлён";
    }
}
