package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
/**
 * Класс для операций над таблицей "Admin" в БД
 */
public class AdminsServiceImpl implements AdminsService {
    @Autowired
    private AdminsRepository adminsRepository;
    /**
     * Метод добавляет нового администратора в БД
     * @param entity
     * @return Статус выполнения операции
     */
    @Override
    public String createAdmin(AdminsEntity entity) {
        adminsRepository.save(entity);
        return "Новый администратор успешно добавлен";
    }
    /**
     * Метод возвращает список администраторов из БД
     * @return List
     */
    @Override
    public List<AdminsEntity> readAdmins() {
       return adminsRepository.findAll();
    }
    /**
     * Метод возвращает администратора из БД по id
     * @param id
     * @return AdminsEntity
     */
    @Override
    public AdminsEntity readAdmin(Long id) {
        AdminsEntity admin = adminsRepository.findById(id).get();
        return admin;
    }
    /**
     * Метод удаляет администратора из БД по id
     * @param id
     * @return Статус выполнения операции
     */
    @Override
    public String deleteAdmin(Long id) {
        AdminsEntity adminsEntity = adminsRepository.findById(id).get();
        adminsRepository.delete(adminsEntity);
        return "Администратор с ID = " + id + " успешно удален из базы";
    }
    /**
     * Метод обновляет данные администратора по id
     * @param entity
     * @param id
     * @return Статус выполнения операции
     */
    @Override
    public String updateAdmin(AdminsEntity entity, Long id) {
        AdminsEntity adminsEntity = adminsRepository.findById(id).get();
        adminsEntity.setFirst_name(entity.getFirst_name());
        adminsEntity.setMiddle_name(entity.getMiddle_name());
        adminsEntity.setLast_name(entity.getLast_name());
        adminsEntity.setLogin(entity.getLogin());
        adminsEntity.setPassword(entity.getPassword());
        adminsEntity.setCompany(entity.getCompany());
        adminsEntity.setOrganization(entity.getOrganization());
        adminsEntity.setPosition(entity.getPosition());
        adminsRepository.save(adminsEntity);
        return "Администратор с ID = " + id + " успешно обновлён";
    }
}
