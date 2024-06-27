package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.AdminsRepository;
import java.util.List;
/**
 * Класс для операций над таблицей "Admin" в БД
 */
public class AdminsServiceImpl implements BoxService<AdminsEntity> {
    private AdminsRepository adminsRepository;
    @Override
    public String createBox(AdminsEntity entity) {
        adminsRepository.save(entity);
        return "Новый администратор успешно добавлен";
    }
    @Override
    public List<AdminsEntity> readBox() {
        return adminsRepository.findAll();
    }
    @Override
    public AdminsEntity readT(Long id) {
        AdminsEntity adminsEntity = adminsRepository.findById(id).get();
        return adminsEntity;
    }
    @Override
    public String deleteT(Long id) {
        AdminsEntity adminsEntity = adminsRepository.findById(id).get();
        adminsRepository.delete(adminsEntity);
        return "Администратор с ID = " + id + " успешно удален из базы";
    }
    @Override
    public String updateT(AdminsEntity entity, Long id) {
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
