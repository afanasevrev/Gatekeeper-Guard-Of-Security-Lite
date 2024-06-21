package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import java.util.List;
public interface AdminsService {
    String createAdmin(AdminsEntity admin);
    List<AdminsEntity> readAdmins();
    AdminsEntity readAdmin(Long id);
    String deleteAdmin(Long id);
    String updateAdmin(AdminsEntity adminsEntity, Long id);
}
