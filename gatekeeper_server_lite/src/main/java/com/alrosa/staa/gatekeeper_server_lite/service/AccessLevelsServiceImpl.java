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
        return accessLevelsRepository.findAll();
    }
    @Override
    public AccessLevelsEntity readAccessLevel(Long id) {
        return accessLevelsRepository.findById(id).get();
    }
    @Override
    public String deleteAccessLevel(Long id) {
        accessLevelsRepository.deleteById(id);
        return "уровень доступа с ID = " + id + " успешно удален из БД";
    }
    @Override
    public String updateAccessLevel(AccessLevelsEntity entity, Long id) {
        AccessLevelsEntity accessLevelsEntity = accessLevelsRepository.findById(id).get();
        accessLevelsEntity.setAccessLevelName(entity.getAccessLevelName());
        accessLevelsEntity.setControllers(entity.getControllers());
        return "уровень доступа с ID = " + id + " успешно обновлён";
    }
}
