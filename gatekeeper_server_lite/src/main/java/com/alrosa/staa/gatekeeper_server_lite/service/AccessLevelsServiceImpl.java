package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AccessLevelsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.AccessLevelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AccessLevelsServiceImpl implements AccessLevelsService {
    @Autowired
    private AccessLevelsRepository accessLevelsRepository;
    @Override
    public String createAccessLevel(AccessLevelsEntity entity) {
        accessLevelsRepository.save(entity);
        return "Уровень доступа успешно добавлен в БД";
    }
    @Override
    public List<AccessLevelsEntity> readAccessLevels() {
        return null;
    }
    @Override
    public AccessLevelsEntity readAccessLevel(Long id) {
        return null;
    }
    @Override
    public String deleteAccessLevel(Long id) {
        return null;
    }
    @Override
    public String updateAccessLevel(AccessLevelsEntity entity, Long id) {
        return null;
    }
}
