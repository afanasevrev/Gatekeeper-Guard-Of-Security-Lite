package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AccessLevelsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import java.util.List;
public interface AccessLevelsService {
    String createAccessLevel(AccessLevelsEntity entity);
    List<AccessLevelsEntity> readAccessLevels();
    AccessLevelsEntity readAccessLevel(Long id);
    String deleteAccessLevel(Long id);
    String updateAccessLevel(AccessLevelsEntity entity, Long id);
}
