package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.AdminsRepository;

import java.util.List;
/**
 * Класс для операций над таблицей "Admin" в БД
 */
public class AdminsServiceImpl implements AdminsService {
    private AdminsRepository adminsRepository;
    @Override
    public String createAdmin(AdminsEntity admin) {
        adminsRepository.save(admin);
        return "Администратор успешно добавлен в БД";
    }
    @Override
    public List<AdminsEntity> readAdmins() {
        return adminsRepository.findAll();
    }
    @Override
    public AdminsEntity readAdmin(Long id) {
        AdminsEntity admin = adminsRepository.findById(id).get();
        return admin;
    }
    @Override
    public String deleteAdmin(Long id) {
        return null;
    }
    @Override
    public String updateAdmin(AdminsEntity adminsEntity, Long id) {
        return null;
    }
}
